package com.goplayer.application.domain.conteudo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cont_conteudo")
public class Conteudo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ConteudoPK id;
	
	@Column(name="nm_conteudo")
	private String nmConteudo;
	
	@Column(name="qt_min_duracao")
	private Integer qtMinDuracao;
	
	@Column(name="qt_seg_duracao")
	private Integer qtSegDuracao;
	
	@Column(name="dt_validade_inicial")
	private Date dtValidadeInicial;
	
	@Column(name="dt_validade_final")
	private Date dtValidadeFinal;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public ConteudoPK getId() {
		return id;
	}

	public void setId(ConteudoPK id) {
		this.id = id;
	}

	public String getNmConteudo() {
		return nmConteudo;
	}

	public void setNmConteudo(String nmConteudo) {
		this.nmConteudo = nmConteudo;
	}

	public Integer getQtMinDuracao() {
		return qtMinDuracao;
	}

	public void setQtMinDuracao(Integer qtMinDuracao) {
		this.qtMinDuracao = qtMinDuracao;
	}

	public Integer getQtSegDuracao() {
		return qtSegDuracao;
	}

	public void setQtSegDuracao(Integer qtSegDuracao) {
		this.qtSegDuracao = qtSegDuracao;
	}

	public Date getDtValidadeInicial() {
		return dtValidadeInicial;
	}

	public void setDtValidadeInicial(Date dtValidadeInicial) {
		this.dtValidadeInicial = dtValidadeInicial;
	}

	public Date getDtValidadeFinal() {
		return dtValidadeFinal;
	}

	public void setDtValidadeFinal(Date dtValidadeFinal) {
		this.dtValidadeFinal = dtValidadeFinal;
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
