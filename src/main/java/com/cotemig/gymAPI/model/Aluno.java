package com.cotemig.gymAPI.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Null;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;

@Entity
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String nome;

	private Integer idade;

	private Long cpf;

	private Double altura;

	private Double peso;
	
	@Null
	@OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
	private List<Ficha> fichas;

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

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Integer getId() {
		return id;
	}

	public List<Ficha> getFichas() {
		return this.fichas;
	}

	public void setFicha(Ficha ficha) {
		this.fichas.add(ficha);
	}
	

}
