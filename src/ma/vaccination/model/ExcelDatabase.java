package ma.vaccination.model;

public class ExcelDatabase {
	
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
	
	private String rdv_date;
	private String rdv_heure;
	private boolean rdv_bool;
	
	private int vac_serie;
	private int vac_dose;
	private String vac_brand;
	
	
	
	
	public ExcelDatabase(int id, String cin, String password, String nom, String prenom, String adress, String email,
			String phone, String profession, int age, String rdv_date, String rdv_heure, boolean rdv_bool,
			int vac_serie, int vac_dose, String vac_brand) {
		
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
		this.rdv_date = rdv_date;
		this.rdv_heure = rdv_heure;
		this.rdv_bool = rdv_bool;
		this.vac_serie = vac_serie;
		this.vac_dose = vac_dose;
		this.vac_brand = vac_brand;
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
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRdv_date() {
		return rdv_date;
	}
	public void setRdv_date(String rdv_date) {
		this.rdv_date = rdv_date;
	}
	public String getRdv_heure() {
		return rdv_heure;
	}
	public void setRdv_heure(String rdv_heure) {
		this.rdv_heure = rdv_heure;
	}
	public boolean isRdv_bool() {
		return rdv_bool;
	}
	public void setRdv_bool(boolean rdv_bool) {
		this.rdv_bool = rdv_bool;
	}
	public int getVac_serie() {
		return vac_serie;
	}
	public void setVac_serie(int vac_serie) {
		this.vac_serie = vac_serie;
	}
	public int getVac_dose() {
		return vac_dose;
	}
	public void setVac_dose(int vac_dose) {
		this.vac_dose = vac_dose;
	}
	public String getVac_brand() {
		return vac_brand;
	}
	public void setVac_brand(String vac_brand) {
		this.vac_brand = vac_brand;
	}
	
	

}
