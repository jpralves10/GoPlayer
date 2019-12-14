package com.goplayer.application.domain.conteudo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cont_categoria")
public class Categoria implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private CategoriaPK id;
	
	@Column(name="nm_categoria")
	private String nmCategoria;
	
	@Column(name="de_categoria")
	private String deCategoria;
	
	@Column(name="cd_categoria_pai")
	private String cdCategoriaPai;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public CategoriaPK getId() {
		return id;
	}

	public void setId(CategoriaPK id) {
		this.id = id;
	}

	public String getNmCategoria() {
		return nmCategoria;
	}

	public void setNmCategoria(String nmCategoria) {
		this.nmCategoria = nmCategoria;
	}

	public String getDeCategoria() {
		return deCategoria;
	}

	public void setDeCategoria(String deCategoria) {
		this.deCategoria = deCategoria;
	}

	public String getCdCategoriaPai() {
		return cdCategoriaPai;
	}

	public void setCdCategoriaPai(String cdCategoriaPai) {
		this.cdCategoriaPai = cdCategoriaPai;
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
