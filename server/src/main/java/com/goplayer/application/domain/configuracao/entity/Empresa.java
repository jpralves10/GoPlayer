package com.goplayer.application.domain.configuracao.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="conf_empresa")
public class Empresa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private EmpresaPK id;
	
	@Column(name="nm_nome")
	private String nmNome;
	
	@Column(name="de_cnpj")
	private Integer deCnpj;
	
	@Column(name="de_cpf")
	private Integer deCpf;
	
	@Column(name="fl_ativo")
	private Integer flAtivo;
	
	@Column(name="de_email")
	private Integer deEmail;
	
	@Column(name="nu_telefone")
	private String nuTelefone;
	
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

	public EmpresaPK getId() {
		return id;
	}

	public void setId(EmpresaPK id) {
		this.id = id;
	}

	public String getNmNome() {
		return nmNome;
	}

	public void setNmNome(String nmNome) {
		this.nmNome = nmNome;
	}

	public Integer getDeCnpj() {
		return deCnpj;
	}

	public void setDeCnpj(Integer deCnpj) {
		this.deCnpj = deCnpj;
	}

	public Integer getDeCpf() {
		return deCpf;
	}

	public void setDeCpf(Integer deCpf) {
		this.deCpf = deCpf;
	}

	public Integer getFlAtivo() {
		return flAtivo;
	}

	public void setFlAtivo(Integer flAtivo) {
		this.flAtivo = flAtivo;
	}

	public Integer getDeEmail() {
		return deEmail;
	}

	public void setDeEmail(Integer deEmail) {
		this.deEmail = deEmail;
	}

	public String getNuTelefone() {
		return nuTelefone;
	}

	public void setNuTelefone(String nuTelefone) {
		this.nuTelefone = nuTelefone;
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
