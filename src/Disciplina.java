public class Disciplina extends SQLClass{

    @Key
    int id;
    String nome;

    Disciplina(){
        this.setTableName("disciplina");
    }
    
}