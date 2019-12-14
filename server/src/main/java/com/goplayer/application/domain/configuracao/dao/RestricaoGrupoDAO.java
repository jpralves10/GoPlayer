package com.goplayer.application.domain.configuracao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.configuracao.entity.RestricaoGrupo;
import com.goplayer.application.domain.configuracao.entity.RestricaoGrupoPK;

@Repository
public interface RestricaoGrupoDAO extends JpaRepository<RestricaoGrupo, RestricaoGrupoPK> {
	
	

}
