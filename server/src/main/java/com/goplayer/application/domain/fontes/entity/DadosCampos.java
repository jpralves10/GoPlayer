package com.goplayer.application.domain.fontes.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="font_dados_campos")
public class DadosCampos implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private DadosCamposPK id;
	
	@Column(name="de_campo")
	private String deCampo;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public DadosCamposPK getId() {
		return id;
	}

	public void setId(DadosCamposPK id) {
		this.id = id;
	}

	public String getDeCampo() {
		return deCampo;
	}

	public void setDeCampo(String deCampo) {
		this.deCampo = deCampo;
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
