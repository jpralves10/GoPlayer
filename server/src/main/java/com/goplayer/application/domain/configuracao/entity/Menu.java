package com.goplayer.application.domain.configuracao.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="conf_menu")
public class Menu implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private MenuPK id;
	
	@Column(name="nm_menu")
	private String nmMenu;
	
	@Column(name="de_menu")
	private String deMenu;
	
	@Column(name="cd_menu_pai")
	private String cdMenuPai;
	
	@Column(name="de_tipo")
	private String deTipo;
	
	@Column(name="de_url")
	private String deUrl;
	
	@Column(name="cd_nivel")
	private Integer cdNivel;
	
	@Column(name="de_icone")
	private String deIcone;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public MenuPK getId() {
		return id;
	}

	public void setId(MenuPK id) {
		this.id = id;
	}

	public String getNmMenu() {
		return nmMenu;
	}

	public void setNmMenu(String nmMenu) {
		this.nmMenu = nmMenu;
	}

	public String getDeMenu() {
		return deMenu;
	}

	public void setDeMenu(String deMenu) {
		this.deMenu = deMenu;
	}

	public String getCdMenuPai() {
		return cdMenuPai;
	}

	public void setCdMenuPai(String cdMenuPai) {
		this.cdMenuPai = cdMenuPai;
	}

	public String getDeTipo() {
		return deTipo;
	}

	public void setDeTipo(String deTipo) {
		this.deTipo = deTipo;
	}

	public String getDeUrl() {
		return deUrl;
	}

	public void setDeUrl(String deUrl) {
		this.deUrl = deUrl;
	}

	public Integer getCdNivel() {
		return cdNivel;
	}

	public void setCdNivel(Integer cdNivel) {
		this.cdNivel = cdNivel;
	}

	public String getDeIcone() {
		return deIcone;
	}

	public void setDeIcone(String deIcone) {
		this.deIcone = deIcone;
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
