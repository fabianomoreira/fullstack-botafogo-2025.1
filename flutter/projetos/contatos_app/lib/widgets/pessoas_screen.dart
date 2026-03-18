import 'package:contatos_app/widgets/pessoas_form.dart';
import 'package:contatos_app/widgets/pessoas_list.dart';
import 'package:flutter/material.dart';


class PessoasScreen extends StatefulWidget {
  @override
  _PessoasScreenState createState() => _PessoasScreenState();
}

class _PessoasScreenState extends State<PessoasScreen> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Cadastro de Pessoas')),
      body: Padding(
        padding: EdgeInsets.all(16.0),
        child: Column(
          children: [
            PessoasForm(onSaved: () => setState(() {})),
            SizedBox(height: 20),
            PessoasList(),  // Widget simples
          ],
        ),
      ),
    );
  }
}