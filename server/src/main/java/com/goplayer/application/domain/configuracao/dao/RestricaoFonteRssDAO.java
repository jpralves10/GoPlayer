package com.goplayer.application.domain.configuracao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.configuracao.entity.RestricaoFonteRss;
import com.goplayer.application.domain.configuracao.entity.RestricaoFonteRssPK;

@Repository
public interface RestricaoFonteRssDAO extends JpaRepository<RestricaoFonteRss, RestricaoFonteRssPK> {
	
	

}
