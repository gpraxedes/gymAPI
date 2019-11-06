package com.cotemig.gymAPI.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.gymAPI.model.Aluno;

public interface IAlunoService {

	Optional<Aluno> getAlunoById(Integer id);

	List<Aluno> getAllAlunos();

	void deleteAllAlunos();

	void deleteAlunoById(Integer id);

	void updateAlunoById(Integer id, Aluno aluno);

	void updateAluno(Aluno aluno);

	void insertAluno(Aluno aluno);

}
