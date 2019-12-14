package com.goplayer.application.domain.conteudo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.conteudo.entity.Categoria;
import com.goplayer.application.domain.conteudo.entity.CategoriaPK;

@Repository
public interface CategoriaDAO extends JpaRepository<Categoria, CategoriaPK> {
	
	

}
