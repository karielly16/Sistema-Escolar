public class Matriculas extends SQLClass{
  @Key
  String codigo;
  String aluno;
  String classe;
  String situacao;

  Matriculas(){
    this.setTableName("matricula");
  }
}