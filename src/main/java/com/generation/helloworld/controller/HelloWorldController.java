package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "BSM's da Generation Brasil:\n"
				+"- Persistência\n"
				+"- Mentalidade de Crescimento\n"
				+"- Responsabilidade Pessoal\n"
				+"- Orientação ao Futuro\n"
				+"- Proatividade\n"
				+"- Comunicação\n"
				+"- Trabalho em Equipe\n"
				+"- Orientação ao Detalhe";
	}
	
	@GetMapping("/lista-objetivos")
	public String listaObjetivos() {
		return "Lista dos meus Objetivos de Aprendizagem para essa Semana:\n"
				+"- Praticar e ver mais sobre Spring Framework\n"
				+"- Praticar banco de Dados\n"
				+"- Rever os vídeos sobre banco de dados e spring e reler os cookbooks para melhor fixação\n"
				+"- Aprender mais sobre APIs\n"
				+"- Aplicar melhor as boas práticas nos meus Projetos";
	}
}
