package com.goplayer.application.domain.configuracao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PerfilMenuPK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="cd_empresa")
	private String cdEmpresa;
	
	@Column(name="cd_perfil")
	private String cdPerfil;
	
	@Column(name="cd_menu")
	private String cdMenu;
	
	public String getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(String cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public String getCdPerfil() {
		return cdPerfil;
	}

	public void setCdPerfil(String cdPerfil) {
		this.cdPerfil = cdPerfil;
	}

	public String getCdMenu() {
		return cdMenu;
	}

	public void setCdMenu(String cdMenu) {
		this.cdMenu = cdMenu;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdEmpresa == null) ? 0 : cdEmpresa.hashCode());
		result = prime * result + ((cdMenu == null) ? 0 : cdMenu.hashCode());
		result = prime * result + ((cdPerfil == null) ? 0 : cdPerfil.hashCode());
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
		PerfilMenuPK other = (PerfilMenuPK) obj;
		if (cdEmpresa == null) {
			if (other.cdEmpresa != null)
				return false;
		} else if (!cdEmpresa.equals(other.cdEmpresa))
			return false;
		if (cdMenu == null) {
			if (other.cdMenu != null)
				return false;
		} else if (!cdMenu.equals(other.cdMenu))
			return false;
		if (cdPerfil == null) {
			if (other.cdPerfil != null)
				return false;
		} else if (!cdPerfil.equals(other.cdPerfil))
			return false;
		return true;
	}
}
