package com.example.MIYAZAKI.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MIYAZAKI.model.Films;


@Repository
public interface FilmsDAO extends JpaRepository<Films, Integer>{
	Films findById(int id);
}
