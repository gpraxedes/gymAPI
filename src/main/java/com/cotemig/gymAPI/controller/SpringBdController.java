package com.cotemig.gymAPI.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cotemig.gymAPI.model.Aluno;
import com.cotemig.gymAPI.model.Exercicio;
import com.cotemig.gymAPI.model.Ficha;
import com.cotemig.gymAPI.model.Funcionario;
import com.cotemig.gymAPI.model.ItemFicha;
import com.cotemig.gymAPI.model.Modalidade;
import com.cotemig.gymAPI.model.Professor;
import com.cotemig.gymAPI.service.IAlunoService;
import com.cotemig.gymAPI.service.IExercicioService;
import com.cotemig.gymAPI.service.IFichaService;
import com.cotemig.gymAPI.service.IFuncionarioService;
import com.cotemig.gymAPI.service.IItemFichaService;
import com.cotemig.gymAPI.service.IModalidadeService;
import com.cotemig.gymAPI.service.IProfessorService;

@Controller
public class SpringBdController {

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
	@RequestMapping(value = "/insertAluno", method = RequestMethod.GET)
	public ModelAndView insertAluno() {

		return new ModelAndView("insertAluno", "aluno", new Aluno());

	}

	@RequestMapping(value = "/insertAluno", method = RequestMethod.POST)
	public String submitInsertAluno(@Valid @ModelAttribute("aluno") Aluno aluno, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		alunoService.insertAluno(aluno);

		return "redirect:";
	}

	@RequestMapping(value = "/deleteAluno", method = RequestMethod.GET)
	public ModelAndView deleteAluno(Integer id) {

		return new ModelAndView("deleteAluno", "aluno", alunoService.getAlunoById(id).get());
	}

	@RequestMapping(value = "/deleteAluno", method = RequestMethod.POST)
	public String submitDeleteAluno(@Valid @ModelAttribute("aluno") Aluno aluno, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		Optional<Aluno> alunoOptional = alunoService.getAlunoById(aluno.getId());

		String mensagem = "Aluno id: " + alunoOptional.get().getId();

		if (alunoOptional.isPresent()) {
			
			alunoService.deleteAlunoById(aluno.getId());
			
			return mensagem + " deletado com sucesso";
			
		} else {
			
			return mensagem + " não encontrado";
			
		}
		
		
	}

	@RequestMapping(value = "/updateAluno", method = RequestMethod.GET)
	public ModelAndView updateAluno(Integer id) {

		return new ModelAndView("updateAluno", "aluno", alunoService.getAlunoById(id).get());

	}

	@RequestMapping(value = "/updateAluno", method = RequestMethod.POST)
	public String submitUpdateAluno(@Valid @ModelAttribute("aluno") Aluno aluno, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		alunoService.updateAluno(aluno);

		return "redirect:";
	}

	@RequestMapping(value = "/readAlunos", method = RequestMethod.GET)
	public ModelAndView readAlunos() {

		ModelAndView mav = new ModelAndView("readAlunos");
		mav.addObject("alunos", alunoService.getAllAlunos());
		return mav;
	}

	@RequestMapping(value = "/readAluno", method = RequestMethod.GET)
	public ModelAndView readAluno(Integer id) {

		ModelAndView mav = new ModelAndView("readAluno");
		mav.addObject("alunos", alunoService.getAlunoById(id));
		return mav;
	}
	
	// Exercicio

	@RequestMapping(value = "/insertExercicio", method = RequestMethod.GET)
	public ModelAndView insertExercicio() {

		return new ModelAndView("insertExercicio", "exercicio", new Exercicio());

	}

	@RequestMapping(value = "/insertExercicio", method = RequestMethod.POST)
	public String submitInsertExercicio(@Valid @ModelAttribute("exercicio") Exercicio exercicio, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		exercicioService.insertExercicio(exercicio);

		return "redirect:";
	}

	@RequestMapping(value = "/deleteExercicio", method = RequestMethod.GET)
	public ModelAndView deleteExercicio(Integer id) {

		return new ModelAndView("deleteExercicio", "exercicio", exercicioService.getExercicioById(id).get());
	}

	@RequestMapping(value = "/deleteExercicio", method = RequestMethod.POST)
	public String submitDeleteExercicio(@Valid @ModelAttribute("exercicio") Exercicio exercicio, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		exercicioService.deleteExercicioById(exercicio.getId());

		return "redirect:";
	}

	@RequestMapping(value = "/updateExercicio", method = RequestMethod.GET)
	public ModelAndView updateExercicio(Integer id) {

		return new ModelAndView("updateExercicio", "exercicio", exercicioService.getExercicioById(id).get());

	}

	@RequestMapping(value = "/updateExercicio", method = RequestMethod.POST)
	public String submitUpdateExercicio(@Valid @ModelAttribute("exercicio") Exercicio exercicio, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		exercicioService.updateExercicio(exercicio);

		return "redirect:";
	}

	@RequestMapping(value = "/readExercicios", method = RequestMethod.GET)
	public ModelAndView readExercicios() {

		ModelAndView mav = new ModelAndView("readExercicios");
		mav.addObject("exercicios", exercicioService.getAllExercicios());
		return mav;
	}

	// Ficha

	@RequestMapping(value = "/insertFicha", method = RequestMethod.GET)
	public ModelAndView insertFicha() {

		return new ModelAndView("insertFicha", "ficha", new Ficha());

	}

	@RequestMapping(value = "/insertFicha", method = RequestMethod.POST)
	public String submitInsertFicha(@Valid @ModelAttribute("ficha") Ficha ficha, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		fichaService.insertFicha(ficha);

		return "redirect:";
	}

	@RequestMapping(value = "/deleteFicha", method = RequestMethod.GET)
	public ModelAndView deleteFicha(Integer id) {

		return new ModelAndView("deleteFicha", "ficha", fichaService.getFichaById(id).get());
	}

	@RequestMapping(value = "/deleteFicha", method = RequestMethod.POST)
	public String submitDeleteFicha(@Valid @ModelAttribute("ficha") Ficha ficha, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		fichaService.deleteFichaById(ficha.getId());

		return "redirect:";
	}

	@RequestMapping(value = "/updateFicha", method = RequestMethod.GET)
	public ModelAndView updateFicha(Integer id) {

		return new ModelAndView("updateFicha", "ficha", fichaService.getFichaById(id).get());

	}

	@RequestMapping(value = "/updateFicha", method = RequestMethod.POST)
	public String submitUpdateFicha(@Valid @ModelAttribute("ficha") Ficha ficha, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		fichaService.updateFicha(ficha);

		return "redirect:";
	}

	@RequestMapping(value = "/readFichas", method = RequestMethod.GET)
	public ModelAndView readFichas() {

		ModelAndView mav = new ModelAndView("readFichas");
		mav.addObject("fichas", fichaService.getAllFichas());
		return mav;
	}

	// Funcionario

	@RequestMapping(value = "/insertFuncionario", method = RequestMethod.GET)
	public ModelAndView insertFuncionario() {

		return new ModelAndView("insertFuncionario", "funcionario", new Funcionario());

	}

	@RequestMapping(value = "/insertFuncionario", method = RequestMethod.POST)
	public String submitInsertFuncionario(@Valid @ModelAttribute("funcionario") Funcionario funcionario,
			BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		funcionarioService.insertFuncionario(funcionario);

		return "redirect:";
	}

	@RequestMapping(value = "/deleteFuncionario", method = RequestMethod.GET)
	public ModelAndView deleteFuncionario(Integer id) {

		return new ModelAndView("deleteFuncionario", "funcionario", funcionarioService.getFuncionarioById(id).get());
	}

	@RequestMapping(value = "/deleteFuncionario", method = RequestMethod.POST)
	public String submitDeleteFuncionario(@Valid @ModelAttribute("funcionario") Funcionario funcionario,
			BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		funcionarioService.deleteFuncionarioById(funcionario.getId());

		return "redirect:";
	}

	@RequestMapping(value = "/updateFuncionario", method = RequestMethod.GET)
	public ModelAndView updateFuncionario(Integer id) {

		return new ModelAndView("updateFuncionario", "funcionario", funcionarioService.getFuncionarioById(id).get());

	}

	@RequestMapping(value = "/updateFuncionario", method = RequestMethod.POST)
	public String submitUpdateFuncionario(@Valid @ModelAttribute("funcionario") Funcionario funcionario,
			BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		funcionarioService.updateFuncionario(funcionario);

		return "redirect:";
	}

	@RequestMapping(value = "/readFuncionarios", method = RequestMethod.GET)
	public ModelAndView readFuncionarios() {

		ModelAndView mav = new ModelAndView("readFuncionarios");
		mav.addObject("funcionarios", funcionarioService.getAllFuncionarios());
		return mav;
	}

	// ItemFicha

	@RequestMapping(value = "/insertItemFicha", method = RequestMethod.GET)
	public ModelAndView insertItemFicha() {

		return new ModelAndView("insertItemFicha", "itemFicha", new ItemFicha());

	}

	@RequestMapping(value = "/insertItemFicha", method = RequestMethod.POST)
	public String submitInsertItemFicha(@Valid @ModelAttribute("itemFicha") ItemFicha itemFicha, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		itemFichaService.insertItemFicha(itemFicha);

		return "redirect:";
	}

	@RequestMapping(value = "/deleteItemFicha", method = RequestMethod.GET)
	public ModelAndView deleteItemFicha(Integer id) {

		return new ModelAndView("deleteItemFicha", "itemFicha", itemFichaService.getItemFichaById(id).get());
	}

	@RequestMapping(value = "/deleteItemFicha", method = RequestMethod.POST)
	public String submitDeleteItemFicha(@Valid @ModelAttribute("itemFicha") ItemFicha itemFicha, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		itemFichaService.deleteItemFichaById(itemFicha.getId());

		return "redirect:";
	}

	@RequestMapping(value = "/updateItemFicha", method = RequestMethod.GET)
	public ModelAndView updateItemFicha(Integer id) {

		return new ModelAndView("updateItemFicha", "itemFicha", itemFichaService.getItemFichaById(id).get());

	}

	@RequestMapping(value = "/updateItemFicha", method = RequestMethod.POST)
	public String submitUpdateItemFicha(@Valid @ModelAttribute("itemFicha") ItemFicha itemFicha, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		itemFichaService.updateItemFicha(itemFicha);

		return "redirect:";
	}

	// por id
	@RequestMapping(value = "/readItensFicha", method = RequestMethod.GET)
	public ModelAndView readItemFichas() {

		ModelAndView mav = new ModelAndView("readItemFichas");
		mav.addObject("itensFicha", itemFichaService.getAllItensFicha());
		return mav;
	}

	// Modalidade

	@RequestMapping(value = "/insertModalidade", method = RequestMethod.GET)
	public ModelAndView insertModalidade() {

		return new ModelAndView("insertModalidade", "modalidade", new Modalidade());

	}

	@RequestMapping(value = "/insertModalidade", method = RequestMethod.POST)
	public String submitInsertModalidade(@Valid @ModelAttribute("modalidade") Modalidade modalidade,
			BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		modalidadeService.insertModalidade(modalidade);

		return "redirect:";
	}

	@RequestMapping(value = "/deleteModalidade", method = RequestMethod.GET)
	public ModelAndView deleteModalidade(Integer id) {

		return new ModelAndView("deleteModalidade", "modalidade", modalidadeService.getModalidadeById(id).get());
	}

	@RequestMapping(value = "/deleteModalidade", method = RequestMethod.POST)
	public String submitDeleteModalidade(@Valid @ModelAttribute("modalidade") Modalidade modalidade,
			BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		modalidadeService.deleteModalidadeById(modalidade.getId());

		return "redirect:";
	}

	@RequestMapping(value = "/updateModalidade", method = RequestMethod.GET)
	public ModelAndView updateModalidade(Integer id) {

		return new ModelAndView("updateModalidade", "modalidade", modalidadeService.getModalidadeById(id).get());

	}

	@RequestMapping(value = "/updateModalidade", method = RequestMethod.POST)
	public String submitUpdateModalidade(@Valid @ModelAttribute("modalidade") Modalidade modalidade,
			BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		modalidadeService.updateModalidade(modalidade);

		return "redirect:";
	}

	@RequestMapping(value = "/readModalidades", method = RequestMethod.GET)
	public ModelAndView readModalidades() {

		ModelAndView mav = new ModelAndView("readModalidades");
		mav.addObject("modalidades", modalidadeService.getAllModalidades());
		return mav;
	}

	// Professor

	@RequestMapping(value = "/insertProfessor", method = RequestMethod.GET)
	public ModelAndView insertProfessor() {

		return new ModelAndView("insertProfessor", "professor", new Professor());

	}

	@RequestMapping(value = "/insertProfessor", method = RequestMethod.POST)
	public String submitInsertProfessor(@Valid @ModelAttribute("professor") Professor professor, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		professorService.insertProfessor(professor);

		return "redirect:";
	}

	@RequestMapping(value = "/deleteProfessor", method = RequestMethod.GET)
	public ModelAndView deleteProfessor(Integer id) {

		return new ModelAndView("deleteProfessor", "professor", professorService.getProfessorById(id).get());
	}

	@RequestMapping(value = "/deleteProfessor", method = RequestMethod.POST)
	public String submitDeleteProfessor(@Valid @ModelAttribute("professor") Professor professor, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		professorService.deleteProfessorById(professor.getId());

		return "redirect:";
	}

	@RequestMapping(value = "/updateProfessor", method = RequestMethod.GET)
	public ModelAndView updateProfessor(Integer id) {

		return new ModelAndView("updateProfessor", "professor", professorService.getProfessorById(id).get());

	}

	@RequestMapping(value = "/updateProfessor", method = RequestMethod.POST)
	public String submitUpdateProfessor(@Valid @ModelAttribute("professor") Professor professor, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		professorService.updateProfessor(professor);

		return "redirect:";
	}

	@RequestMapping(value = "/readProfessores", method = RequestMethod.GET)
	public ModelAndView readProfessores() {

		ModelAndView mav = new ModelAndView("readProfessores");
		mav.addObject("professores", professorService.getAllProfessores());
		return mav;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {

		ModelAndView mav = new ModelAndView("index");
		mav.addObject("alunos", alunoService.getAllAlunos());
		return mav;
	}

}
