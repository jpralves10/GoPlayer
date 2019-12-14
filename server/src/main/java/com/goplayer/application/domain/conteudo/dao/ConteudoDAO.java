package com.goplayer.application.domain.conteudo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.conteudo.entity.Conteudo;
import com.goplayer.application.domain.conteudo.entity.ConteudoPK;

@Repository
public interface ConteudoDAO extends JpaRepository<Conteudo, ConteudoPK> {
	
	

}
