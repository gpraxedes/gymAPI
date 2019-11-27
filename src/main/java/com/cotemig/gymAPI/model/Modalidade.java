package com.cotemig.gymAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Null;

@Entity
public class Modalidade {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String nome;

	@Null
	private Boolean aerobico;
	
	@Null
	@ManyToOne
	private Professor professor;

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
