package com.goplayer.application.domain.configuracao.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="conf_layout")
public class Layout implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private LayoutPK id;
	
	@Column(name="nm_layout")
	private String nmLayout;
	
	@Column(name="de_layout")
	private String deLayout;
	
	@Column(name="de_largura")
	private Integer deLargura;
	
	@Column(name="de_altura")
	private Integer deAltura;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public LayoutPK getId() {
		return id;
	}

	public void setId(LayoutPK id) {
		this.id = id;
	}

	public String getNmLayout() {
		return nmLayout;
	}

	public void setNmLayout(String nmLayout) {
		this.nmLayout = nmLayout;
	}

	public String getDeLayout() {
		return deLayout;
	}

	public void setDeLayout(String deLayout) {
		this.deLayout = deLayout;
	}

	public Integer getDeLargura() {
		return deLargura;
	}

	public void setDeLargura(Integer deLargura) {
		this.deLargura = deLargura;
	}

	public Integer getDeAltura() {
		return deAltura;
	}

	public void setDeAltura(Integer deAltura) {
		this.deAltura = deAltura;
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
