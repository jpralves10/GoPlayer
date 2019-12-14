package com.goplayer.application.domain.configuracao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.configuracao.entity.Perfil;
import com.goplayer.application.domain.configuracao.entity.PerfilPK;

@Repository
public interface PerfilDAO extends JpaRepository<Perfil, PerfilPK> {
	
	

}
