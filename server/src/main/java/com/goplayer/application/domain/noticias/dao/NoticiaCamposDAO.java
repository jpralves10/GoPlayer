package com.goplayer.application.domain.noticias.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.noticias.entity.NoticiaCampos;
import com.goplayer.application.domain.noticias.entity.NoticiaCamposPK;

@Repository
public interface NoticiaCamposDAO extends JpaRepository<NoticiaCampos, NoticiaCamposPK> {
	
	

}
