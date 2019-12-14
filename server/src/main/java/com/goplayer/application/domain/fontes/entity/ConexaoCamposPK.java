package com.goplayer.application.domain.fontes.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ConexaoCamposPK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="cd_empresa")
	private String cdEmpresa;
	
	@Column(name="cd_conexao")
	private String cdConexao;
	
	@Column(name="cd_campo")
	private String cdCampo;

	public String getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(String cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public String getCdConexao() {
		return cdConexao;
	}

	public void setCdConexao(String cdConexao) {
		this.cdConexao = cdConexao;
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
		result = prime * result + ((cdConexao == null) ? 0 : cdConexao.hashCode());
		result = prime * result + ((cdEmpresa == null) ? 0 : cdEmpresa.hashCode());
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
		ConexaoCamposPK other = (ConexaoCamposPK) obj;
		if (cdCampo == null) {
			if (other.cdCampo != null)
				return false;
		} else if (!cdCampo.equals(other.cdCampo))
			return false;
		if (cdConexao == null) {
			if (other.cdConexao != null)
				return false;
		} else if (!cdConexao.equals(other.cdConexao))
			return false;
		if (cdEmpresa == null) {
			if (other.cdEmpresa != null)
				return false;
		} else if (!cdEmpresa.equals(other.cdEmpresa))
			return false;
		return true;
	}
}
