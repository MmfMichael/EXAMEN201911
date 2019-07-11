package com.example.MIYAZAKI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.MIYAZAKI.DAO.FilmsDAO;
import com.example.MIYAZAKI.model.Films;

@RestController
public class FilmsController {
	
	@Autowired
	FilmsDAO filmDAO;
	
	
	
	
	@GetMapping(value = "/getFilmsId/{filmId}")
	public Films getFilmstId(@PathVariable int filmsId) {
		Films filmFound =filmDAO.findById(filmsId);
		return filmFound;
	}
	
	@GetMapping(value = "/getAllFilms/")
	public List<Films> getAllStudent() {
		List<Films> filmsFound = filmDAO.findAll();
		return filmsFound;
	}
		
	@PostMapping(value = "/createFilm")
	public Films addFilm(@RequestBody Films film) {
		Films lefilm = filmDAO.save(film);
		return lefilm;
	}
	
	@DeleteMapping(value = "/deleteByFilmsId/{filmId}")
	public void deleteFilmById(@PathVariable int filmId) {
		filmDAO.deleteById(filmId);
	}
	
	@PutMapping(value = "/updateFilm")
    public Films updateFilm(@RequestBody Films film) {
        
        Films updateFilm = filmDAO.save(film);
        return updateFilm;
    }
	
	
	
	
	
	
	
	
	
	
	
	
}
