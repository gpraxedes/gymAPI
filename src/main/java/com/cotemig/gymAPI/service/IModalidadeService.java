package com.cotemig.gymAPI.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.gymAPI.model.Modalidade;

public interface IModalidadeService {

	Optional<Modalidade> getModalidadeById(Integer id);

	List<Modalidade> getAllModalidades();

	void deleteAllModalidades();

	void deleteModalidadeById(Integer id);

	void updateModalidadeById(Integer id, Modalidade modalidade);

	void updateModalidade(Modalidade modalidade);

	void insertModalidade(Modalidade modalidade);

}
