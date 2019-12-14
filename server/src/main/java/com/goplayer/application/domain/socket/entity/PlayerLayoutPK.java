package com.goplayer.application.domain.socket.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PlayerLayoutPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="cd_empresa")
	private String cdEmpresa;
	
	@Column(name="cd_layout")
	private String cdLayout;
	
	@Column(name="cd_player")
	private String cdPlayer;
	
	@Column(name="cd_dt_operacao")
	private Date cdDtOperacao;

	public String getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(String cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public String getCdLayout() {
		return cdLayout;
	}

	public void setCdLayout(String cdLayout) {
		this.cdLayout = cdLayout;
	}

	public String getCdPlayer() {
		return cdPlayer;
	}

	public void setCdPlayer(String cdPlayer) {
		this.cdPlayer = cdPlayer;
	}

	public Date getCdDtOperacao() {
		return cdDtOperacao;
	}

	public void setCdDtOperacao(Date cdDtOperacao) {
		this.cdDtOperacao = cdDtOperacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdDtOperacao == null) ? 0 : cdDtOperacao.hashCode());
		result = prime * result + ((cdEmpresa == null) ? 0 : cdEmpresa.hashCode());
		result = prime * result + ((cdLayout == null) ? 0 : cdLayout.hashCode());
		result = prime * result + ((cdPlayer == null) ? 0 : cdPlayer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayerLayoutPK other = (PlayerLayoutPK) obj;
		if (cdDtOperacao == null) {
			if (other.cdDtOperacao != null)
				return false;
		} else if (!cdDtOperacao.equals(other.cdDtOperacao))
			return false;
		if (cdEmpresa == null) {
			if (other.cdEmpresa != null)
				return false;
		} else if (!cdEmpresa.equals(other.cdEmpresa))
			return false;
		if (cdLayout == null) {
			if (other.cdLayout != null)
				return false;
		} else if (!cdLayout.equals(other.cdLayout))
			return false;
		if (cdPlayer == null) {
			if (other.cdPlayer != null)
				return false;
		} else if (!cdPlayer.equals(other.cdPlayer))
			return false;
		return true;
	}
}