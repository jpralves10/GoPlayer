package com.goplayer.application.domain.programacao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PlaylistItensPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="cd_empresa")
	private String cdEmpresa;
	
	@Column(name="cd_playlist")
	private String cdPlaylist;
	
	@Column(name="cd_item")
	private String cdItem;

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

	public String getCdItem() {
		return cdItem;
	}

	public void setCdItem(String cdItem) {
		this.cdItem = cdItem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdEmpresa == null) ? 0 : cdEmpresa.hashCode());
		result = prime * result + ((cdItem == null) ? 0 : cdItem.hashCode());
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
		PlaylistItensPK other = (PlaylistItensPK) obj;
		if (cdEmpresa == null) {
			if (other.cdEmpresa != null)
				return false;
		} else if (!cdEmpresa.equals(other.cdEmpresa))
			return false;
		if (cdItem == null) {
			if (other.cdItem != null)
				return false;
		} else if (!cdItem.equals(other.cdItem))
			return false;
		if (cdPlaylist == null) {
			if (other.cdPlaylist != null)
				return false;
		} else if (!cdPlaylist.equals(other.cdPlaylist))
			return false;
		return true;
	}
}
