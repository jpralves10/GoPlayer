package com.goplayer.application.domain.noticias.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="not_noticia")
public class Noticia implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private NoticiaPK id;
	
	@Column(name="qt_hora_min_inicio")
	private String qtHoraMinInicio;
	
	@Column(name="qt_hora_min_fim")
	private String qtHoraMinFim;
	
	@Column(name="dt_validade_inicial")
	private Date dtValidadeInicial;
	
	@Column(name="dt_validade_final")
	private Date dtValidadeFinal;
	
	@Column(name="de_conteudo")
	private String deConteudo;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public NoticiaPK getId() {
		return id;
	}

	public void setId(NoticiaPK id) {
		this.id = id;
	}

	public String getQtHoraMinInicio() {
		return qtHoraMinInicio;
	}

	public void setQtHoraMinInicio(String qtHoraMinInicio) {
		this.qtHoraMinInicio = qtHoraMinInicio;
	}

	public String getQtHoraMinFim() {
		return qtHoraMinFim;
	}

	public void setQtHoraMinFim(String qtHoraMinFim) {
		this.qtHoraMinFim = qtHoraMinFim;
	}

	public Date getDtValidadeInicial() {
		return dtValidadeInicial;
	}

	public void setDtValidadeInicial(Date dtValidadeInicial) {
		this.dtValidadeInicial = dtValidadeInicial;
	}

	public Date getDtValidadeFinal() {
		return dtValidadeFinal;
	}

	public void setDtValidadeFinal(Date dtValidadeFinal) {
		this.dtValidadeFinal = dtValidadeFinal;
	}

	public String getDeConteudo() {
		return deConteudo;
	}

	public void setDeConteudo(String deConteudo) {
		this.deConteudo = deConteudo;
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
