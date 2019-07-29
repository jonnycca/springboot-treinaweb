package br.com.empresa.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hellocontroller {

	@GetMapping("/")
	public String hello(Model model) {
		model.addAttribute("mensagem", "spring boot com thymeleaf");
		return "index";
	}
}
