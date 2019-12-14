package com.goplayer.application.domain.socket.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.socket.entity.PlayerConteudo;
import com.goplayer.application.domain.socket.entity.PlayerConteudoPK;

@Repository
public interface PlayerConteudoDAO extends JpaRepository<PlayerConteudo, PlayerConteudoPK> {
	
	

}
