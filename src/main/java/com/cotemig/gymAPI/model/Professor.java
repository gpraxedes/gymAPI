package com.cotemig.gymAPI.model;

import java.util.List;

import javax.persistence.ManyToOne;

public class Professor extends Funcionario {

	@ManyToOne
	private List<Modalidade> modalidades;

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
	
}
