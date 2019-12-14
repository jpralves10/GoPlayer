package com.goplayer.application.domain.programacao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.programacao.entity.PlaylistItens;
import com.goplayer.application.domain.programacao.entity.PlaylistItensPK;

@Repository
public interface PlaylistItensDAO extends JpaRepository<PlaylistItens, PlaylistItensPK> {
	
	

}
