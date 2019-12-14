package com.goplayer.application.domain.configuracao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LayoutAreasPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="cd_empresa")
	private String cdEmpresa;
	
	@Column(name="cd_layout")
	private String cdLayout;
	
	@Column(name="cd_area")
	private String cdArea;
	
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

	public String getCdArea() {
		return cdArea;
	}

	public void setCdArea(String cdArea) {
		this.cdArea = cdArea;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdArea == null) ? 0 : cdArea.hashCode());
		result = prime * result + ((cdEmpresa == null) ? 0 : cdEmpresa.hashCode());
		result = prime * result + ((cdLayout == null) ? 0 : cdLayout.hashCode());
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
		LayoutAreasPK other = (LayoutAreasPK) obj;
		if (cdArea == null) {
			if (other.cdArea != null)
				return false;
		} else if (!cdArea.equals(other.cdArea))
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
		return true;
	}
}
