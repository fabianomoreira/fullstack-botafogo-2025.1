import 'dart:convert';
import 'package:contatos_app/models/pessoa.dart';
import 'package:http/http.dart' as http;

class ApiService{
  static const String baseURL = 'http://localhost:8080/pessoas';

  static Future<List<Pessoa>> getPessoas() async {
    final response = await http.get(Uri.parse(baseURL));

    if (response.statusCode == 200) {
      List jsonResponse = json.decode(response.body);
      return jsonResponse.map((data) => Pessoa.fromJson(data)).toList();
    } else {
      throw Exception('Erro ao carregar pessoas: ${response.statusCode}');
    }
  }

  static Future<void> createPessoa(Pessoa pessoa) async {
    final response = await http.post(
      Uri.parse(baseURL),
      headers: {'Content-type': 'application/json'},
      body: json.encode(pessoa.toJson()),
    );

    if(response.statusCode != 201){
      throw Exception('Erro ao criar pessoa: ${response.statusCode}');
    }
  }
}