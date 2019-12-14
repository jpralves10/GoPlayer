package com.goplayer.application.domain.programacao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PlaylistGrupoPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="cd_empresa")
	private String cdEmpresa;
	
	@Column(name="cd_playlist")
	private String cdPlaylist;
	
	@Column(name="cd_grupo")
	private String cdGrupo;

	public String getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(String cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public String getCdPlaylist() {
		return cdPlaylist;
	}

	public void setCdPlaylist(String cdPlaylist) {
		this.cdPlaylist = cdPlaylist;
	}

	public String getCdGrupo() {
		return cdGrupo;
	}

	public void setCdGrupo(String cdGrupo) {
		this.cdGrupo = cdGrupo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdEmpresa == null) ? 0 : cdEmpresa.hashCode());
		result = prime * result + ((cdGrupo == null) ? 0 : cdGrupo.hashCode());
		result = prime * result + ((cdPlaylist == null) ? 0 : cdPlaylist.hashCode());
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
		PlaylistGrupoPK other = (PlaylistGrupoPK) obj;
		if (cdEmpresa == null) {
			if (other.cdEmpresa != null)
				return false;
		} else if (!cdEmpresa.equals(other.cdEmpresa))
			return false;
		if (cdGrupo == null) {
			if (other.cdGrupo != null)
				return false;
		} else if (!cdGrupo.equals(other.cdGrupo))
			return false;
		if (cdPlaylist == null) {
			if (other.cdPlaylist != null)
				return false;
		} else if (!cdPlaylist.equals(other.cdPlaylist))
			return false;
		return true;
	}
}
