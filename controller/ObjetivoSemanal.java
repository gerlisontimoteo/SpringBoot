package com.api.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class ObjetivoSemanal {
	@GetMapping
	public String hello() {
		return "Foco: Reforçar o que aprendi de BANCO DE DADOS;\r\n"
				+ "Revisar HTML e CSS e aprender um pouco mais para melhor me ambientar\r\n"
				+ "\r\n"
				+ "Como: Vou resolver exercícios(database) da Generation e assistir vídeos do youtube.\r\n"
				+ "Também vou revisar aulas da uDemy e codificar em HTML/CSS.\r\n"
				+ "\r\n"
				+ "Prática: Resolução de exercícios e colocar página HTML no ar.";
}
}