package com.goplayer.application.domain.configuracao.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="conf_usuario")
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private UsuarioPK id;
	
	@Column(name="nm_usuario")
	private String nmUsuario;
	
	@Column(name="fl_principal")
	private Integer flPrincipal;
	
	@Column(name="fl_ativo")
	private Integer flAtivo;
	
	@Column(name="cd_restricao")
	private String cdRestricao;
	
	@Column(name="de_senha")
	private String deSenha;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public UsuarioPK getId() {
		return id;
	}

	public void setId(UsuarioPK id) {
		this.id = id;
	}

	public String getNmUsuario() {
		return nmUsuario;
	}

	public void setNmUsuario(String nmUsuario) {
		this.nmUsuario = nmUsuario;
	}

	public String getCdRestricao() {
		return cdRestricao;
	}

	public void setCdRestricao(String cdRestricao) {
		this.cdRestricao = cdRestricao;
	}

	public String getDeSenha() {
		return deSenha;
	}

	public void setDeSenha(String deSenha) {
		this.deSenha = deSenha;
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
