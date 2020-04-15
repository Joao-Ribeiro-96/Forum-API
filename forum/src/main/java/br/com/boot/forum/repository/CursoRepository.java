package br.com.boot.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.boot.forum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nomeCurso);
	

}
