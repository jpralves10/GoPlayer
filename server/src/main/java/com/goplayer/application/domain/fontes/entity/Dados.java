package com.goplayer.application.domain.fontes.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="font_dados")
public class Dados implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private DadosPK id;
	
	@Column(name="nm_dados")
	private String nmDados;
	
	@Column(name="de_consulta")
	private String deConsulta;
	
	@Column(name="fl_agrupar_registros")
	private Integer flAgruparRegistros;
	
	@Column(name="qt_linhas_ignorar")
	private Integer qtLinhasIgnorar;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public DadosPK getId() {
		return id;
	}

	public void setId(DadosPK id) {
		this.id = id;
	}

	public String getNmDados() {
		return nmDados;
	}

	public void setNmDados(String nmDados) {
		this.nmDados = nmDados;
	}

	public String getDeConsulta() {
		return deConsulta;
	}

	public void setDeConsulta(String deConsulta) {
		this.deConsulta = deConsulta;
	}

	public Integer getFlAgruparRegistros() {
		return flAgruparRegistros;
	}

	public void setFlAgruparRegistros(Integer flAgruparRegistros) {
		this.flAgruparRegistros = flAgruparRegistros;
	}

	public Integer getQtLinhasIgnorar() {
		return qtLinhasIgnorar;
	}

	public void setQtLinhasIgnorar(Integer qtLinhasIgnorar) {
		this.qtLinhasIgnorar = qtLinhasIgnorar;
	}

	public String getCdUsuarioAtualizacao() {
		return cdUsuarioAtualizacao;
	}

	public void setCdUsuarioAtualizacao(String cdUsuarioAtualizacao) {
		this.cdUsuarioAtualizacao = cdUsuarioAtualizacao;
	}

	public Date getDtAtualizacao() {
		return dtAtualizacao;
	}

	public void setDtAtualizacao(Date dtAtualizacao) {
		this.dtAtualizacao = dtAtualizacao;
	}
}
