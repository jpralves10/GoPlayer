package com.goplayer.application.domain.socket.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="soc_player_fonterss")
public class PlayerFonteRss implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private PlayerFonteRssPK id;
	
	@Column(name="cd_operacao")
	private Character cdOperacao;
	
	@Column(name="dt_envio_player")
	private Date dtEnvioPlayer;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public PlayerFonteRssPK getId() {
		return id;
	}

	public void setId(PlayerFonteRssPK id) {
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
