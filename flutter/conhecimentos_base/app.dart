import 'pessoa.dart';

main(){
  var cidadao = Pessoa("Joaquim", "José", 54);

  print(cidadao);

  print(cidadao.idade);
  cidadao.idade = 67;

  print(cidadao);
}