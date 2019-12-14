package com.goplayer.application.domain.configuracao.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="conf_layout_areas")
public class LayoutAreas implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private LayoutAreasPK id;
	
	@Column(name="fl_principal")
	private Integer flPrincipal;
	
	@Column(name="cd_fonterss")
	private String cdFonterss;
	
	@Column(name="de_largura")
	private Integer deLargura;
	
	@Column(name="de_altura")
	private Integer deAltura;
	
	@Column(name="de_top")
	private Integer deTop;
	
	@Column(name="de_left")
	private Integer deLeft;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public LayoutAreasPK getId() {
		return id;
	}

	public void setId(LayoutAreasPK id) {
		this.id = id;
	}

	public Integer getFlPrincipal() {
		return flPrincipal;
	}

	public void setFlPrincipal(Integer flPrincipal) {
		this.flPrincipal = flPrincipal;
	}

	public String getCdFonterss() {
		return cdFonterss;
	}

	public void setCdFonterss(String cdFonterss) {
		this.cdFonterss = cdFonterss;
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

	public Integer getDeTop() {
		return deTop;
	}

	public void setDeTop(Integer deTop) {
		this.deTop = deTop;
	}

	public Integer getDeLeft() {
		return deLeft;
	}

	public void setDeLeft(Integer deLeft) {
		this.deLeft = deLeft;
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
