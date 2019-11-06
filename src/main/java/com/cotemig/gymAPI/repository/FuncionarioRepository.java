package com.cotemig.gymAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.gymAPI.model.Funcionario;


@Repository("funcionarioRepository")
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

}
