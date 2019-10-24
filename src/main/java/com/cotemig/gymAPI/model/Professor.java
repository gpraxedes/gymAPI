package com.cotemig.gymAPI.model;

import java.util.List;

import javax.persistence.ManyToOne;

public class Professor extends Funcionario {

	@ManyToOne
	private List<Modalidade> modalidades;

	public List<Modalidade> getModalidades() {
		return modalidades;
	}

	public void setModalidades(Modalidade modalidades) {
		this.modalidades.add(modalidades);
	}
	
	
	
}
