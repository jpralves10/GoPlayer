package com.goplayer.application.domain.configuracao.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="conf_perfil")
public class Perfil implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private PerfilPK id;
	
	@Column(name="nm_perfil")
	private String nmPerfil;
	
	@Column(name="de_perfil")
	private String dePerfil;
	
	@Column(name="fl_situacao")
	private String flSituacao;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public PerfilPK getId() {
		return id;
	}

	public void setId(PerfilPK id) {
		this.id = id;
	}

	public String getNmPerfil() {
		return nmPerfil;
	}

	public void setNmPerfil(String nmPerfil) {
		this.nmPerfil = nmPerfil;
	}

	public String getDePerfil() {
		return dePerfil;
	}

	public void setDePerfil(String dePerfil) {
		this.dePerfil = dePerfil;
	}

	public String getFlSituacao() {
		return flSituacao;
	}

	public void setFlSituacao(String flSituacao) {
		this.flSituacao = flSituacao;
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
