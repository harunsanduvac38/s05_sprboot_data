package es.cursogetafe.springdata.modelo;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="profesores")
public class Profesor extends Persona{
	
	@Column(name="nro_seg_social")
	private String nroSegSocial;
	
	@OneToMany(mappedBy = "profe")
	private Set<Asignatura> asignaturas;



	public Set<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Set<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	public Profesor(int id, String dni, String nombre, String nroSegSocial) {
		super(id, dni, nombre);
		this.nroSegSocial = nroSegSocial;
	}

	public Profesor() {
	}

	public String getNroSegSocial() {
		return nroSegSocial;
	}

	public void setNroSegSocial(String nroSegSocial) {
		this.nroSegSocial = nroSegSocial;
	}

	@Override
	public String toString() {
		return "Profesor [" + super.getIdPersona() + ", " + super.getNombre() + ", " + super.getApellido1() + ", " + super.getApellido2() + ", " + nroSegSocial +  "]";
	}
	
	
	
	
}
