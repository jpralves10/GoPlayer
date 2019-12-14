package com.goplayer.application.domain.programacao.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="pro_playlist")
public class Playlist implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private PlaylistPK id;
	
	@Column(name="fl_tipo_playlist")
	private Integer flTipoPlaylist;
	
	@Column(name="de_duracao_total")
	private String deDuracaoTotal;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public PlaylistPK getId() {
		return id;
	}

	public void setId(PlaylistPK id) {
		this.id = id;
	}

	public Integer getFlTipoPlaylist() {
		return flTipoPlaylist;
	}

	public void setFlTipoPlaylist(Integer flTipoPlaylist) {
		this.flTipoPlaylist = flTipoPlaylist;
	}

	public String getDeDuracaoTotal() {
		return deDuracaoTotal;
	}

	public void setDeDuracaoTotal(String deDuracaoTotal) {
		this.deDuracaoTotal = deDuracaoTotal;
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
