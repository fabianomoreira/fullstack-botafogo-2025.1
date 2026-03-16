class Pessoa{
  final int id;
  final String nome;
  final String cidade;

  Pessoa({required this.id, required this.nome, required this.cidade});

  factory Pessoa.fromJson(Map<String, dynamic> json){
    return Pessoa(
      id: json['id'] as int,
      nome: json['nome'] as String,
      cidade: json['cidade'] as String
    );
  }

  Map<String, dynamic> toJson(){
    return {
      'nome': nome,
      'cidade': cidade
    };
  }
}