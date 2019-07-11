package com.example.MIYAZAKI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// Remarque : ayant travaillé toute l'année avec des bases en SQL la désignation du nopm pour les tables est automatique. Je n'ai pa pensé à adapter le nom
@Entity
@Table(name="ListeFilms")
public class Films {
	@Id
	@GeneratedValue
	
	private int idFilm;
	
	private String nomFilm;
	
	private int anneeFilm;
	
	private String imageFilm;
	
	private String descriptionFilm;

	public Films() {
		super();
	}

	public Films( String nomFilm, int anneeFilm, String imageFilm, String descriptionFilm) {
		super();
		//this.idFilm = idFilm;
		this.nomFilm = nomFilm;
		this.anneeFilm = anneeFilm;
		this.imageFilm = imageFilm;
		this.descriptionFilm = descriptionFilm;
	}

	public String getNomFilm() {
		return nomFilm;
	}

	public void setNomFilm(String nomFilm) {
		this.nomFilm = nomFilm;
	}

	public int getAnneeFilm() {
		return anneeFilm;
	}

	public void setAnneeFilm(int anneeFilm) {
		this.anneeFilm = anneeFilm;
	}

	public String getImageFilm() {
		return imageFilm;
	}

	public void setImageFilm(String imageFilm) {
		this.imageFilm = imageFilm;
	}

	public String getDescriptionFilm() {
		return descriptionFilm;
	}

	public void setDescriptionFilm(String descriptionFilm) {
		this.descriptionFilm = descriptionFilm;
	}

	public int getIdFilm() {
		return idFilm;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anneeFilm;
		result = prime * result + ((descriptionFilm == null) ? 0 : descriptionFilm.hashCode());
		result = prime * result + idFilm;
		result = prime * result + ((imageFilm == null) ? 0 : imageFilm.hashCode());
		result = prime * result + ((nomFilm == null) ? 0 : nomFilm.hashCode());
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
		Films other = (Films) obj;
		if (anneeFilm != other.anneeFilm)
			return false;
		if (descriptionFilm == null) {
			if (other.descriptionFilm != null)
				return false;
		} else if (!descriptionFilm.equals(other.descriptionFilm))
			return false;
		if (idFilm != other.idFilm)
			return false;
		if (imageFilm == null) {
			if (other.imageFilm != null)
				return false;
		} else if (!imageFilm.equals(other.imageFilm))
			return false;
		if (nomFilm == null) {
			if (other.nomFilm != null)
				return false;
		} else if (!nomFilm.equals(other.nomFilm))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Films [idFilm=" + idFilm + ", nomFilm=" + nomFilm + ", anneeFilm=" + anneeFilm + ", imageFilm="
				+ imageFilm + ", descriptionFilm=" + descriptionFilm + "]";
	}
	
	
	

}
