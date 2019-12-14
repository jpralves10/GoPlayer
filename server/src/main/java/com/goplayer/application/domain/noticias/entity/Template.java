package com.goplayer.application.domain.noticias.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="not_template")
public class Template implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TemplatePK id;
	
	@Column(name="nm_template")
	private String nmTemplate;
	
	@Column(name="de_tamanho")
	private String deTamanho;
	
	@Column(name="de_extensao")
	private String deExtensao;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public TemplatePK getId() {
		return id;
	}

	public void setId(TemplatePK id) {
		this.id = id;
	}

	public String getNmTemplate() {
		return nmTemplate;
	}

	public void setNmTemplate(String nmTemplate) {
		this.nmTemplate = nmTemplate;
	}

	public String getDeTamanho() {
		return deTamanho;
	}

	public void setDeTamanho(String deTamanho) {
		this.deTamanho = deTamanho;
	}

	public String getDeExtensao() {
		return deExtensao;
	}

	public void setDeExtensao(String deExtensao) {
		this.deExtensao = deExtensao;
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
