public class Tables extends MySQLORM{
    
    private void pessoa(){
        String[] fields = {
            "nome varchar(255)",
            "cpf varchar(255)",
            "idade varchar(255)",
            "serie varchar(255)",
            "turma varchar(255)",
        };
        this.tableGenerator("pessoa", fields);
    }
    private void professor(){
        String[] fields = {
            "nome varchar(250)",
            "idade int",
            "cpf varchar(250)",
            "materia varchar(250)"
        };
        this.tableGenerator("professor", fields);
    }
    private void matricula(){
        String[] fields = {
            "codigo varchar(250)",
            "aluno varchar(250)",
            "classe varchar(255)",
            "situacao varchar(255)",
        };
        this.tableGenerator("matricula", fields);
    }
    private void disciplina(){
        String[] fields= {
            "nome varchar(250)",
        };
        this.tableGenerator("disciplina", fields);
    }
    private void turma(){
        String[] fields = {
            "codigo varchar(255)",
            "nome varchar(255)",
            "curso varchar(255)",
            "serie varchar(255)",
            "periodo varchar(255)",
            "turno varchar(255)",
        };
        this.tableGenerator("turma", fields);
    }
    private void login(){
        String[] fields = {
            "usuario varchar(500) NOT NULL",
            "senha varchar(255) NOT NULL",
        };
        this.tableGenerator("login", fields);
    }
    //public function to call ALL the above functions
    public void all(){
        this.pessoa();
        this.professor();
        this.matricula();
        this.disciplina();
        this.turma();
        this.login();
    }

}
