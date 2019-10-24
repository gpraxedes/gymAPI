package com.cotemig.gymAPI.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Modalidade {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String nome;

	private Boolean aerobico;

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getAerobico() {
		return aerobico;
	}

	public void setAerobico(Boolean aerobico) {
		this.aerobico = aerobico;
	}
	
	
}
