main(){
  saudacao(
           idade: 45, 
           nome: 'Joaquim'
          );
}

void saudacao({String nome = 'Zé ninguém', int idade = 0}){
  print('Olá $nome você não parece ter $idade anos.');
}