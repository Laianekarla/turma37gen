package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping("/mentalidade")
	public String mentalidadeHabilidade() {
		return "Persistência, Atenção ao detalhe";
	}

	@GetMapping("/objetivo")
	public String objetivoAprendizagem() {
		return "Aprender usar Spring em meus projetos";
	}
	
	
	
}
