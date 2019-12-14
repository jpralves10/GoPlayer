package com.goplayer.application.domain.socket.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="soc_player_playlist")
public class PlayerPlaylist implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private PlayerPlaylistPK id;
	
	@Column(name="cd_operacao")
	private Character cdOperacao;
	
	@Column(name="dt_envio_player")
	private Date dtEnvioPlayer;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public PlayerPlaylistPK getId() {
		return id;
	}

	public void setId(PlayerPlaylistPK id) {
		this.id = id;
	}

	public Character getCdOperacao() {
		return cdOperacao;
	}

	public void setCdOperacao(Character cdOperacao) {
		this.cdOperacao = cdOperacao;
	}

	public Date getDtEnvioPlayer() {
		return dtEnvioPlayer;
	}

	public void setDtEnvioPlayer(Date dtEnvioPlayer) {
		this.dtEnvioPlayer = dtEnvioPlayer;
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
