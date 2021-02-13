package com.vaccination.model;

import java.io.Serializable;

//NEW Add street, city, state, zipcode, email, password

public class Personne implements Serializable{
	private static final long serialVersionUID = 1L;
	private String nom;
	private String prenom;
	private String ville;
	private String region;
	private String adress;
	private String municipalite;
	private String cin;
	private String email;
	private String password;
	private String phone;
	public Personne() {
		this.setNom("");
		this.setPrenom("");
		this.setVille("");
		this.setRegion("");
		this.setAdress("");
		this.setMunicipalite("");
		this.setCin("");
		this.setEmail("");
		this.setPassword("");
		this.setPhone("");

	}
	

	public Personne(String nom, String prenom, String ville, String region, String adress, String municipalite,
			String cin, String email, String password, String phone)  {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setVille(ville);
		this.setRegion(region);
		this.setAdress(adress);
		this.setMunicipalite(municipalite);
		this.setCin(cin);
		this.setEmail(email);
		this.setPassword(password);
		this.setPhone(phone);
	
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getMunicipalite() {
		return municipalite;
	}

	public void setMunicipalite(String municipalite) {
		this.municipalite = municipalite;
	}


	
}