import 'dart:io';

main(){
  Map<int, int> votos = {1 : 0, 2 : 0, 3 : 0};

  print('=== Urna simples (Dart CLI) ===');
  print('1 - Batatinha, 2 - Cruz Credo, 3 - Romário');
  print('Digite o número do candidato:');
  print('Digite zero para encerrar e ver o resultado');

  while(true){
    stdout.write('Digite seu voto : ');
    String entrada = stdin.readLineSync()!;

    final voto = int.tryParse(entrada);

    if (voto == null){
      print("Voto inválido!");
      continue;
    }

    if (voto == 0){
      break;
    }

    if(!votos.containsKey(voto)){
      print('Candidato inválido');
      continue;
    }

    // contabiliza voto
    votos[voto!] = votos[voto]! + 1;
  }
  print(votos);
}