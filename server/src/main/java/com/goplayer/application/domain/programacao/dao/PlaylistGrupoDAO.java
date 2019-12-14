package com.goplayer.application.domain.programacao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.programacao.entity.PlaylistGrupo;
import com.goplayer.application.domain.programacao.entity.PlaylistGrupoPK;

@Repository
public interface PlaylistGrupoDAO extends JpaRepository<PlaylistGrupo, PlaylistGrupoPK> {
	
	

}
