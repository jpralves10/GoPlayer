package com.goplayer.application.rest.conteudo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categoria")
public class CategoriaResource {
	
	@RequestMapping("/listar")
	public String listar() {
		return "Rest OK";
	}
}
