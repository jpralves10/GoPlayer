package com.goplayer.application.domain.configuracao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.configuracao.entity.PerfilMenu;
import com.goplayer.application.domain.configuracao.entity.PerfilMenuPK;

@Repository
public interface PerfilMenuDAO extends JpaRepository<PerfilMenu, PerfilMenuPK> {
	
	

}
