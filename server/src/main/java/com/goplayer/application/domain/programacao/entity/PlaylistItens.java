package com.goplayer.application.domain.programacao.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="pro_playlist_itens")
public class PlaylistItens implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private PlaylistItensPK id;
	
	@Column(name="cd_tipo_item")
	private String cdTipoItem;
	
	@Column(name="cd_codigo_origem")
	private String cdCodigoOrigem;
	
	@Column(name="nu_sequencia")
	private Integer nuSequencia;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public PlaylistItensPK getId() {
		return id;
	}

	public void setId(PlaylistItensPK id) {
		this.id = id;
	}

	public String getCdTipoItem() {
		return cdTipoItem;
	}

	public void setCdTipoItem(String cdTipoItem) {
		this.cdTipoItem = cdTipoItem;
	}

	public String getCdCodigoOrigem() {
		return cdCodigoOrigem;
	}

	public void setCdCodigoOrigem(String cdCodigoOrigem) {
		this.cdCodigoOrigem = cdCodigoOrigem;
	}

	public Integer getNuSequencia() {
		return nuSequencia;
	}

	public void setNuSequencia(Integer nuSequencia) {
		this.nuSequencia = nuSequencia;
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
