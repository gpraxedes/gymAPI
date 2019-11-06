package com.cotemig.gymAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.gymAPI.model.ItemFicha;


@Repository("itemFichaRepository")
public interface ItemFichaRepository extends JpaRepository<ItemFicha, Integer> {

}
