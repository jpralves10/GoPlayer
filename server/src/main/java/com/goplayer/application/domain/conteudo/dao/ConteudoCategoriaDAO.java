package com.goplayer.application.domain.conteudo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.conteudo.entity.ConteudoCategoria;
import com.goplayer.application.domain.conteudo.entity.ConteudoCategoriaPK;

@Repository
public interface ConteudoCategoriaDAO extends JpaRepository<ConteudoCategoria, ConteudoCategoriaPK> {
	
	

}
