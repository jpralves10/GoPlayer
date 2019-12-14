package com.goplayer.application.domain.players.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.players.entity.Grupos;
import com.goplayer.application.domain.players.entity.GruposPK;

@Repository
public interface GruposDAO extends JpaRepository<Grupos, GruposPK> {
	
	

}
