

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//scanner
//import java.util.Scanner;


public class MySQLORM extends Main{
    protected String id_field = "id int NOT NULL AUTO_INCREMENT";

    static String nomeTabela = "sistema_escolar";
    static String usuario = "root";
    static String senha = "123456";
    static String baseUrl = "jdbc:mysql://localhost:3306/";

    public Connection conectar(){
        Connection conn = null;
        String url = baseUrl + nomeTabela +"?user="+usuario+"&password=" + senha + "&useSSL=false";
        try{
            conn = DriverManager.getConnection(url);
            return conn;
        }
        catch(SQLException e){
            String msgErro = e.getMessage();
            System.out.println(msgErro);
            System.out.println("Ocorreu um erro ao tentar conectar ao banco de dados");
           
            return null;
        }
    }
    public void createDB(){
        System.out.println("Criando banco...");
        try{
            Connection conn = DriverManager.getConnection(baseUrl +"?user="+usuario+"&password=" + senha + "&useSSL=false");
            java.sql.Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE DATABASE "+ this.nomeTabela);
            System.out.println("Banco criada com sucesso!");
        } catch(SQLException e){
            System.out.println("Ocorreu um erro ao tentar criar o banco de dados");
            System.out.println(e.getMessage());
        }
    }        
    protected String implode(String[] array){
        String result = "";
        for(int i = 0; i < array.length; i++){
            result += array[i];
            if(i < array.length - 1){
                result += ", ";
            }
        }
        return result;
    }
    protected String implodeVals(String[] array){
        String result = "";
        for(int i = 0; i < array.length; i++){
            if(array[i].getClass() == String.class){
                System.out.println("String");
                result += "'"+array[i]+"'";
            } else {
                System.out.println("Não é string");
                result += array[i];
            }
            if(i < array.length - 1){
                result += ", ";
            }
        }
        return result;
    }
    protected void tableGenerator(String tableName, String[] fields){
        try{
            Connection conn = this.conectar();
            if(conn == null){
                System.out.println("Não foi possível conectar ao banco de dados");
                return;
            }
            java.sql.Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE "+ tableName +" (" + id_field +", " + this.implode(fields) + ", PRIMARY KEY (id))");
            System.out.println("Tabela " + tableName + " criada com sucesso!");

            
        } catch(SQLException e){
            System.out.println("Ocorreu um erro ao tentar criar a tabela: " + tableName);
            System.out.println(e.getMessage());
            
        }
    }
    protected void migrate(){
        Tables tables = new Tables();
        tables.all();
    }
    public void dropDB(){
        try{
            Connection conn = this.conectar();
            if(conn != null){
                java.sql.Statement stmt = conn.createStatement();
                stmt.executeUpdate("DROP DATABASE "+ nomeTabela);
                System.out.println("Banco deletado com sucesso!");
            }
        } catch(SQLException e){
            System.out.println("Ocorreu um erro ao tentar deletar o banco de dados");
            System.out.println(e.getMessage());
        }
    }
    public static void executeQuery(String query){
        try{
            Connection conn = DriverManager.getConnection(baseUrl + nomeTabela +"?user="+usuario+"&password=" + senha + "&useSSL=false");
            java.sql.Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Query executada com sucesso!");
        } catch(SQLException e){
            System.out.println("Ocorreu um erro ao tentar executar a query");
            System.out.println(e.getMessage());
        }
    }
}