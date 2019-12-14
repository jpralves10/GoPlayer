package com.goplayer.application.domain.noticias.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.noticias.entity.Noticia;
import com.goplayer.application.domain.noticias.entity.NoticiaPK;

@Repository
public interface NoticiaDAO extends JpaRepository<Noticia, NoticiaPK> {
	
	

}
