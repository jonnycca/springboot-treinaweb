package br.com.empresa.springboot.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.empresa.springboot.entidades.Aluno;

public interface RepositorioAluno extends JpaRepository<Aluno, Long> {

}
