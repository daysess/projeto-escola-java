package br.com.projescolaweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.projescolaweb.domain.Classe;
import br.com.projescolaweb.model.service.ClasseService;

@Controller
@RequestMapping("/classes")
public class ClasseController {
	
	@Autowired
	private ClasseService classeService;

	
	@GetMapping("/listar")
	public String listAll(ModelMap model) {
		
		List<Classe> list = this.classeService.listAll();
		model.addAttribute("classes", list);
		return "classe";
	}
	
	@GetMapping("/cadastrar")
	public String cadastrar(Classe obj) {
		return "cadastro-classe";
	}
	
	@PostMapping("/salvar")
	public String salvar(Classe classe, RedirectAttributes attr) {
		this.classeService.salvar(classe);
		attr.addFlashAttribute("success", "Classe cadastrada com sucesso");
		return "redirect:/classes/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String cadastrar(@PathVariable("id") Integer id, ModelMap model) {
		Classe classe = this.classeService.pesquisarPorId(id);
		model.addAttribute("classe", classe);
		return "cadastro-classe";
	}	
	
	
	@PostMapping("/editar")
	public String editar(Classe classe, RedirectAttributes attr) {
		
		boolean resultado = this.classeService.editar(classe);
		if (resultado) {
			attr.addFlashAttribute("success", "Classe editada com sucesso");
		} else {
			attr.addFlashAttribute("fail", "Erro ao editar dados da classe");
		}
		
		return "redirect:/classes/listar";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Integer id, RedirectAttributes attr) {
		Classe classe = this.classeService.pesquisarPorId(id);
		if (classe.getProfessores().size() > 0) {
			attr.addFlashAttribute("fail", "Existem professores cadastrados nessa classe e por essa razão não é possível excluir a mesma.");
			return "redirect:/classes/listar";
		}
		if (classe.getAlunos().size() > 0) {
			attr.addFlashAttribute("fail", "Existem alunos cadastrados nessa classe e por essa razão não é possível excluir a mesma.");
			return "redirect:/classes/listar";
		}
		if (classe.getMaterias().size() > 0) {
			attr.addFlashAttribute("fail", "Existem matérias cadastradas nessa classe e por essa razão não é possível excluir a mesma.");
			return "redirect:/classes/listar";
		}
		this.classeService.excluir(classe.getId());
		return "redirect:/classes/listar";
	}
	
}
