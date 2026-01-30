package br.senac.rj.contatos.resource;

import br.senac.rj.contatos.domain.Pessoa;
import br.senac.rj.contatos.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaResource {
    @Autowired
    PessoaService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody Pessoa obj, @PathVariable Integer id){
        obj.setId(id);
        obj = service.alterar(obj);

        return ResponseEntity.noContent().build();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody Pessoa obj){
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                                             .path("/{id}")
                                             .buildAndExpand(obj.getId())
                                             .toUri();

        obj = service.incluir(obj);

        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Pessoa>> findAll(){
        List<Pessoa> obj = service.listar();
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){
        Pessoa obj = service.buscar(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.apagar(id);
        return ResponseEntity.noContent().build();
    }
}
