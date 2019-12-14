package com.goplayer.application.domain.fontes.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="font_conexao")
public class Conexao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ConexaoPK id;
	
	@Column(name="nm_conexao")
	private String nmConexao;
	
	@Column(name="nm_classe")
	private String nmClasse;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public ConexaoPK getId() {
		return id;
	}

	public void setId(ConexaoPK id) {
		this.id = id;
	}

	public String getNmConexao() {
		return nmConexao;
	}

	public void setNmConexao(String nmConexao) {
		this.nmConexao = nmConexao;
	}

	public String getNmClasse() {
		return nmClasse;
	}

	public void setNmClasse(String nmClasse) {
		this.nmClasse = nmClasse;
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
