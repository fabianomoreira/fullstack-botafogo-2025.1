import 'package:contatos_app/models/pessoa.dart';
import 'package:contatos_app/services/api_service.dart';
import 'package:flutter/material.dart';

class PessoasForm extends StatefulWidget {
  final VoidCallback onSaved;

  const PessoasForm({Key? key, required this.onSaved}) : super(key: key);
  
  @override
  _PessoasFormState createState() => _PessoasFormState();
}

class _PessoasFormState extends State<PessoasForm> {
  final _formKey = GlobalKey<FormState>();
  final _nomeController = TextEditingController();
  final _cidadeController = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Form(
      key: _formKey,
      child: Column(
        children: [
          TextFormField(
            controller: _nomeController,
            decoration: InputDecoration(labelText: 'Nome'),
            validator: (value) => value?.isEmpty??true?'Nome obrigatório':null,
          ),
          SizedBox(height: 10),
          TextFormField(
            controller: _cidadeController,
            decoration: InputDecoration(labelText: 'Cidade'),
            validator: (value) => value?.isEmpty??true?'Cidade obrigatória':null,
          ),
          SizedBox(height: 20),
          ElevatedButton(onPressed: _salvar, child: Text('Salvar Pessoa'))
        ],
      ),
    );
  }

  Future<void> _salvar() async {
    if(_formKey.currentState!.validate()){
      try{
        final pessoa = Pessoa(nome: _nomeController.text, cidade: _cidadeController.text, id: 0);
        await ApiService.createPessoa(pessoa);
        ScaffoldMessenger.of(context).showSnackBar(SnackBar(content: Text('Pessoa Salva!')));
        _nomeController.clear();
        _cidadeController.clear();
        widget.onSaved();
      } catch(e){
        ScaffoldMessenger.of(context).showSnackBar(SnackBar(content: Text('Erro : $e')));
      }
    }
  }

  @override
  void dispose(){
    _nomeController.dispose();
    _cidadeController.dispose();
    super.dispose();
  }
}