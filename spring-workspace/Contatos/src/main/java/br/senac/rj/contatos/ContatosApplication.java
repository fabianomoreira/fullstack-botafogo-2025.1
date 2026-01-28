package br.senac.rj.contatos;

import br.senac.rj.contatos.domain.Pessoa;
import br.senac.rj.contatos.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ContatosApplication implements CommandLineRunner {

	@Autowired
	private PessoaRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(ContatosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pessoa pessoa1 = new Pessoa(null, "José Augusto Santos", "São Paulo");
		Pessoa pessoa2 = new Pessoa(null, "Antonio das Candongas", "Niterói");

		repo.saveAll(Arrays.asList(pessoa1, pessoa2));
	}
}
