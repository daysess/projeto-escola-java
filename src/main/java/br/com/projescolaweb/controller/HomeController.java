package br.com.projescolaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		
		//logica de negocio
		
		return "home";
	}
	
}
