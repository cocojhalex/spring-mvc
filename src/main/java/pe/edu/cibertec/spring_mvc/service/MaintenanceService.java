package pe.edu.cibertec.spring_mvc.service;

import pe.edu.cibertec.spring_mvc.dto.FilmDetailDto;
import pe.edu.cibertec.spring_mvc.dto.FilmDto;

import java.util.List;

public interface MaintenanceService {

    List<FilmDto> findAllFilms();

    FilmDetailDto findDetailById(Integer id);

    Boolean updateFilm(FilmDetailDto filmDetailDto);

}
