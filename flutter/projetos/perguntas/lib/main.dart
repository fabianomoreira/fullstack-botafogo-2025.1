import 'package:flutter/material.dart';
import 'package:perguntas/questao.dart';
import 'package:perguntas/resposta.dart';

void main() => runApp(_PerguntaApp());

class _PerguntaAppState extends State<_PerguntaApp>{
  var _perguntaSelecionada = 0;
  final _perguntas = [
    'Qual é a sua cor favorita?',
    'Qual é o seu animal favorito?',
    'Qual seu instrutor favorito?'
  ];

  void responder(){
    if (_perguntaSelecionada < (_perguntas.length - 1)) {
      setState(() {
        _perguntaSelecionada++;      
      });
    }
  }

  @override
  Widget build(BuildContext context){
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          backgroundColor: Theme.of(context).colorScheme.primary,
          foregroundColor: Theme.of(context).colorScheme.onPrimary,
          title: Text('Perguntas e Respostas'),
        ),
        body: Column(
          children: <Widget>[
            Questao(_perguntas[_perguntaSelecionada]),
            Resposta('Verde', responder),
            Resposta('Azul', responder),
            Resposta('Amarelo', responder),
            Resposta('Branco', responder)          
          ],
        )
      ),
    );
  }  
}

class _PerguntaApp extends StatefulWidget{
  @override
  State<_PerguntaApp> createState(){
    return _PerguntaAppState();
  }
}