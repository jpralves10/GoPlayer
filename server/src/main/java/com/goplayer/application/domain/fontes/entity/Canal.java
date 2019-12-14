package com.goplayer.application.domain.fontes.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="font_canal")
public class Canal implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private CanalPK id;
	
	@Column(name="nm_canal")
	private String nmCanal;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public CanalPK getId() {
		return id;
	}

	public void setId(CanalPK id) {
		this.id = id;
	}

	public String getNmCanal() {
		return nmCanal;
	}

	public void setNmCanal(String nmCanal) {
		this.nmCanal = nmCanal;
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
