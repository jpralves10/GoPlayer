package com.goplayer.application.domain.socket.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.socket.entity.PlayerPlaylist;
import com.goplayer.application.domain.socket.entity.PlayerPlaylistPK;

@Repository
public interface PlayerPlaylistDAO extends JpaRepository<PlayerPlaylist, PlayerPlaylistPK> {
	
	

}
