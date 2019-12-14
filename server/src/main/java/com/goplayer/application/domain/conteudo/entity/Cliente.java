package com.goplayer.application.domain.conteudo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cont_cliente")
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ClientePK id;
	
	@Column(name="nm_cliente")
	private String nmCliente;
	
	@Column(name="fl_tipo_cliente")
	private Integer flTipoCliente;
	
	@Column(name="cd_agencia")
	private String cdAgencia;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public ClientePK getId() {
		return id;
	}

	public void setId(ClientePK id) {
		this.id = id;
	}

	public String getNmCliente() {
		return nmCliente;
	}

	public void setNmCliente(String nmCliente) {
		this.nmCliente = nmCliente;
	}

	public Integer getFlTipoCliente() {
		return flTipoCliente;
	}

	public void setFlTipoCliente(Integer flTipoCliente) {
		this.flTipoCliente = flTipoCliente;
	}

	public String getCdAgencia() {
		return cdAgencia;
	}

	public void setCdAgencia(String cdAgencia) {
		this.cdAgencia = cdAgencia;
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
