class Pessoa {
  String nome;
  int idade;
  String cpf;

  public Pessoa(String nome, int idade, String cpf)
  {
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
  }

  public void setNome(String nome)
  {
    this.nome = nome;
  }

  public void setIdade(int idade)
  {
    this.idade = idade;
  }

  public void setCpf(String cpf)
  {
    this.cpf = cpf;
  }
}