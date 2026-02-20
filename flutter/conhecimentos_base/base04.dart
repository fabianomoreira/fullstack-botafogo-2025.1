main(){
  // notação ponto (.)

  double nota = 6.59.roundToDouble();

  print(nota);

  print("Este é um texto para mostrar algo.".toUpperCase());

  String s1 = "Fabiano Moreno";
  String s2 = s1.toUpperCase();
  String s3 = s2.substring(0,7);
  String s4 = s3.padRight(15, "!");

  print(s4);

  print("Fabiano Moreno".toUpperCase()
                        .substring(0,7)
                        .padRight(15, "!").length);

  // Operadores lógicos

  bool ehFragil = true;
  bool ehCaro = false;

  print(ehFragil && ehCaro);
  print(ehFragil || ehCaro);
  print(ehFragil ^ ehCaro);
  print(!ehFragil);

  // Interpolação
  String nome = "Moacyr";
  String status = "Aprovado";
  double media = 9;

  String frase1 = nome + " está " + status + " pq tirou " + media.toString();
  String frase2 = "$nome está $status pq tirou $media";

  print(frase1);
  print(frase2);
}