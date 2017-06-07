package Controller;

import java.sql.SQLException;
import Model.Data.Aluno;
import Model.Persistencia.DAOAluno;

public class Controller {

    //metodo para persistir na tabela Aluno
    public void salvar(Aluno aluno) throws SQLException {

        //instanciar o DAO responsavel
        DAOAluno daoAluno = new DAOAluno();
        daoAluno.salvar(aluno);

    }

}
