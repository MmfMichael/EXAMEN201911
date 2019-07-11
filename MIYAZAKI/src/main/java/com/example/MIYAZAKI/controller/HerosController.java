package com.example.MIYAZAKI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.MIYAZAKI.DAO.FilmsDAO;
import com.example.MIYAZAKI.DAO.HerosDAO;
import com.example.MIYAZAKI.model.Heros;


@RestController

public class HerosController {
	
	@Autowired
	FilmsDAO filmDAO;

	@Autowired
	HerosDAO herosDAO;
	
	@GetMapping(value = "/getHerosId/{herosId}")
	public Heros getHerostId(@PathVariable int herosId) {
		Heros filmFound =HerosDAO.findById(herosId);
		return filmFound;
	}
	
	@GetMapping(value = "/getAllHeros/")
	public List<Heros> getAllHeroes() {
		List<Heros> herosFound = herosDAO.findAll();
		return herosFound;
	}
	
	/*		
	@PostMapping(value = "/createFilm")
	public Films addStudent(@RequestBody Films film) {
		Films lefilm = filmDAO.save(film);
		return lefilm;
	}*/
	
	@DeleteMapping(value = "/deleteByHerosId/{HerosId}")
	public void deleteHerosById(@PathVariable int herosId) {
		herosDAO.deleteById(herosId);
	}
	/*
	@PutMapping(value = "/updateFilm")
    public Films updateFilm(@RequestBody Films film) {
        
        Films updateFilm = filmDAO.save(film);
        return updateFilm;
    }*/
	
	
	
}
