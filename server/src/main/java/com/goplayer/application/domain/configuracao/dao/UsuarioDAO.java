package com.goplayer.application.domain.configuracao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.configuracao.entity.Usuario;
import com.goplayer.application.domain.configuracao.entity.UsuarioPK;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, UsuarioPK> {
	
	

}
