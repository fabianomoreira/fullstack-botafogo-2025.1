class Carro {
  int? velocidadeMaxima;
  int velocidadeAtual = 0;

  Carro(int velocidadeMaxima){
    this.velocidadeMaxima = velocidadeMaxima;
  }

  void acelerar(int valor){
    this.velocidadeAtual += valor;

    estaNoLimite();
  }

  void frear(int valor){
    this.velocidadeAtual -= valor;

    if(this.velocidadeAtual < 0){
      this.velocidadeAtual = 0;
    }

    exibirStatus();
  }

  void estaNoLimite(){
    if(this.velocidadeAtual >= this.velocidadeMaxima!){
      this.velocidadeAtual = this.velocidadeMaxima!;
    }

    exibirStatus();
  }

  void exibirStatus(){
    print('O carro está andando a ${this.velocidadeAtual} km/h');
  }

  String toString(){
    return this.velocidadeMaxima.toString();
  }
}