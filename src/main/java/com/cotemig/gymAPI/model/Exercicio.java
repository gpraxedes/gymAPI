package com.cotemig.gymAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.sun.istack.Nullable;

@Entity
public class Exercicio {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nome;
	
	private String descricao;
	
	@Nullable
	@OneToOne(mappedBy = "exercicio")
	private ItemFicha item;
	
	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ItemFicha getItem() {
		return item;
	}

	public void setItem(ItemFicha item) {
		this.item = item;
	}

	
	
}
