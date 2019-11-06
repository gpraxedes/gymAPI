package com.cotemig.gymAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.gymAPI.model.Modalidade;
import com.cotemig.gymAPI.repository.ModalidadeRepository;

@Service("ModalidadeService")
public class ModalidadeService implements IModalidadeService{

	@Autowired
	ModalidadeRepository repository;
	
	@Override
	public Optional<Modalidade> getModalidadeById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public List<Modalidade> getAllModalidades() {
		return repository.findAll();
	}

	@Override
	public void deleteAllModalidades() {
		repository.deleteAll();
	}

	@Override
	public void deleteModalidadeById(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public void updateModalidadeById(Integer id, Modalidade modalidade) {

		 Optional<Modalidade> getModalidade = getModalidadeById(id);
		 getModalidade.get().setAerobico(modalidade.getAerobico());
		 getModalidade.get().setNome(modalidade.getNome());
		 
		 repository.save(getModalidade.get());
		
	}

	@Override
	public void updateModalidade(Modalidade modalidade) {
		repository.save(modalidade);
	}

	@Override
	public void insertModalidade(Modalidade modalidade) {
		repository.save(modalidade);
	}
}
