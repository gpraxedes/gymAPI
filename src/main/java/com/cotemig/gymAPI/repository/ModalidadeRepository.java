package com.cotemig.gymAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.gymAPI.model.Aluno;


@Repository("alunoRepository")
public interface ModalidadeRepository extends JpaRepository<Aluno, Integer> {

}
