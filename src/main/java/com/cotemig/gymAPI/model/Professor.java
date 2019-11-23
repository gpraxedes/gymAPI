package com.cotemig.gymAPI.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Null;

@Entity
public class Professor extends Funcionario {

	@Null
	@OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
	private List<Modalidade> modalidades;
	
	@Null
	@OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
	private List<Ficha> fichas;

	public List<Modalidade> getModalidades() {
		return modalidades;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidades.add(modalidade);
	}
	
	public void setModalidades(List<Modalidade> modalidades) {

		for(Modalidade modalidade : modalidades) {
			setModalidade(modalidade);
		}
	}

	public List<Ficha> getFichas() {
		return fichas;
	}

	public void setFichas(List<Ficha> fichas) {
		this.fichas = fichas;
	}
	
	public void setFicha(Ficha ficha) {
		this.fichas.add(ficha);
		
	}
	
}
