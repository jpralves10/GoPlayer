package com.goplayer.application.domain.socket.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.socket.entity.PlayerFonteRss;
import com.goplayer.application.domain.socket.entity.PlayerFonteRssPK;

@Repository
public interface PlayerFonteRssDAO extends JpaRepository<PlayerFonteRss, PlayerFonteRssPK> {
	
	

}
