package com.cotemig.gymAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.gymAPI.model.Professor;


@Repository("professorRepository")
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

}
