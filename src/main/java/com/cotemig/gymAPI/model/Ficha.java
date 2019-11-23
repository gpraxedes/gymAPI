package com.cotemig.gymAPI.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Null;

@Entity
public class Ficha {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String tipoFicha; //HIPERTROFIA, EMAGRECIMENT0, DEFINIÇÃO;
	
	private String fichaLetra;
	
	@Null
	@ManyToOne
	private Professor professor;
	
	@Null
	@ManyToOne
	private Aluno aluno;
	
	@Null
	@OneToMany(mappedBy = "ficha", cascade = CascadeType.ALL)
	private List<ItemFicha> itens;

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

//	public Professor getProfessor() {
//		return professor;
//	}
//
//	public void setProfessor(Professor professor) {
//		this.professor = professor;
//	}
//
//	public Atleta getAtleta() {
//		return atleta;
//	}
//
//	public void setAtleta(Atleta atleta) {
//		this.atleta = atleta;
//	}

//	public List<ItemFicha> getItens() {
//		return itens;
//	}
//
//	public void setItem(ItemFicha item) {
//		this.itens.add(item);
//	}
//	
//	public void setItens(List<ItemFicha> itens) {
//
//		for (ItemFicha item : itens) {
//			setItem(item);
//		}
//	}


	public Integer getId() {
		return id;
	}

	
}
