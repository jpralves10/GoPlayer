package com.goplayer.application.domain.configuracao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.configuracao.entity.PerfilUsuario;
import com.goplayer.application.domain.configuracao.entity.PerfilUsuarioPK;

@Repository
public interface PerfilUsuarioDAO extends JpaRepository<PerfilUsuario, PerfilUsuarioPK> {
	
	

}
