package Model.Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Model.Data.Aluno;

public class DAOAluno {

    public void salvar(Aluno aluno) throws SQLException {

        //estabelecer a conexao
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        conexao = FabricaConexoes.getConnection();
        try {
            instrucaoSQL = conexao.prepareStatement("Insert into Aluno(nome, ra) Values(?,?)");
            //inserir dados
            instrucaoSQL.setString(1, aluno.getNome());
            instrucaoSQL.setString(2, aluno.getRa());
            instrucaoSQL.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException("Comando SQL nao executado!" + "\n incorreto" + e.getMessage());
        } finally {
            //FECHAR    
            if (instrucaoSQL != null) {
                instrucaoSQL.close();
            }
            if (conexao != null) {
                conexao.close();
            }
        }
    }
    
    public ArrayList<Aluno> pesquisaTodos() throws SQLException{
        ArrayList<Aluno> resultado = new ArrayList<Aluno>();
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        
        try{
            conexao = FabricaConexoes.getConnection();
            if(conexao !=null){
                comandoSQL = conexao.prepareStatement(
                                "select id,nome,ra from aluno");
                ResultSet resultadoDaConsulta = comandoSQL.executeQuery();
                
                while(resultadoDaConsulta.next())
                {
                    Aluno aluno = new Aluno(resultadoDaConsulta.getInt(1), 
                                            resultadoDaConsulta.getString(2), 
                                            resultadoDaConsulta.getString(3));
                    resultado.add(aluno);
                }
            }
            else{
                throw new SQLException("Não foi possivel estabelecer a conexão.");
            }
            
            if(comandoSQL!=null)
                comandoSQL.close();
            if(conexao!=null){
                conexao.close();
            }
        }
        catch(SQLException erro){
            throw new SQLException("Não foi possivel realizar a consulta!\n" + erro.getMessage());
        }
        return resultado;
    }
}
