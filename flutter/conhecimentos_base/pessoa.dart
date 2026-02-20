class Pessoa {
  String nome = '';
  String sobrenome = '';
  int _idade = 0;

  Pessoa(String nome, String sobrenome, int idade){
    this.nome = nome;
    this.sobrenome = sobrenome;
    this._idade = idade;
  }

  void set idade(int idade){
    this._idade = idade; 
  }

  int get idade{
    return this._idade;
  }

  String toString(){
    return "$nome $sobrenome tem $_idade anos.";
  }
}