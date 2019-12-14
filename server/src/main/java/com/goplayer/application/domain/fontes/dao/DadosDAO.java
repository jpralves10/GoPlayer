package com.goplayer.application.domain.fontes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.fontes.entity.Dados;
import com.goplayer.application.domain.fontes.entity.DadosPK;

@Repository
public interface DadosDAO extends JpaRepository<Dados, DadosPK> {
	
	

}
