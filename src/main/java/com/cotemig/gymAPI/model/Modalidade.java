package com.cotemig.gymAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.Nullable;

@Entity
public class Modalidade {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String nome;

	private Boolean aerobico;
	
	//private Integer professor_id;

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

	public void setId(Integer id) {
		this.id = id;
	}

}
