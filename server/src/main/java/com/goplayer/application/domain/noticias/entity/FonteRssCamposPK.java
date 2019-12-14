package com.goplayer.application.domain.noticias.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FonteRssCamposPK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="cd_empresa")
	private String cdEmpresa;
	
	@Column(name="cd_fonterss")
	private String cdFonterss;
	
	@Column(name="cd_campo")
	private String cdCampo;

	public String getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(String cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public String getCdFonterss() {
		return cdFonterss;
	}

	public void setCdFonterss(String cdFonterss) {
		this.cdFonterss = cdFonterss;
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
		result = prime * result + ((cdFonterss == null) ? 0 : cdFonterss.hashCode());
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
		FonteRssCamposPK other = (FonteRssCamposPK) obj;
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
		if (cdFonterss == null) {
			if (other.cdFonterss != null)
				return false;
		} else if (!cdFonterss.equals(other.cdFonterss))
			return false;
		return true;
	}
}
