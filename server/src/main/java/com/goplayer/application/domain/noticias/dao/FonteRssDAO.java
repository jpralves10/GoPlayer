package com.goplayer.application.domain.noticias.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.noticias.entity.FonteRss;
import com.goplayer.application.domain.noticias.entity.FonteRssPK;

@Repository
public interface FonteRssDAO extends JpaRepository<FonteRss, FonteRssPK> {
	
	

}
