package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "Olá Mundo cruel";
	}

	@GetMapping("/soma")
	public int soma(){
		Soma soma = new Soma();
		int resultado = soma.calcular(10, 10);
		return resultado;
	}
}
