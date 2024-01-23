package br.com.projescolaweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
}
