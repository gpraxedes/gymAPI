package com.cotemig.gymAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cotemig.gymAPI.service.*;
import com.cotemig.gymAPI.model.*;

@RestController
public class SpringBdRestController {

	@Autowired
	private IAlunoService alunoService;

	@Autowired
	private IExercicioService exercicioService;

	@Autowired
	private IFichaService fichaService;

	@Autowired
	private IFuncionarioService funcionarioService;

	@Autowired
	private IItemFichaService itemFichaService;

	@Autowired
	private IModalidadeService modalidadeService;

	@Autowired
	private IProfessorService professorService;

	// Aluno

	@RequestMapping(value = "/rest/getAllAlunos", method = RequestMethod.GET)
	public List<Aluno> getAlunos() {
		return alunoService.getAllAlunos();
	}

	@RequestMapping(value = "/rest/getAluno/{id}", method = RequestMethod.GET)
	public Optional<Aluno> getAluno(@PathVariable("id") Integer id) {
		return alunoService.getAlunoById(id);
	}

	@RequestMapping(value = "/rest/deleteAllAlunos", method = RequestMethod.DELETE)
	public void deleteAlunos() {
		alunoService.deleteAllAlunos();
	}

	@RequestMapping(value = "/rest/deleteAluno/{id}", method = RequestMethod.DELETE)
	public void deleteAluno(@PathVariable("id") Integer id) {
		alunoService.deleteAlunoById(id);
	}

	@RequestMapping(value = "/rest/updateAluno/{id}", method = RequestMethod.POST)
	public void updateAluno(@RequestBody Aluno aluno, @PathVariable("id") Integer id) {
		alunoService.updateAlunoById(id, aluno);
	}

	@RequestMapping(value = "/rest/insertAluno", method = RequestMethod.POST)
	public void updateAluno(@RequestBody Aluno aluno) {
		alunoService.insertAluno(aluno);
	}

	@RequestMapping(value = "/rest/getAllExercicios", method = RequestMethod.GET)
	public List<Exercicio> getExercicios() {
		return exercicioService.getAllExercicios();
	}

	// Exercicio

	@RequestMapping(value = "/rest/getExercicio/{id}", method = RequestMethod.GET)
	public Optional<Exercicio> getExercicio(@PathVariable("id") Integer id) {
		return exercicioService.getExercicioById(id);
	}

	@RequestMapping(value = "/rest/deleteAllExercicios", method = RequestMethod.DELETE)
	public void deleteExercicios() {
		exercicioService.deleteAllExercicios();
	}

	@RequestMapping(value = "/rest/deleteExercicio/{id}", method = RequestMethod.DELETE)
	public void deleteExercicio(@PathVariable("id") Integer id) {
		exercicioService.deleteExercicioById(id);
	}

	@RequestMapping(value = "/rest/updateExercicio/{id}", method = RequestMethod.POST)
	public void updateExercicio(@RequestBody Exercicio exercicio, @PathVariable("id") Integer id, Time time) {
		exercicioService.updateExercicioById(id, exercicio);
	}

	@RequestMapping(value = "/rest/insertExercicio", method = RequestMethod.POST)
	public void updateExercicio(@RequestBody Exercicio exercicio) {
		exercicioService.insertExercicio(exercicio);
	}

	// Ficha

	@RequestMapping(value = "/rest/getAllFichas", method = RequestMethod.GET)
	public List<Ficha> getFichas() {
		return fichaService.getAllFichas();
	}

	@RequestMapping(value = "/rest/getFicha/{id}", method = RequestMethod.GET)
	public Optional<Ficha> getFicha(@PathVariable("id") Integer id) {
		return fichaService.getFichaById(id);
	}

	@RequestMapping(value = "/rest/deleteAllFichas", method = RequestMethod.DELETE)
	public void deleteFichas() {
		fichaService.deleteAllFichas();
	}

	@RequestMapping(value = "/rest/deleteFicha/{id}", method = RequestMethod.DELETE)
	public void deleteFicha(@PathVariable("id") Integer id) {
		fichaService.deleteFichaById(id);
	}

	@RequestMapping(value = "/rest/updateFicha/{id}", method = RequestMethod.POST)
	public void updateFicha(@RequestBody Ficha ficha, @PathVariable("id") Integer id) {
		fichaService.updateFichaById(id, ficha);
	}

	@RequestMapping(value = "/rest/insertFicha", method = RequestMethod.POST)
	public void updateFicha(@RequestBody Ficha ficha) {
		fichaService.insertFicha(ficha);
	}

	// Funcionario

	@RequestMapping(value = "/rest/getAllFuncionarios", method = RequestMethod.GET)
	public List<Funcionario> getFuncionarios() {
		return funcionarioService.getAllFuncionarios();
	}

	@RequestMapping(value = "/rest/getFuncionario/{id}", method = RequestMethod.GET)
	public Optional<Funcionario> getFuncionario(@PathVariable("id") Integer id) {
		return funcionarioService.getFuncionarioById(id);
	}

	@RequestMapping(value = "/rest/deleteAllFuncionarios", method = RequestMethod.DELETE)
	public void deleteFuncionarios() {
		funcionarioService.deleteAllFuncionarios();
	}

	@RequestMapping(value = "/rest/deleteFuncionario/{id}", method = RequestMethod.DELETE)
	public void deleteFuncionario(@PathVariable("id") Integer id) {
		funcionarioService.deleteFuncionarioById(id);
	}

	@RequestMapping(value = "/rest/updateFuncionario/{id}", method = RequestMethod.POST)
	public void updateFuncionario(@RequestBody Funcionario funcionario, @PathVariable("id") Integer id) {
		funcionarioService.updateFuncionarioById(id, funcionario);
	}

	@RequestMapping(value = "/rest/insertFuncionario", method = RequestMethod.POST)
	public void updateFuncionario(@RequestBody Funcionario funcionario) {
		funcionarioService.insertFuncionario(funcionario);
	}

	// ItemFicha

	@RequestMapping(value = "/rest/getAllItensFicha", method = RequestMethod.GET)
	public List<ItemFicha> getItemFichas() {
		return itemFichaService.getAllItensFicha();
	}

	@RequestMapping(value = "/rest/getItemFicha/{id}", method = RequestMethod.GET)
	public Optional<ItemFicha> getItemFicha(@PathVariable("id") Integer id) {
		return itemFichaService.getItemFichaById(id);
	}

	@RequestMapping(value = "/rest/deleteAllItensFicha", method = RequestMethod.DELETE)
	public void deleteItemFichas() {
		itemFichaService.deleteAllItensFicha();
		// id ficha
	}

	@RequestMapping(value = "/rest/deleteItemFicha/{id}", method = RequestMethod.DELETE)
	public void deleteItemFicha(@PathVariable("id") Integer id) {
		itemFichaService.deleteItemFichaById(id);
	}

	@RequestMapping(value = "/rest/updateItemFicha/{id}", method = RequestMethod.POST)
	public void updateItemFicha(@RequestBody ItemFicha itemFicha, @PathVariable("id") Integer id) {
		itemFichaService.updateItemFichaById(id, itemFicha);
	}

	@RequestMapping(value = "/rest/insertItemFicha", method = RequestMethod.POST)
	public void updateItemFicha(@RequestBody ItemFicha itemFicha) {
		itemFichaService.insertItemFicha(itemFicha);
	}

	// Modalidade

	@RequestMapping(value = "/rest/getAllModalidades", method = RequestMethod.GET)
	public List<Modalidade> getModalidades() {
		return modalidadeService.getAllModalidades();
	}

	@RequestMapping(value = "/rest/getModalidade/{id}", method = RequestMethod.GET)
	public Optional<Modalidade> getModalidade(@PathVariable("id") Integer id) {
		return modalidadeService.getModalidadeById(id);
	}

	@RequestMapping(value = "/rest/deleteAllModalidades", method = RequestMethod.DELETE)
	public void deleteModalidades() {
		modalidadeService.deleteAllModalidades();
	}

	@RequestMapping(value = "/rest/deleteModalidade/{id}", method = RequestMethod.DELETE)
	public void deleteModalidade(@PathVariable("id") Integer id) {
		modalidadeService.deleteModalidadeById(id);
	}

	@RequestMapping(value = "/rest/updateModalidade/{id}", method = RequestMethod.POST)
	public void updateModalidade(@RequestBody Modalidade modalidade, @PathVariable("id") Integer id) {
		modalidadeService.updateModalidadeById(id, modalidade);
	}

	@RequestMapping(value = "/rest/insertModalidade", method = RequestMethod.POST)
	public void updateModalidade(@RequestBody Modalidade modalidade) {
		modalidadeService.insertModalidade(modalidade);
	}

	// Professor

	@RequestMapping(value = "/rest/getAllProfessores", method = RequestMethod.GET)
	public List<Professor> getProfessores() {
		return professorService.getAllProfessores();
	}

	@RequestMapping(value = "/rest/getProfessor/{id}", method = RequestMethod.GET)
	public Optional<Professor> getProfessor(@PathVariable("id") Integer id) {
		return professorService.getProfessorById(id);
	}

	@RequestMapping(value = "/rest/deleteAllProfessores", method = RequestMethod.DELETE)
	public void deleteProfessores() {
		professorService.deleteAllProfessores();
	}

	@RequestMapping(value = "/rest/deleteProfessor/{id}", method = RequestMethod.DELETE)
	public void deleteProfessor(@PathVariable("id") Integer id) {
		professorService.deleteProfessorById(id);
	}

	@RequestMapping(value = "/rest/updateProfessor/{id}", method = RequestMethod.POST)
	public void updateProfessor(@RequestBody Professor professor, @PathVariable("id") Integer id) {
		professorService.updateProfessorById(id, professor);
	}

	@RequestMapping(value = "/rest/insertProfessor", method = RequestMethod.POST)
	public void updateProfessor(@RequestBody Professor professor) {
		professorService.insertProfessor(professor);
	}
}
