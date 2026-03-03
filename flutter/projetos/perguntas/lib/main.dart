import 'package:flutter/material.dart';

main() => runApp(PerguntaApp());

class PerguntaAppState extends State<PerguntaApp>{
  var perguntaSelecionada = 0;

  void responder(){
    setState(() {
      perguntaSelecionada++;      
    });

    print(perguntaSelecionada);
  }

  Widget build(BuildContext context){
    final perguntas = [
      'Qual é a sua cor favorita?',
      'Qual é o seu animal favorito?'
    ];

    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('Perguntas e Respostas'),
        ),
        body: Column(
          children: <Widget>[
            Text(perguntas[perguntaSelecionada]),
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

class PerguntaApp extends StatefulWidget{
  @override
  State<PerguntaApp> createState(){
    return PerguntaAppState();
  }
}