package com.cotemig.gymAPI.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Ficha {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private TipoFichaEnum tipoFicha;
	
	private FichaEnum ficha;
	
	@OneToOne
	private Professor professor;
	
	@OneToOne
	private Aluno aluno;
	
	@OneToMany
	private List<ItemFicha> itens;
	
	private Boolean ativo;

	public TipoFichaEnum getTipoFicha() {
		return tipoFicha;
	}

	public void setTipoFicha(TipoFichaEnum tipoFicha) {
		this.tipoFicha = tipoFicha;
	}

	public FichaEnum getFicha() {
		return ficha;
	}

	public void setFicha(FichaEnum ficha) {
		this.ficha = ficha;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<ItemFicha> getItens() {
		return itens;
	}

	public void setItens(List<ItemFicha> itens) {
		this.itens = itens;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Integer getId() {
		return id;
	}
	

	
}
