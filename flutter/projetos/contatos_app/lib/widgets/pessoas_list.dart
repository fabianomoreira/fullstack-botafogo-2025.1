import 'package:contatos_app/models/pessoa.dart';
import 'package:contatos_app/services/api_service.dart';
import 'package:flutter/material.dart';

class PessoasList extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Expanded(
      child: FutureBuilder<List<Pessoa>>(
        future: ApiService.getPessoas(), 
        builder: (context, snapshot){
          if (snapshot.connectionState == ConnectionState.waiting){
            return Center(child: CircularProgressIndicator());
          } else if(snapshot.hasError){
            return Center(child: Text('Erro : ${snapshot.error}'));
          } else if(!snapshot.hasData || snapshot.data!.isEmpty){
            return Center(child: Text('Nenhuma pessoa cadastrada!'));
          }
          final pessoas = snapshot.data!;
          return ListView.builder(
            itemCount: pessoas.length,
            itemBuilder: (context, index){
              final pessoa = pessoas[index];
              return ListTile(
                title: Text(pessoa.nome),
                subtitle: Text(pessoa.cidade),
                leading: CircleAvatar(child: Text('${pessoa.id}')),
              );
            }
          );
        }
      ),
    );
  }
}