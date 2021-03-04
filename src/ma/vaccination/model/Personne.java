package ma.vaccination.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Personne {
	@Id @GeneratedValue( strategy=GenerationType.IDENTITY )
	private int id;
	private String cin;
	private String password;
	private String nom;
	private String prenom;
	private String adress;
	private String email;
	private String phone;
	private String profession;
	private int age;
	
	public Personne() {
		
	}
	
	
	public Personne(int id, String cin, String password, String nom, String prenom, String adress, String email, String phone, String profession, int age) {
		this.id = id;
		this.cin = cin;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
		this.email = email;
		this.phone = phone;
		this.profession = profession;
		this.age = age;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getProfession() {
		return profession;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	
	

}
