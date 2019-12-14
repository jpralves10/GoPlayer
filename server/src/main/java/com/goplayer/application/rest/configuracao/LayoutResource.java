package com.goplayer.application.rest.configuracao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goplayer.application.domain.configuracao.entity.Layout;
import com.goplayer.application.domain.configuracao.service.LayoutService;

@RestController
@RequestMapping(value="/layout")
public class LayoutResource {
	
	@Autowired
	private LayoutService serviceLayout;
	
	@RequestMapping("/listar")
	public ResponseEntity<?> obterListaLayout() {
		
		List<Layout> listaLayout = serviceLayout.buscarListaLayout();
		
		return ResponseEntity.ok().body(listaLayout);
	}
	
}
