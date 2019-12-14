package com.goplayer.application.domain.configuracao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.configuracao.entity.Empresa;
import com.goplayer.application.domain.configuracao.entity.EmpresaPK;

@Repository
public interface ClienteDAO extends JpaRepository<Empresa, EmpresaPK> {
	
	

}
