package com.goplayer.application.domain.fontes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.fontes.entity.ConexaoCampos;
import com.goplayer.application.domain.fontes.entity.ConexaoCamposPK;

@Repository
public interface ConexaoCamposDAO extends JpaRepository<ConexaoCampos, ConexaoCamposPK> {
	
	

}
