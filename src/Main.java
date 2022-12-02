import java.sql.Connection;


public class Main {
    
    public static void main(String[] args) {
        String[] opcoes = {
            "[1]-Logar como usuario",
            "[2]-Logar como administrador"
        };
        String acao = Prompter.prompt("O que deseja fazer agora?" + Prompter.listGen(opcoes));
        if(acao.equals("1")){
            System.out.println("Logando como usuario...");
            logarUsuario();
        } else if(acao.equals("2")){
            System.out.println("Logando como administrador...");
            logarAdmin();
        } else {
            System.out.println("Opção inválida!");
        }
    }
    private static void logadoADM(){        
        String[] opcoes = {
            "[1]-Deletar Banco",
            "[2]-Migrar Banco",
            "[3]-Conectar ao Banco",
            "[4]-Criar Banco",
            "[5]-Inserir um dado",
        };
        String prompt = Prompter.prompt("Olá, admin! O que deseja fazer nesse momento?"+ Prompter.listGen(opcoes));
        MySQLORM mysql = new MySQLORM();
        if(prompt.equals("1")){
            mysql.dropDB();
        }
        else if(prompt.equals("2")){
            mysql.migrate();
        }
        else if(prompt.equals("3")){
            Connection conn = mysql.conectar();
            System.out.println(conn);
        }
        else if(prompt.equals("4")){
            mysql.createDB();
        }
        else if(prompt.equals("5")){
            QueryGenerator query = new QueryGenerator("matriz_serie");
            String[] values = {"2", "5"};
            String[] campos = {"matriz", "serie"};
            String sql = query.insert(campos, values);
            System.out.println(sql);
            MySQLORM.executeQuery(sql);
        }
        /* else{
            System.out.println("Opção inválida!");
        } */
        else{
            System.out.println("Opção inválida");
        }
        logadoADM();
    }

    private static void logarUsuario(){
        System.out.println("Ainda não implementado");
        throw new UnsupportedOperationException("Não implementado");
    }
    private static void logarAdmin(){
        String usuarioEntrado = Prompter.prompt("Digite o nome de usuário");
        String senhaEntrado = Prompter.prompt("Digite a senha do administrador");
        String usuarioCorretor = "admin";
        String senhaCorreta = "admin";
        if(usuarioEntrado.equals(usuarioCorretor) && senhaEntrado.equals(senhaCorreta)){
            System.out.println("Logado com sucesso!");
            logadoADM();
        } else {
            System.out.println("Usuário ou senha incorretos!");
        }


    }
}
