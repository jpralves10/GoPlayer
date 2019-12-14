package com.goplayer.application.domain.players.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="pla_players")
public class Players implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private PlayersPK id;
	
	@Column(name="nm_player")
	private String nm_player;
	
	@Column(name="cd_plataforma")
	private Integer cdPlataforma;
	
	@Column(name="cd_grupo")
	private String cdGrupo;
	
	@Column(name="cd_playlist_dom")
	private String cdPlaylistDom;
	
	@Column(name="cd_playlist_seg")
	private String cdPlaylistSeg;
	
	@Column(name="cd_playlist_ter")
	private String cdPlaylistTer;
	
	@Column(name="cd_playlist_qua")
	private String cdPlaylistQua;
	
	@Column(name="cd_playlist_qui")
	private String cdPlaylistQui;
	
	@Column(name="cd_playlist_sex")
	private String cdPlaylistSex;
	
	@Column(name="cd_playlist_sab")
	private String cdPlaylistSab;
	
	@Column(name="cd_playlist_audio")
	private String cdPlaylistAudio;
	
	@Column(name="de_player")
	private String dePlayer;
	
	@Column(name="de_logradouro")
	private String deLogradouro;
	
	@Column(name="de_numero")
	private Integer deNumero;
	
	@Column(name="de_complemento")
	private String deComplemento;
	
	@Column(name="de_bairro")
	private String deBairro;
	
	@Column(name="de_estado")
	private String deEstado;

	@Column(name="de_cidade")
	private String deCidade;
	
	@Column(name="de_cep")
	private Date deCep;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public PlayersPK getId() {
		return id;
	}

	public void setId(PlayersPK id) {
		this.id = id;
	}

	public String getNm_player() {
		return nm_player;
	}

	public void setNm_player(String nm_player) {
		this.nm_player = nm_player;
	}

	public Integer getCdPlataforma() {
		return cdPlataforma;
	}

	public void setCdPlataforma(Integer cdPlataforma) {
		this.cdPlataforma = cdPlataforma;
	}

	public String getCdGrupo() {
		return cdGrupo;
	}

	public void setCdGrupo(String cdGrupo) {
		this.cdGrupo = cdGrupo;
	}

	public String getCdPlaylistDom() {
		return cdPlaylistDom;
	}

	public void setCdPlaylistDom(String cdPlaylistDom) {
		this.cdPlaylistDom = cdPlaylistDom;
	}

	public String getCdPlaylistSeg() {
		return cdPlaylistSeg;
	}

	public void setCdPlaylistSeg(String cdPlaylistSeg) {
		this.cdPlaylistSeg = cdPlaylistSeg;
	}

	public String getCdPlaylistTer() {
		return cdPlaylistTer;
	}

	public void setCdPlaylistTer(String cdPlaylistTer) {
		this.cdPlaylistTer = cdPlaylistTer;
	}

	public String getCdPlaylistQua() {
		return cdPlaylistQua;
	}

	public void setCdPlaylistQua(String cdPlaylistQua) {
		this.cdPlaylistQua = cdPlaylistQua;
	}

	public String getCdPlaylistQui() {
		return cdPlaylistQui;
	}

	public void setCdPlaylistQui(String cdPlaylistQui) {
		this.cdPlaylistQui = cdPlaylistQui;
	}

	public String getCdPlaylistSex() {
		return cdPlaylistSex;
	}

	public void setCdPlaylistSex(String cdPlaylistSex) {
		this.cdPlaylistSex = cdPlaylistSex;
	}

	public String getCdPlaylistSab() {
		return cdPlaylistSab;
	}

	public void setCdPlaylistSab(String cdPlaylistSab) {
		this.cdPlaylistSab = cdPlaylistSab;
	}

	public String getCdPlaylistAudio() {
		return cdPlaylistAudio;
	}

	public void setCdPlaylistAudio(String cdPlaylistAudio) {
		this.cdPlaylistAudio = cdPlaylistAudio;
	}

	public String getDePlayer() {
		return dePlayer;
	}

	public void setDePlayer(String dePlayer) {
		this.dePlayer = dePlayer;
	}

	public String getDeLogradouro() {
		return deLogradouro;
	}

	public void setDeLogradouro(String deLogradouro) {
		this.deLogradouro = deLogradouro;
	}

	public Integer getDeNumero() {
		return deNumero;
	}

	public void setDeNumero(Integer deNumero) {
		this.deNumero = deNumero;
	}

	public String getDeComplemento() {
		return deComplemento;
	}

	public void setDeComplemento(String deComplemento) {
		this.deComplemento = deComplemento;
	}

	public String getDeBairro() {
		return deBairro;
	}

	public void setDeBairro(String deBairro) {
		this.deBairro = deBairro;
	}

	public String getDeEstado() {
		return deEstado;
	}

	public void setDeEstado(String deEstado) {
		this.deEstado = deEstado;
	}

	public String getDeCidade() {
		return deCidade;
	}

	public void setDeCidade(String deCidade) {
		this.deCidade = deCidade;
	}

	public Date getDeCep() {
		return deCep;
	}

	public void setDeCep(Date deCep) {
		this.deCep = deCep;
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
