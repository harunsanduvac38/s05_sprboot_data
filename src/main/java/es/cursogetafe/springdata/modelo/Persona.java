package es.cursogetafe.springdata.modelo;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;


@Entity
@Table(name="personas")
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona implements Serializable, Comparable<Persona>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_persona")
	private int idPersona;
	private String dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String telefono;
	private String direccion;
	private String ciudad;
	
	
	public Persona(int id, String dni, String nombre) {
		super();
		this.idPersona = id;
		this.dni = dni;
		this.nombre = nombre;
	}


	public Persona() {
	}

	
	public int getIdPersona() {
		return idPersona;
	}


	public void setIdPersona(int id) {
		this.idPersona = id;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido1() {
		return apellido1;
	}


	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	public String getApellido2() {
		return apellido2;
	}


	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(idPersona);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return idPersona == other.idPersona;
	}
	
	
	


	@Override
	public String toString() {
		return "Persona [" + idPersona + ", " + dni + ", " + nombre + ", " + apellido1 + ", " + apellido2 + ", "
				+ telefono + ", " + direccion + ", " + ciudad + "]";
	}


	@Override
	public int compareTo(Persona o) {
		
		return this.idPersona - o.idPersona;
	}
	
	

}
