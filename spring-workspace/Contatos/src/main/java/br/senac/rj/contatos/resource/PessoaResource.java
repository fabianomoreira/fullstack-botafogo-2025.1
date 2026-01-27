package br.senac.rj.contatos.resource;

import br.senac.rj.contatos.domain.Pessoa;
import br.senac.rj.contatos.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaResource {
    @Autowired
    PessoaService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){
        Pessoa obj = service.buscar(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Pessoa> listar(){
        List<Pessoa> listaDePessoas;

        PessoaService service = new PessoaService();

        listaDePessoas = service.listarPessoas();

        return listaDePessoas;
    }
}
