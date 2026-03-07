import 'package:flutter/material.dart';

class Resposta extends StatelessWidget {
  String texto = '';
  void Function() quandoSelecionado;

  Resposta(this.texto, this.quandoSelecionado);

  @override
  Widget build(BuildContext context) {
    return Container(
           width: double.infinity,
           child:
              ElevatedButton(
                onPressed: (quandoSelecionado), 
                style: ElevatedButton.styleFrom(
                backgroundColor: Colors.blue,
                foregroundColor: Colors.white),
                child: Text(this.texto),
              )
           );
  }
}