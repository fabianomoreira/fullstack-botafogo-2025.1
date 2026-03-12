import 'package:flutter/material.dart';
import 'package:perguntas/questao.dart';
import 'package:perguntas/resposta.dart';
import 'package:perguntas/resultado.dart';

void main() => runApp(_PerguntaApp());

class _PerguntaAppState extends State<_PerguntaApp>{
  var _perguntaSelecionada = 0;
  final _perguntas = [
    {
      'texto': 'Qual é a sua cor favorita?',
      'respostas': ['Azul', 'Verde', 'Amarelo', 'Roxo']
    },
    {
      'texto': 'Qual é o seu animal favorito?',
      'respostas': ['Coelho', 'Girafa', 'Jacaré', 'Cobra']
    },
    {
      'texto': 'Qual seu instrutor favorito?',
      'respostas': ['Douglas', 'Romulo', 'Fabiano', 'Alexandre', 'Erick']
    },
    {
      'texto': 'Qual seu time?',
      'respostas': ['Flamengo', 'Botafogo', 'Fluminense', 'Vasco']
    }
  ];

  void responder(){
    if (temPergunta) {
      setState(() {
        _perguntaSelecionada++;      
      });
    }
  }

  bool get temPergunta {
    return (_perguntaSelecionada < (_perguntas.length));
  }

  @override
  Widget build(BuildContext context){
    
    List<Widget> respostas = [];

    for(String resposta in _perguntas[_perguntaSelecionada]['respostas'] as List){
      respostas.add(Resposta(resposta, responder));
    }

    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          backgroundColor: Theme.of(context).colorScheme.primary,
          foregroundColor: Theme.of(context).colorScheme.onPrimary,
          title: Text('Perguntas e Respostas'),
        ),
        body: temPergunta ? Column(
          children: <Widget>[
            Questao(_perguntas[_perguntaSelecionada]['texto'] as String),
            ...respostas     
          ],
        ) : Resultado()
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