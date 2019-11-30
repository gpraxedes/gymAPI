package com.cotemig.gymAPI.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Null;

@Entity
public class Modalidade {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String nome;

	@Null
	private Boolean aerobico;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="professor_id", nullable = false) 
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

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
