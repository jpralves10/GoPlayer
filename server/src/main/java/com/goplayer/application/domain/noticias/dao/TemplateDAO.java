package com.goplayer.application.domain.noticias.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.noticias.entity.Template;
import com.goplayer.application.domain.noticias.entity.TemplatePK;

@Repository
public interface TemplateDAO extends JpaRepository<Template, TemplatePK> {
	
	

}
