package com.cotemig.gymAPI.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Null;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.lang.Nullable;

@Entity
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String nome;

	private Integer idade;

	private Long cpf;

	@Nullable
	@OneToMany(mappedBy = "professor", fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Modalidade> modalidades = new ArrayList<>();

//	@OneToMany(mappedBy = "professores")
//	private List<Ficha> fichas;

	public void setModalidades(List<Modalidade> modalidades) {

		for (Modalidade modalidade : modalidades) {
			setModalidade(modalidade);
		}
	}

//	public void setFicha(Ficha ficha) {
//		this.fichas.add(ficha);
//
//	}
	
	public void setModalidade(Modalidade modalidade) {
		this.modalidades.add(modalidade);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

//	public List<Ficha> getFichas() {
//		return fichas;
//	}
//
//	public void setFichas(List<Ficha> fichas) {
//		this.fichas = fichas;
//	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public List<Modalidade> getModalidades() {
		return modalidades;
	}
	
}
