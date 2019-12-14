package com.goplayer.application.domain.configuracao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UsuarioPK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="cd_empresa")
	private String cdEmpresa;
	
	@Column(name="cd_usuario")
	private String cdUsuario;
	
	@Column(name="de_email")
	private String deEmail;
	
	@Column(name="cd_perfil")
	private String cdPerfil;

	public String getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(String cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public String getCdUsuario() {
		return cdUsuario;
	}

	public void setCdUsuario(String cdUsuario) {
		this.cdUsuario = cdUsuario;
	}

	public String getDeEmail() {
		return deEmail;
	}

	public void setDeEmail(String deEmail) {
		this.deEmail = deEmail;
	}

	public String getCdPerfil() {
		return cdPerfil;
	}

	public void setCdPerfil(String cdPerfil) {
		this.cdPerfil = cdPerfil;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdEmpresa == null) ? 0 : cdEmpresa.hashCode());
		result = prime * result + ((cdPerfil == null) ? 0 : cdPerfil.hashCode());
		result = prime * result + ((cdUsuario == null) ? 0 : cdUsuario.hashCode());
		result = prime * result + ((deEmail == null) ? 0 : deEmail.hashCode());
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
		UsuarioPK other = (UsuarioPK) obj;
		if (cdEmpresa == null) {
			if (other.cdEmpresa != null)
				return false;
		} else if (!cdEmpresa.equals(other.cdEmpresa))
			return false;
		if (cdPerfil == null) {
			if (other.cdPerfil != null)
				return false;
		} else if (!cdPerfil.equals(other.cdPerfil))
			return false;
		if (cdUsuario == null) {
			if (other.cdUsuario != null)
				return false;
		} else if (!cdUsuario.equals(other.cdUsuario))
			return false;
		if (deEmail == null) {
			if (other.deEmail != null)
				return false;
		} else if (!deEmail.equals(other.deEmail))
			return false;
		return true;
	}
}
