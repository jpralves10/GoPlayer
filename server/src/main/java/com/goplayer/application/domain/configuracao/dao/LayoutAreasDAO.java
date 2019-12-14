package com.goplayer.application.domain.configuracao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.configuracao.entity.LayoutAreas;
import com.goplayer.application.domain.configuracao.entity.LayoutAreasPK;

@Repository
public interface LayoutAreasDAO extends JpaRepository<LayoutAreas, LayoutAreasPK> {
	
	

}
