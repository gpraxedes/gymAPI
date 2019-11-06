package com.cotemig.gymAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.gymAPI.model.Ficha;


@Repository("fichaRepository")
public interface FichaRepository extends JpaRepository<Ficha, Integer> {

}
