package pe.edu.cibertec.spring_mvc.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.cibertec.spring_mvc.entity.Film;

public interface FilmRepository extends CrudRepository<Film, Integer> {



}
