package br.com.empresa.springboot.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.empresa.springboot.entidades.Instituicao;
import br.com.empresa.springboot.repositorios.RepositorioInstituicao;

@Controller
@RequestMapping("/instituicoes")
public class InstituicoesController {

	private RepositorioInstituicao repositorioInstituicao;
	
	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView resultado = new ModelAndView("instituicao/index");
		List<Instituicao> instituicoes = repositorioInstituicao.findAll();
		resultado.addObject("instituicoes", instituicoes);
		return resultado;		
	}
}
