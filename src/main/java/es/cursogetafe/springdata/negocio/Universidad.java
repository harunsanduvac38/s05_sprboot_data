package es.cursogetafe.springdata.negocio;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cursogetafe.springdata.modelo.Alumno;
import es.cursogetafe.springdata.modelo.Asignatura;
import es.cursogetafe.springdata.modelo.Profesor;
import es.cursogetafe.springdata.persistencia.AlumnoDao;
import es.cursogetafe.springdata.persistencia.AsignaturaDao;
import es.cursogetafe.springdata.persistencia.ProfesorDao;
import jakarta.annotation.PostConstruct;

@Service
public class Universidad {

	
	private AsignaturaDao asigDao;
	private AlumnoDao alumDao;
	private ProfesorDao profeDao;
	
	public Universidad() {
		
	}


	
	@Autowired
	public Universidad(AsignaturaDao asigDao, AlumnoDao alumDao, ProfesorDao profeDao) {
		super();
		this.asigDao = asigDao;
		this.alumDao = alumDao;
		this.profeDao = profeDao;
	}
	
	
	public Set<Alumno> getAlumnos() {
		return new HashSet<Alumno>(alumDao.findAll());
	}




//	@PostConstruct
	public void init() {
		
//		asigDao.findAll().forEach(System.out::println);
//		System.out.println("---------------------");
//		System.out.println("---------------------");
//		alumDao.findAll().forEach(System.out::println);
//		System.out.println("---------------------");
//		System.out.println("---------------------");
//		profeDao.findAll().forEach(System.out::println);
//		System.out.println("---------------------");
//		System.out.println("---------------------");

//		Optional<Asignatura> buscadaOpt = asigDao.findById(2);
//		
//		if(buscadaOpt.isPresent()) {
//			Asignatura buscada = buscadaOpt.get();
//			System.out.println(buscada);
//			System.out.println(buscada.getAlums());
//		}else {
//			System.out.println("No Existe");
//		}
		
		
//		asigDao.buscarTodas().forEach((id, asig) -> System.out.println(id + " -* " + asig));
		
		
//		Asignatura buscadaEager = asigDao.findByIdEager(2);
//		System.out.println(buscadaEager);
//		System.out.println(buscadaEager.getAlums());
		
		
//		asigDao.buscarSinProfesor().forEach(System.out::println);
		
//		asigDao.buscarPorDescripcion("info").forEach(System.out::println);
		
//		Profesor profe = profeDao.findById(10).get();
//		asigDao.findByProfe(profe).forEach(System.out::println);
		
		
//		asigDao.findByFacultadContaining("Mate").forEach(System.out::println);
		
		
//		profeDao.findByApellidos("alvar").forEach(System.out::println);
		
//		asigDao.findByProfesor("va").forEach(System.out::println);
		
	}
	
	
	
	
}
