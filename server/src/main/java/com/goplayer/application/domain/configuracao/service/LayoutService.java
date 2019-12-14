package com.goplayer.application.domain.configuracao.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goplayer.application.domain.configuracao.dao.LayoutDAO;
import com.goplayer.application.domain.configuracao.entity.Layout;

@Service
public class LayoutService {
	
	@Autowired
	private LayoutDAO dbLayout;
	
	@Transactional
	public List<Layout> buscarListaLayout() {
		
		return dbLayout.findAll();
	}
}