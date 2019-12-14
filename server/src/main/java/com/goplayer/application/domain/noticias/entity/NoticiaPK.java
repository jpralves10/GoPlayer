package com.goplayer.application.domain.noticias.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NoticiaPK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="cd_empresa")
	private String cdEmpresa;
	
	@Column(name="cd_noticia")
	private String cdNoticia;

	public String getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(String cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public String getCdNoticia() {
		return cdNoticia;
	}

	public void setCdNoticia(String cdNoticia) {
		this.cdNoticia = cdNoticia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdEmpresa == null) ? 0 : cdEmpresa.hashCode());
		result = prime * result + ((cdNoticia == null) ? 0 : cdNoticia.hashCode());
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
		NoticiaPK other = (NoticiaPK) obj;
		if (cdEmpresa == null) {
			if (other.cdEmpresa != null)
				return false;
		} else if (!cdEmpresa.equals(other.cdEmpresa))
			return false;
		if (cdNoticia == null) {
			if (other.cdNoticia != null)
				return false;
		} else if (!cdNoticia.equals(other.cdNoticia))
			return false;
		return true;
	}
}
