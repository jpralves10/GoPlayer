package com.goplayer.application.domain.configuracao.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="conf_perfil_usuario")
public class PerfilUsuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private PerfilUsuarioPK id;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public PerfilUsuarioPK getId() {
		return id;
	}

	public void setId(PerfilUsuarioPK id) {
		this.id = id;
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
