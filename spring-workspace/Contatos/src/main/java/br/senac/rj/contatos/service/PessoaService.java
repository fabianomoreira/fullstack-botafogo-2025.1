package br.senac.rj.contatos.service;

import br.senac.rj.contatos.domain.Pessoa;
import br.senac.rj.contatos.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository repo;

    public List<Pessoa> listar(){
        return repo.findAll();
    }

    public Pessoa buscar(Integer id){
        Optional<Pessoa> obj = repo.findById(id);

        return obj.orElse(null);
    }
    public List<Pessoa> listarPessoas(){
        List<Pessoa> resultado = new ArrayList<Pessoa>();

        Pessoa pessoa1 = new Pessoa(1, "Moacyr", "Rio de Janeiro");
        Pessoa pessoa2 = new Pessoa(2, "Patricia", "Rio de Janeiro");

        resultado.add(pessoa1);
        resultado.add(pessoa2);

        return resultado;
    }
}
