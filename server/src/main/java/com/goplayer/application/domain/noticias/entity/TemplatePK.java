package com.goplayer.application.domain.noticias.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TemplatePK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="cd_empresa")
	private String cdEmpresa;
	
	@Column(name="cd_template")
	private String cdTemplate;

	public String getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(String cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public String getCdTemplate() {
		return cdTemplate;
	}

	public void setCdTemplate(String cdTemplate) {
		this.cdTemplate = cdTemplate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdEmpresa == null) ? 0 : cdEmpresa.hashCode());
		result = prime * result + ((cdTemplate == null) ? 0 : cdTemplate.hashCode());
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
		TemplatePK other = (TemplatePK) obj;
		if (cdEmpresa == null) {
			if (other.cdEmpresa != null)
				return false;
		} else if (!cdEmpresa.equals(other.cdEmpresa))
			return false;
		if (cdTemplate == null) {
			if (other.cdTemplate != null)
				return false;
		} else if (!cdTemplate.equals(other.cdTemplate))
			return false;
		return true;
	}
}
