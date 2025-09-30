package es.cursogetafe.springdata.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import es.cursogetafe.springdata.modelo.Profesor;

public interface ProfesorDao extends JpaRepository<Profesor, Integer>{

}
