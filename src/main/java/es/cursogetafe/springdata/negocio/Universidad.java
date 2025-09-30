package es.cursogetafe.springdata.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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




	@PostConstruct
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

//		Asignatura buscada = asigDao.findById(9).get();
//		System.out.println(buscada);
//		System.out.println(buscada.getAlums());
		
//		asigDao.buscarSinProfesor().forEach(System.out::println);
		
//		asigDao.buscarPorDescripcion("info").forEach(System.out::println);
		
		Profesor profe = profeDao.findById(10).get();
		
		
		
	}
	
	
	
	
}
