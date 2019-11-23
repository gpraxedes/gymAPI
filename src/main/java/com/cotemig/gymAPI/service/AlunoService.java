package com.cotemig.gymAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.gymAPI.model.Aluno;
import com.cotemig.gymAPI.repository.AlunoRepository;
import com.cotemig.gymAPI.service.IAlunoService;

@Service("alunoService")
public class AlunoService implements IAlunoService{

	 @Autowired
	AlunoRepository repository;
	
	@Override
	public Optional<Aluno> getAlunoById(Integer id) {
		 return repository.findById(id);

	}

	@Override
	public List<Aluno> getAllAlunos() {
		 return repository.findAll();

	}

	@Override
	public void deleteAllAlunos() {
		repository.deleteAll();
		
	}

	@Override
	public void deleteAlunoById(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public void updateAlunoById(Integer id, Aluno aluno) {
		
		 Optional<Aluno> getAluno = getAlunoById(id);
		 getAluno.get().setNome(aluno.getNome());
		 getAluno.get().setCpf(aluno.getCpf());
		 getAluno.get().setIdade(aluno.getIdade());
		 getAluno.get().setAltura(aluno.getAltura());
		 getAluno.get().setPeso(aluno.getPeso());
		 
		 repository.save(getAluno.get());
	}

	@Override
	public void updateAluno(Aluno aluno) {
		repository.save(aluno);
		
	}

	@Override
	public void insertAluno(Aluno aluno) {
		repository.save(aluno);
		
	}

}
