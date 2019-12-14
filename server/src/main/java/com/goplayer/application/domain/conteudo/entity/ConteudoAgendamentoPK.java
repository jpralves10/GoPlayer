package com.goplayer.application.domain.conteudo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ConteudoAgendamentoPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="cd_empresa")
	private String cdEmpresa;
	
	@Column(name="cd_conteudo")
	private String cdConteudo;
	
	@Column(name="cd_agendamento")
	private String cdAgendamento;
	
	public String getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(String cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public String getCdConteudo() {
		return cdConteudo;
	}

	public void setCdConteudo(String cdConteudo) {
		this.cdConteudo = cdConteudo;
	}

	public String getCdAgendamento() {
		return cdAgendamento;
	}

	public void setCdAgendamento(String cdAgendamento) {
		this.cdAgendamento = cdAgendamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdAgendamento == null) ? 0 : cdAgendamento.hashCode());
		result = prime * result + ((cdConteudo == null) ? 0 : cdConteudo.hashCode());
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
		ConteudoAgendamentoPK other = (ConteudoAgendamentoPK) obj;
		if (cdAgendamento == null) {
			if (other.cdAgendamento != null)
				return false;
		} else if (!cdAgendamento.equals(other.cdAgendamento))
			return false;
		if (cdConteudo == null) {
			if (other.cdConteudo != null)
				return false;
		} else if (!cdConteudo.equals(other.cdConteudo))
			return false;
		if (cdEmpresa == null) {
			if (other.cdEmpresa != null)
				return false;
		} else if (!cdEmpresa.equals(other.cdEmpresa))
			return false;
		return true;
	}
}
