package br.senac.rj.contatos.repository;

import br.senac.rj.contatos.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
