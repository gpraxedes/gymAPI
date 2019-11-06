package com.cotemig.gymAPI.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.gymAPI.model.Professor;

public interface IProfessorService {

	Optional<Professor> getProfessorById(Integer id);

	List<Professor> getAllProfessores();

	void deleteAllProfessores();

	void deleteProfessorById(Integer id);

	void updateProfessorById(Integer id, Professor professor);

	void updateProfessor(Professor professor);

	void insertProfessor(Professor professor);

}
