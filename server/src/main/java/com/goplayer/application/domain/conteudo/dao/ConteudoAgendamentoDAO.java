package com.goplayer.application.domain.conteudo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goplayer.application.domain.conteudo.entity.ConteudoAgendamento;
import com.goplayer.application.domain.conteudo.entity.ConteudoAgendamentoPK;

@Repository
public interface ConteudoAgendamentoDAO extends JpaRepository<ConteudoAgendamento, ConteudoAgendamentoPK> {
	
	

}
