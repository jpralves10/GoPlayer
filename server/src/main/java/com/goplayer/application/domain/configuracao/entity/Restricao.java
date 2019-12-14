package com.goplayer.application.domain.configuracao.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="conf_restricao")
public class Restricao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private RestricaoPK id;
	
	@Column(name="nm_restricao")
	private String nmRestricao;
	
	@Column(name="de_restricao")
	private String deRestricao;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public RestricaoPK getId() {
		return id;
	}

	public void setId(RestricaoPK id) {
		this.id = id;
	}

	public String getNmRestricao() {
		return nmRestricao;
	}

	public void setNmRestricao(String nmRestricao) {
		this.nmRestricao = nmRestricao;
	}

	public String getDeRestricao() {
		return deRestricao;
	}

	public void setDeRestricao(String deRestricao) {
		this.deRestricao = deRestricao;
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
