package br.senac.rj.contatos.service;

import br.senac.rj.contatos.domain.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaService {
    public List<Pessoa> listarPessoas(){
        List<Pessoa> resultado = new ArrayList<Pessoa>();

        Pessoa pessoa1 = new Pessoa(1, "Moacyr", "Rio de Janeiro");
        Pessoa pessoa2 = new Pessoa(2, "Patricia", "Rio de Janeiro");

        resultado.add(pessoa1);
        resultado.add(pessoa2);

        return resultado;
    }
}
