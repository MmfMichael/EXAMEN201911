package com.example.MIYAZAKI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "HEROES")
public class Heros {
	@Id
	@GeneratedValue
	int idHeros;
	
	String nom;
	
	String description;

	String role;

	@ManyToOne
	@JoinColumn(name = "film_Id", nullable = false)
	// @NotNull(message = ErrorCodes._USER_CITY)
	private Films films;

	public Heros() {
		super();
	}

	public Heros(String nom, String description, String role, Films films) {
		super();
		this.nom = nom;
		this.description = description;
		this.role = role;
		this.films = films;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Films getFilms() {
		return films;
	}

	public void setFilms(Films films) {
		this.films = films;
	}

	public int getIdHeros() {
		return idHeros;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((films == null) ? 0 : films.hashCode());
		result = prime * result + idHeros;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Heros other = (Heros) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (films == null) {
			if (other.films != null)
				return false;
		} else if (!films.equals(other.films))
			return false;
		if (idHeros != other.idHeros)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Heros [idHeros=" + idHeros + ", nom=" + nom + ", description=" + description + ", role=" + role
				+ ", films=" + films + "]";
	}
	
	
	
	
	
}
