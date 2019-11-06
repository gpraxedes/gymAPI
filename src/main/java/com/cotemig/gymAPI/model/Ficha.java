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

	private String tipoFicha; //HIPERTROFIA, EMAGRECIMENT0, DEFINIÇÃO;
	
	private String fichaLetra;
	
	@OneToOne
	private Professor professor;
	
	@OneToOne
	private Aluno aluno;
	
	@OneToMany
	private List<ItemFicha> itens;
	
	private Boolean ativo;

	public String getTipoFicha() {
		return tipoFicha;
	}

	public void setTipoFicha(String tipoFicha) {
		this.tipoFicha = tipoFicha;
	}

	public String getFichaLetra() {
		return fichaLetra;
	}

	public void setFichaLetra(String fichaLetra) {
		this.fichaLetra = fichaLetra;
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

	public void setItem(ItemFicha item) {
		this.itens.add(item);
	}
	
	public void setItens(List<ItemFicha> itens) {

		for (ItemFicha item : itens) {
			setItem(item);
		}
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
