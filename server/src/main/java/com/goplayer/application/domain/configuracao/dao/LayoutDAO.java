package com.goplayer.application.domain.configuracao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.configuracao.entity.Layout;
import com.goplayer.application.domain.configuracao.entity.LayoutPK;

@Repository
public interface LayoutDAO extends JpaRepository<Layout, LayoutPK> {
	
	

}
