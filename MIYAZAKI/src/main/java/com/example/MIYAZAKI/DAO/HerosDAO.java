package com.example.MIYAZAKI.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MIYAZAKI.model.Heros;

/**
 
 */
public interface HerosDAO extends JpaRepository<Heros, Integer>{
	static Heros findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
