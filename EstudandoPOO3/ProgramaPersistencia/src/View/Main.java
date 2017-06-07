package View;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import Model.Data.Aluno;
import Model.Persistencia.DAOAluno;
import Model.Persistencia.FabricaConexoes;


public class Main {
 
    public static void main(String args[]){
   // tentar estabelecer conexao
    Connection conexao = FabricaConexoes.getConnection();
    
    //criando o dao
    DAOAluno daoAluno = new DAOAluno();
    
    if(conexao == null){
        JOptionPane.showMessageDialog(null, "Parametros incorretos!"
                        + "\nConexao estabelecida!");
        try{
            conexao.close();
        }catch(SQLException e){
         JOptionPane.showMessageDialog(null, "Operaçcão Ilegal!"
                 + "\n Conexao Encerrada"
                 + e.getMessage()  );
        }      
    }
    
    //Exemplo de alteraçao
    Aluno aluno = new Aluno("Maria", "1234-5");
    try{
        daoAluno.salvar(aluno);
        JOptionPane.showMessageDialog( null,
            "Cadastro efetuado!");
    }catch(SQLException e){
                JOptionPane.showMessageDialog( null,
                         e.getMessage());
    }
    
    try{
    ArrayList<Aluno> alunos = daoAluno.pesquisaTodos();
    
    if(alunos.isEmpty())
    {
        JOptionPane.showMessageDialog(null,"Não há alunos cadastrados!");
    }
    else{
        JOptionPane.showMessageDialog(null,"Há " + alunos.size() + " aluno" + (alunos.size()>1?"s":"") + "!");
    }
    StringBuilder sb = new StringBuilder();
    for (Aluno aluno2 : alunos) {
        sb.append(aluno2.toString());
    }
    JOptionPane.showMessageDialog(null,sb);
//    for(Iterator it = alunos.iterator();it.hasNext();){
//        Aluno aluno2 = (Aluno) it.next();
//        System.out.println("");
//    }
    
    }
    catch(SQLException ex){
        JOptionPane.showInputDialog(ex.getMessage());
    }
   }
}
