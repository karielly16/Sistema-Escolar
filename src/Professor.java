public class Professor extends SQLClass{
    @Key
    int id;
    String nome;
    String cpf;
    String materia;
    String idade;

    Professor(){
        this.setTableName("professor");
    }
}
