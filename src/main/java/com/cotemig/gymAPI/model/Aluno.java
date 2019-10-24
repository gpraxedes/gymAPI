package com.cotemig.gymAPI.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nome;

	private Integer idade;

	private Long cpf;
	
	private Double altura;
	
	private Double peso;

	private Boolean ativo;

	
}
