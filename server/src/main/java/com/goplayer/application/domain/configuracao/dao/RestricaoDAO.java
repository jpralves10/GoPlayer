package com.goplayer.application.domain.configuracao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.configuracao.entity.Restricao;
import com.goplayer.application.domain.configuracao.entity.RestricaoPK;

@Repository
public interface RestricaoDAO extends JpaRepository<Restricao, RestricaoPK> {
	
	

}
