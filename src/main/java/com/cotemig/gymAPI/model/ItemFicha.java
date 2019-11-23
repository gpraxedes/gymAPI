package com.cotemig.gymAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Null;

@Entity
public class ItemFicha {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Null
	@OneToOne
	private Exercicio exercicio;
	
	private String descricao;
	
	private Integer serie;
	
	private Integer repeticao;
	
	private Integer descanso;

	@Null
	@ManyToOne
	private Ficha ficha;
	
	public Exercicio getExercicio() {
		return exercicio;
	}

	public void setExercicio(Exercicio exercicio) {
		this.exercicio = exercicio;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getSerie() {
		return serie;
	}

	public void setSerie(Integer serie) {
		this.serie = serie;
	}

	public Integer getRepeticao() {
		return repeticao;
	}

	public void setRepeticao(Integer repeticao) {
		this.repeticao = repeticao;
	}

	public Integer getDescanso() {
		return descanso;
	}

	public void setDescanso(Integer descanso) {
		this.descanso = descanso;
	}

	public Integer getId() {
		return id;
	}

}
