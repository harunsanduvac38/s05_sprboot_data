package es.cursogetafe.springdata.modelo;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="alumnos")
public class Alumno extends Persona {
	
	private String matricula;
	@Column(name="anyo_inscripcion")
	private int anyoInscripcion;
	
	@ManyToMany
	@JoinTable(name = "matriculados", 
	joinColumns = @JoinColumn(name = "fk_alumno"), 
	inverseJoinColumns = @JoinColumn(name = "fk_asignatura"))
	private Set<Asignatura> asignas;



	public Alumno(int id, String dni, String nombre, String matricula, int anyoInscripcion) {
		super(id, dni, nombre);
		this.matricula = matricula;
		this.anyoInscripcion = anyoInscripcion;

	}

	public Alumno() {	
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAnyoInscripcion() {
		return anyoInscripcion;
	}

	public void setAnyoInscripcion(int anyoInscripcion) {
		this.anyoInscripcion = anyoInscripcion;
	}



	@Override
	public String toString() {
		return "Alumno [" + super.getIdPersona() + ", " +  super.getNombre() + ", " + matricula + ", " + anyoInscripcion + "]";
	}


	

	
	
	
	
	

}
