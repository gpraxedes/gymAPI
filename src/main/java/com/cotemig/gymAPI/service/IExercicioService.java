package com.cotemig.gymAPI.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.gymAPI.model.Exercicio;

public interface IExercicioService {

	Optional<Exercicio> getExercicioById(Integer id);

	List<Exercicio> getAllExercicios();

	void deleteAllExercicios();

	void deleteExercicioById(Integer id);

	void updateExercicioById(Integer id, Exercicio exercicio);

	void updateExercicio(Exercicio exercicio);

	void insertExercicio(Exercicio exercicio);

}
