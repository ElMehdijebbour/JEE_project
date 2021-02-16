package ma.vaccination.model;

public class Personne {
	
	private int id;
	private String cin;
	private String password;
	private String nom;
	private String prenom;
	private String adress;
	private String email;
	private String phone;
	private String ville;
	
	
	
	public Personne(int id, String cin, String password, String nom, String prenom, String adress, String email, String phone, String ville) {
		this.id = id;
		this.cin = cin;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
		this.email = email;
		this.phone = phone;
		this.ville = ville;
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
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	

}
