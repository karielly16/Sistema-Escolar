public class Turma extends SQLClass{
  @Key
  String codigo;
  String nome;
  String curso;
  String serie;
  String periodo;
  String turno;

  Turma(){
    this.setTableName("turma");
  }
}