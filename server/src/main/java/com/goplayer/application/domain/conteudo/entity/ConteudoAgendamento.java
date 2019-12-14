package com.goplayer.application.domain.conteudo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cont_conteudo_agendamento")
public class ConteudoAgendamento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ConteudoAgendamentoPK id;
	
	@Column(name="qt_hora_inicial")
	private String qtHoraInicial;
	
	@Column(name="qt_hora_final")
	private String qtHoraFinal;
	
	@Column(name="fl_domingo")
	private Integer flDomingo;
	
	@Column(name="fl_segunda")
	private Integer flSegunda;
	
	@Column(name="fl_terca")
	private Integer flTerca;
	
	@Column(name="fl_quarta")
	private Integer flQuarta;
	
	@Column(name="fl_quinta")
	private Integer flQuinta;
	
	@Column(name="fl_sexta")
	private Integer flSexta;
	
	@Column(name="fl_sabado")
	private Integer flSabado;
	
	@Column(name="cd_usuario_atualizacao")
	private String cdUsuarioAtualizacao;
	
	@Column(name="dt_atualizacao")
	private Date dtAtualizacao;

	public ConteudoAgendamentoPK getId() {
		return id;
	}

	public void setId(ConteudoAgendamentoPK id) {
		this.id = id;
	}

	public String getQtHoraInicial() {
		return qtHoraInicial;
	}

	public void setQtHoraInicial(String qtHoraInicial) {
		this.qtHoraInicial = qtHoraInicial;
	}

	public String getQtHoraFinal() {
		return qtHoraFinal;
	}

	public void setQtHoraFinal(String qtHoraFinal) {
		this.qtHoraFinal = qtHoraFinal;
	}

	public Integer getFlDomingo() {
		return flDomingo;
	}

	public void setFlDomingo(Integer flDomingo) {
		this.flDomingo = flDomingo;
	}

	public Integer getFlSegunda() {
		return flSegunda;
	}

	public void setFlSegunda(Integer flSegunda) {
		this.flSegunda = flSegunda;
	}

	public Integer getFlTerca() {
		return flTerca;
	}

	public void setFlTerca(Integer flTerca) {
		this.flTerca = flTerca;
	}

	public Integer getFlQuarta() {
		return flQuarta;
	}

	public void setFlQuarta(Integer flQuarta) {
		this.flQuarta = flQuarta;
	}

	public Integer getFlQuinta() {
		return flQuinta;
	}

	public void setFlQuinta(Integer flQuinta) {
		this.flQuinta = flQuinta;
	}

	public Integer getFlSexta() {
		return flSexta;
	}

	public void setFlSexta(Integer flSexta) {
		this.flSexta = flSexta;
	}

	public Integer getFlSabado() {
		return flSabado;
	}

	public void setFlSabado(Integer flSabado) {
		this.flSabado = flSabado;
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