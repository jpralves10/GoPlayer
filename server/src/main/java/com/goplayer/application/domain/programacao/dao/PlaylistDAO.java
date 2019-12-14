package com.goplayer.application.domain.programacao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.programacao.entity.Playlist;
import com.goplayer.application.domain.programacao.entity.PlaylistPK;

@Repository
public interface PlaylistDAO extends JpaRepository<Playlist, PlaylistPK> {
	
	

}
