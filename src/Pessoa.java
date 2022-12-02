public class Pessoa extends SQLClass{
    @Key
    int id;
    String nome;
    String cpf;
    String idade;
    String serie;
    String turma;

    Pessoa(){
        this.setTableName("pessoa");
    }
}
