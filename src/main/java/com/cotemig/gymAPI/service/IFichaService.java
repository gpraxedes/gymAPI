package com.cotemig.gymAPI.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.gymAPI.model.Ficha;

public interface IFichaService {

	Optional<Ficha> getFichaById(Integer id);

	List<Ficha> getAllFichas();

	void deleteAllFichas();

	void deleteFichaById(Integer id);

	void updateFichaById(Integer id, Ficha ficha);

	void updateFicha(Ficha ficha);

	void insertFicha(Ficha ficha);

}
