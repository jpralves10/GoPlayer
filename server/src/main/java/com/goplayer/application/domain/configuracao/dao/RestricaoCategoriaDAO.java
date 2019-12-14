package com.goplayer.application.domain.configuracao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.configuracao.entity.RestricaoCategoria;
import com.goplayer.application.domain.configuracao.entity.RestricaoCategoriaPK;

@Repository
public interface RestricaoCategoriaDAO extends JpaRepository<RestricaoCategoria, RestricaoCategoriaPK> {
	
	

}
