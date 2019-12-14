package com.goplayer.application.domain.fontes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.fontes.entity.Canal;
import com.goplayer.application.domain.fontes.entity.CanalPK;

@Repository
public interface CanalDAO extends JpaRepository<Canal, CanalPK> {
	
	

}
