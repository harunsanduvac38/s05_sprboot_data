package es.cursogetafe.springdata.modelo;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="asignaturas")
public class Asignatura implements Serializable, Comparable<Asignatura>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_asignatura")
	private int idAsignatura;
	private String asignatura;
	private int creditos;
	private String facultad;
	
	@ManyToOne
	@JoinColumn(name="fk_profesor")
	private Profesor profe;
	
	@ManyToMany(mappedBy = "asignas")
	private Set<Alumno> alums;
	

	public Asignatura(String asignatura, int creditos, String facultad, Profesor profe) {
		super();
		this.asignatura = asignatura;
		this.creditos = creditos;
		this.facultad = facultad;
		this.profe = profe;
	}


	
	public Asignatura() {

	}



	public int getIdAsignatura() {
		return idAsignatura;
	}



	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}



	public String getAsignatura() {
		return asignatura;
	}



	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}



	public int getCreditos() {
		return creditos;
	}



	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}



	public String getFacultad() {
		return facultad;
	}



	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}



	public Profesor getProfe() {
		return profe;
	}



	public void setProfe(Profesor profe) {
		this.profe = profe;
	}


	public Set<Alumno> getAlums() {
		return alums;
	}

	public void setAlums(Set<Alumno> alums) {
		this.alums = alums;
	}


	@Override
	public int hashCode() {
		return Objects.hash(idAsignatura);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asignatura other = (Asignatura) obj;
		return idAsignatura == other.idAsignatura;
	}

	
	


	@Override
	public String toString() {
		return "Asignatura [" + idAsignatura + ", " + asignatura + ", " + creditos + ", " + facultad +  "]";
	}



	@Override
	public int compareTo(Asignatura o) {
		
		return this.idAsignatura - o.idAsignatura;
	}



	

}
