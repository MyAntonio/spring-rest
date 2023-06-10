package com.progetto.controller;

public class Utente {

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	private String nome;
	private String cognome;
	
	public Utente() {
		super();
	}
	
}
