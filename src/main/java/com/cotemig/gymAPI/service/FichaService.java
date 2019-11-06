package com.cotemig.gymAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.gymAPI.model.Ficha;
import com.cotemig.gymAPI.repository.FichaRepository;

@Service("FichaService")
public class FichaService implements IFichaService{

	@Autowired
	FichaRepository repository;
	
	@Override
	public Optional<Ficha> getFichaById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public List<Ficha> getAllFichas() {
		return repository.findAll();
	}

	@Override
	public void deleteAllFichas() {
		repository.deleteAll();
	}

	@Override
	public void deleteFichaById(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public void updateFichaById(Integer id, Ficha ficha) {

		 Optional<Ficha> getFicha = getFichaById(id);
		 getFicha.get().setTipoFicha(ficha.getTipoFicha());
		 getFicha.get().setAluno(ficha.getAluno());
		 getFicha.get().setAtivo(ficha.getAtivo());
		 getFicha.get().setFichaLetra(ficha.getFichaLetra());
		 getFicha.get().setItens(ficha.getItens());
		 getFicha.get().setProfessor(ficha.getProfessor());
		 getFicha.get().setTipoFicha(ficha.getTipoFicha());
		 
		 repository.save(getFicha.get());
		
	}

	@Override
	public void updateFicha(Ficha ficha) {
		repository.save(ficha);
	}

	@Override
	public void insertFicha(Ficha ficha) {
		repository.save(ficha);
	}
	
}
