import 'package:flutter/material.dart';
import 'package:perguntas/questao.dart';

main() => runApp(_PerguntaApp());

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

  Widget build(BuildContext context){

    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('Perguntas e Respostas'),
        ),
        body: Column(
          children: <Widget>[
            Questao(_perguntas[_perguntaSelecionada]),
            ElevatedButton(
              onPressed: responder, 
              child: Text('Resposta 1'),
              style: ElevatedButton.styleFrom(
                backgroundColor: Colors.blue,
                foregroundColor: Colors.white),
              ),
            ElevatedButton(
              onPressed: () {}, 
              child: Text('Resposta 2'),
              style: ElevatedButton.styleFrom(
                backgroundColor: Colors.lightBlue,
                foregroundColor: Colors.white),
              ),
            ElevatedButton(
              onPressed: () {}, 
              child: Text('Resposta 3'),
              style: ElevatedButton.styleFrom(
                backgroundColor: Colors.red,
                foregroundColor: Colors.white),
              ),              
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