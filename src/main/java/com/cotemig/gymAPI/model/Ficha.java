package com.cotemig.gymAPI.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Null;

import org.springframework.lang.Nullable;

@Entity
public class Ficha {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String tipoFicha; //HIPERTROFIA, EMAGRECIMENT0, DEFINIÇÃO;
	
	private String fichaLetra;
	
	private Integer professor_id;
	
	private Integer aluno_id;
	
	private Integer itemFicha_id;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProfessor_id() {
		return professor_id;
	}

	public void setProfessor_id(Integer professor_id) {
		this.professor_id = professor_id;
	}

	public Integer getAluno_id() {
		return aluno_id;
	}

	public void setAluno_id(Integer aluno_id) {
		this.aluno_id = aluno_id;
	}

	public Integer getItemFicha_id() {
		return itemFicha_id;
	}

	public void setItemFicha_id(Integer itemFicha_id) {
		this.itemFicha_id = itemFicha_id;
	}
	
}
