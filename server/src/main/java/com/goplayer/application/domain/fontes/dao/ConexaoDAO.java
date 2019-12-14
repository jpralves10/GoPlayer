package com.goplayer.application.domain.fontes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.fontes.entity.Conexao;
import com.goplayer.application.domain.fontes.entity.ConexaoPK;

@Repository
public interface ConexaoDAO extends JpaRepository<Conexao, ConexaoPK> {
	
	

}
