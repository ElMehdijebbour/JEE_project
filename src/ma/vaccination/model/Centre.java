package ma.vaccination.model;

public class Centre {
	
	private int centre_id;
	private String centre_nom;
	private String centre_adress;
	private String centre_ville;
	
	
	
	public Centre(int centre_id, String centre_nom, String centre_adress, String centre_ville) {
		this.centre_id = centre_id;
		this.centre_nom = centre_nom;
		this.centre_adress = centre_adress;
		this.centre_ville = centre_ville;
	}
	
	public int getCentre_id() {
		return centre_id;
	}
	public void setCentre_id(int centre_id) {
		this.centre_id = centre_id;
	}
	public String getCentre_nom() {
		return centre_nom;
	}
	public void setCentre_nom(String centre_nom) {
		this.centre_nom = centre_nom;
	}
	public String getCentre_adress() {
		return centre_adress;
	}
	public void setCentre_adress(String centre_adress) {
		this.centre_adress = centre_adress;
	}
	public String getCentre_ville() {
		return centre_ville;
	}
	public void setCentre_ville(String centre_ville) {
		this.centre_ville = centre_ville;
	}
	
	
	

}
