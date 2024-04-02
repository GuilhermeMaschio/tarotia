package com.maschio.tarotia.domain;

public class Carta {
	
	private String nome;
	private String descricao;
	private String significado;
	private String significadoReverso;
	
	public Carta(String nome, String descricao, String significado, String significadoReverso) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.significado = significado;
		this.significadoReverso = significadoReverso;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSignificado() {
		return significado;
	}
	public void setSignificado(String significado) {
		this.significado = significado;
	}
	public String getSignificadoReverso() {
		return significadoReverso;
	}
	public void setSignificadoReverso(String significadoReverso) {
		this.significadoReverso = significadoReverso;
	}
	
}
