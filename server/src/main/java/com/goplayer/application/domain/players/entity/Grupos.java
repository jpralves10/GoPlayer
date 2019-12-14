package com.goplayer.application.domain.players.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="pla_grupos")
public class Grupos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private GruposPK id;
	
	@Column(name="nm_grupo")
	private String nmGrupo;
	
	@Column(name="de_grupo")
	private Date deGrupo;
	
	@Column(name="fl_padrao")
	private Integer flPadrao;
	
	@Column(name="cd_grupo_pai")
	private String cdGrupoPai;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public GruposPK getId() {
		return id;
	}

	public void setId(GruposPK id) {
		this.id = id;
	}

	public String getNmGrupo() {
		return nmGrupo;
	}

	public void setNmGrupo(String nmGrupo) {
		this.nmGrupo = nmGrupo;
	}

	public Date getDeGrupo() {
		return deGrupo;
	}

	public void setDeGrupo(Date deGrupo) {
		this.deGrupo = deGrupo;
	}

	public Integer getFlPadrao() {
		return flPadrao;
	}

	public void setFlPadrao(Integer flPadrao) {
		this.flPadrao = flPadrao;
	}

	public String getCdGrupoPai() {
		return cdGrupoPai;
	}

	public void setCdGrupoPai(String cdGrupoPai) {
		this.cdGrupoPai = cdGrupoPai;
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
