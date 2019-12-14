package com.goplayer.application.domain.fontes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.fontes.entity.DadosCampos;
import com.goplayer.application.domain.fontes.entity.DadosCamposPK;

@Repository
public interface DadosCamposDAO extends JpaRepository<DadosCampos, DadosCamposPK> {
	
	

}
