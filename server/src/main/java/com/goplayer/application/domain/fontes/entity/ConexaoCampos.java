package com.goplayer.application.domain.fontes.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="font_conexao_campos")
public class ConexaoCampos implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ConexaoCamposPK id;
	
	@Column(name="de_tooltip")
	private String deTooltip;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public ConexaoCamposPK getId() {
		return id;
	}

	public void setId(ConexaoCamposPK id) {
		this.id = id;
	}

	public String getDeTooltip() {
		return deTooltip;
	}

	public void setDeTooltip(String deTooltip) {
		this.deTooltip = deTooltip;
	}

	public String getCdUsuarioAtualizacao() {
		return cdUsuarioAtualizacao;
	}

	public void setCdUsuarioAtualizacao(String cdUsuarioAtualizacao) {
		this.cdUsuarioAtualizacao = cdUsuarioAtualizacao;
	}

	public Date getDtAtualizacao() {
		return dtAtualizacao;
	}

	public void setDtAtualizacao(Date dtAtualizacao) {
		this.dtAtualizacao = dtAtualizacao;
	}
}
