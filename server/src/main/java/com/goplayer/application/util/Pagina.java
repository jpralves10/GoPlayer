package com.goplayer.application.util;

import java.util.ArrayList;
import java.util.List;

public class Pagina {
	
	private String cdEmpresa;
	private String deParametros;
	private String deMensagem;
	private String nuPagina;
	private String qtPaginas;
	private String qtRegistros;
	private String qtRegistrosPagina;
	
	private List<String> registros = new ArrayList<String>();
	
	public String getCdEmpresa() {
		return cdEmpresa;
	}
	public void setCdEmpresa(String cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}
	public String getDeParametros() {
		return deParametros;
	}
	public void setDeParametros(String deParametros) {
		this.deParametros = deParametros;
	}
	public String getDeMensagem() {
		return deMensagem;
	}
	public void setDeMensagem(String deMensagem) {
		this.deMensagem = deMensagem;
	}
	public String getNuPagina() {
		return nuPagina;
	}
	public void setNuPagina(String nuPagina) {
		this.nuPagina = nuPagina;
	}
	public String getQtPaginas() {
		return qtPaginas;
	}
	public void setQtPaginas(String qtPaginas) {
		this.qtPaginas = qtPaginas;
	}
	public String getQtRegistros() {
		return qtRegistros;
	}
	public void setQtRegistros(String qtRegistros) {
		this.qtRegistros = qtRegistros;
	}
	public String getQtRegistrosPagina() {
		return qtRegistrosPagina;
	}
	public void setQtRegistrosPagina(String qtRegistrosPagina) {
		this.qtRegistrosPagina = qtRegistrosPagina;
	}
	public List<String> getRegistros() {
		return registros;
	}
	public void setRegistros(List<String> registros) {
		this.registros = registros;
	}
}