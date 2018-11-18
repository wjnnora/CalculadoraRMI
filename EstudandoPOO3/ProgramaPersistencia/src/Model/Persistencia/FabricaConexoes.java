package Model.Persistencia;


import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexoes {
    
    
    public static Connection getConnection(){
    
        String stringMySQL = "jdbc:mysql://localhost:3306/aula";
        String usuario = "root";
        String senha = "";
        
        //tentar estabelecer conexao
        Connection conexao = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");//Registrar o driver
            conexao =  DriverManager.getConnection(stringMySQL, usuario, senha);
            return conexao;
        }catch(Exception e)
        {
            return null ;
        }     
    } 
}

