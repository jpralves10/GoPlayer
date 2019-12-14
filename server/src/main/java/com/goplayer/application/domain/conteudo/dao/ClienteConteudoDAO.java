package com.goplayer.application.domain.conteudo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.conteudo.entity.Cliente;
import com.goplayer.application.domain.conteudo.entity.ClientePK;

@Repository
public interface ClienteConteudoDAO extends JpaRepository<Cliente, ClientePK> {
	
	

}
