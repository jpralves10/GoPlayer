package com.goplayer.application.domain.socket.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.socket.entity.PlayerNoticia;
import com.goplayer.application.domain.socket.entity.PlayerNoticiaPK;

@Repository
public interface PlayerNoticiaDAO extends JpaRepository<PlayerNoticia, PlayerNoticiaPK> {
	
	

}
