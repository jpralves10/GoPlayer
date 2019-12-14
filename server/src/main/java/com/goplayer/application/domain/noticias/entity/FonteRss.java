package com.goplayer.application.domain.noticias.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="not_fonterss")
public class FonteRss implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private FonteRssPK id;
	
	@Column(name="nm_nome")
	private String nmNome;
	
	@Column(name="de_endereco_rss")
	private String deEnderecoRss;
	
	@Column(name="cd_canal")
	private String cdCanal;
	
	@Column(name="cd_captura_texto")
	private String cdCapturaTexto;
	
	@Column(name="de_captura_texto")
	private String deCapturaTexto;
	
	@Column(name="cd_captura_imagem")
	private Integer cdUCapturaImagem;
	
	@Column(name="de_captura_imagem")
	private String deCapturaImagem;
	
	@Column(name="fl_ativo")
	private Integer flAtivo;
	
	@Column(name="fl_noticias_fotos")
	private Integer flNoticias_fotos;
	
	@Column(name="fl_aprovacao_automatica")
	private Integer flAprovacaoAutomatica;
	
	@Column(name="nu_limite")
	private Integer nuLimite;
	
	@Column(name="nu_duracao")
	private Integer nuDuracao;
	
	@Column(name="nu_peso")
	private Integer nuPeso;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public FonteRssPK getId() {
		return id;
	}

	public void setId(FonteRssPK id) {
		this.id = id;
	}

	public String getNmNome() {
		return nmNome;
	}

	public void setNmNome(String nmNome) {
		this.nmNome = nmNome;
	}

	public String getDeEnderecoRss() {
		return deEnderecoRss;
	}

	public void setDeEnderecoRss(String deEnderecoRss) {
		this.deEnderecoRss = deEnderecoRss;
	}

	public String getCdCanal() {
		return cdCanal;
	}

	public void setCdCanal(String cdCanal) {
		this.cdCanal = cdCanal;
	}

	public String getCdCapturaTexto() {
		return cdCapturaTexto;
	}

	public void setCdCapturaTexto(String cdCapturaTexto) {
		this.cdCapturaTexto = cdCapturaTexto;
	}

	public String getDeCapturaTexto() {
		return deCapturaTexto;
	}

	public void setDeCapturaTexto(String deCapturaTexto) {
		this.deCapturaTexto = deCapturaTexto;
	}

	public Integer getCdUCapturaImagem() {
		return cdUCapturaImagem;
	}

	public void setCdUCapturaImagem(Integer cdUCapturaImagem) {
		this.cdUCapturaImagem = cdUCapturaImagem;
	}

	public String getDeCapturaImagem() {
		return deCapturaImagem;
	}

	public void setDeCapturaImagem(String deCapturaImagem) {
		this.deCapturaImagem = deCapturaImagem;
	}

	public Integer getFlAtivo() {
		return flAtivo;
	}

	public void setFlAtivo(Integer flAtivo) {
		this.flAtivo = flAtivo;
	}

	public Integer getFlNoticias_fotos() {
		return flNoticias_fotos;
	}

	public void setFlNoticias_fotos(Integer flNoticias_fotos) {
		this.flNoticias_fotos = flNoticias_fotos;
	}

	public Integer getFlAprovacaoAutomatica() {
		return flAprovacaoAutomatica;
	}

	public void setFlAprovacaoAutomatica(Integer flAprovacaoAutomatica) {
		this.flAprovacaoAutomatica = flAprovacaoAutomatica;
	}

	public Integer getNuLimite() {
		return nuLimite;
	}

	public void setNuLimite(Integer nuLimite) {
		this.nuLimite = nuLimite;
	}

	public Integer getNuDuracao() {
		return nuDuracao;
	}

	public void setNuDuracao(Integer nuDuracao) {
		this.nuDuracao = nuDuracao;
	}

	public Integer getNuPeso() {
		return nuPeso;
	}

	public void setNuPeso(Integer nuPeso) {
		this.nuPeso = nuPeso;
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
