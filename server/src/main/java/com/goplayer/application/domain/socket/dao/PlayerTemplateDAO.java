package com.goplayer.application.domain.socket.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.socket.entity.PlayerTemplate;
import com.goplayer.application.domain.socket.entity.PlayerTemplatePK;

@Repository
public interface PlayerTemplateDAO extends JpaRepository<PlayerTemplate, PlayerTemplatePK> {
	
	

}
