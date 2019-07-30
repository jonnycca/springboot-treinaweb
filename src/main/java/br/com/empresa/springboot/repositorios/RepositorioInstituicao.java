package br.com.empresa.springboot.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.empresa.springboot.entidades.Instituicao;

public interface RepositorioInstituicao extends JpaRepository<Instituicao, Long>{

	
}
