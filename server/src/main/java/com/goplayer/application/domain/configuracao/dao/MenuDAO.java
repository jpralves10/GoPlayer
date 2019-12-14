package com.goplayer.application.domain.configuracao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.configuracao.entity.Menu;
import com.goplayer.application.domain.configuracao.entity.MenuPK;

@Repository
public interface MenuDAO extends JpaRepository<Menu, MenuPK> {
	
	

}
