import 'dart:io';

main(List<String> args) {
  const PI = 3.1416;

  stdout.write("digite o valor do raio: ");
  var entrada = stdin.readLineSync();

  final double raio = double.parse(entrada!);

  var area = PI * raio * raio;

  print(area);
  print(args[1]);
}