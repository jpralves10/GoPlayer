package com.goplayer.application.domain.socket.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.socket.entity.PlayerLayout;
import com.goplayer.application.domain.socket.entity.PlayerLayoutPK;

@Repository
public interface PlayerLayoutDAO extends JpaRepository<PlayerLayout, PlayerLayoutPK> {
	
	

}
