import 'classe/carro.dart';

main(){
  int contador = 0;

  Carro carroGol = Carro(160);

  print(carroGol);

  while(contador < 15){
    carroGol.acelerar(15);
    contador += 1;
  }
  contador = 0;
   while(contador < 30){
    carroGol.frear(7);
    contador += 1;
  }
}
