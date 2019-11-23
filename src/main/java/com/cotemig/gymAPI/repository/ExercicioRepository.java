package com.cotemig.gymAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.gymAPI.model.Exercicio;;

@Repository("exercicioRepository")
public interface ExercicioRepository extends JpaRepository<Exercicio, Integer> {

}
