package com.goplayer.application.domain.players.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.players.entity.Players;
import com.goplayer.application.domain.players.entity.PlayersPK;

@Repository
public interface PlayersDAO extends JpaRepository<Players, PlayersPK> {
	
	

}
