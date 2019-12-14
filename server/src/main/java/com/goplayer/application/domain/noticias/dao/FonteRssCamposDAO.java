package com.goplayer.application.domain.noticias.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.noticias.entity.FonteRssCampos;
import com.goplayer.application.domain.noticias.entity.FonteRssCamposPK;

@Repository
public interface FonteRssCamposDAO extends JpaRepository<FonteRssCampos, FonteRssCamposPK> {
	
	

}
