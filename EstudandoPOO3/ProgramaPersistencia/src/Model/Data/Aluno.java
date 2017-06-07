package Model.Data;

public class Aluno {
    
    private int id;
    private String nome;
    private String ra;
    
    //sobrecarga de construtores
    //construtor para cadastro
    public Aluno(String nome, String ra){
    
        this.nome = nome;
        this.ra = ra;
        
    }
    
    //construtor para pesquisa
    public Aluno(int id, String nome, String ra){
        this(nome,ra);
        this.id = id;        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    
    public String toString(){
        return "RA: " + getRa() +" Nome: " + getNome()+ "\n" ;
    }
    
}

