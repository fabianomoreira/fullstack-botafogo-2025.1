/*
  implementação de classes em DART
*/
class Data {
  int dia = 0;
  int mes = 0;
  int ano = 0;

  Data([int dia = 0, int mes = 0, int ano = 0]){
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  String obterData(){
    return "$dia/$mes/$ano";
  }

  String toString(){
    return obterData();
  }
}

main() {
  var dataAniversario = new Data(08, 11, 1973);

  print(dataAniversario);

  var dataCarnaval = Data(13, 02, 2026);

  print(dataCarnaval.obterData());

  var dataMoacyr = Data(15);
  print(dataMoacyr);
  print(dataMoacyr.dia);
}