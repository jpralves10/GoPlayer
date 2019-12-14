package com.goplayer.application.domain.fontes.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DadosCamposPK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="cd_empresa")
	private String cdEmpresa;
	
	@Column(name="cd_fonte")
	private String cdFonte;
	
	@Column(name="cd_campo")
	private String cdCampo;

	public String getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(String cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public String getCdFonte() {
		return cdFonte;
	}

	public void setCdFonte(String cdFonte) {
		this.cdFonte = cdFonte;
	}

	public String getCdCampo() {
		return cdCampo;
	}

	public void setCdCampo(String cdCampo) {
		this.cdCampo = cdCampo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdCampo == null) ? 0 : cdCampo.hashCode());
		result = prime * result + ((cdEmpresa == null) ? 0 : cdEmpresa.hashCode());
		result = prime * result + ((cdFonte == null) ? 0 : cdFonte.hashCode());
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
		DadosCamposPK other = (DadosCamposPK) obj;
		if (cdCampo == null) {
			if (other.cdCampo != null)
				return false;
		} else if (!cdCampo.equals(other.cdCampo))
			return false;
		if (cdEmpresa == null) {
			if (other.cdEmpresa != null)
				return false;
		} else if (!cdEmpresa.equals(other.cdEmpresa))
			return false;
		if (cdFonte == null) {
			if (other.cdFonte != null)
				return false;
		} else if (!cdFonte.equals(other.cdFonte))
			return false;
		return true;
	}
}
