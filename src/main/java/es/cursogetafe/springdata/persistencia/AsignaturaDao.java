package es.cursogetafe.springdata.persistencia;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.cursogetafe.springdata.modelo.Asignatura;
import es.cursogetafe.springdata.modelo.Profesor;

public interface AsignaturaDao extends JpaRepository<Asignatura, Integer>{

	@Query("select a from Asignatura a where a.profe is null")
	Set<Asignatura> buscarSinProfesor();
	
	
	@Query("select a from Asignatura a where a.asignatura like %?1% or a.facultad like %?1%")
	Set<Asignatura> buscarPorDescripcion(String desc);
	
	
	
	Set<Asignatura> findByProfesor(Profesor profesor);
	
	
}
