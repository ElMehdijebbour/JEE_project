package ma.vaccination.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Salle {
	
	@Id @GeneratedValue( strategy=GenerationType.IDENTITY )
	private int salle_id;
	private String salle_nom;
	
	public Salle() {
		
	}
	
	public Salle(int salle_id, String salle_nom) {
		this.salle_id = salle_id;
		this.salle_nom = salle_nom;
	}



	public int getSalle_id() {
		return salle_id;
	}



	public void setSalle_id(int salle_id) {
		this.salle_id = salle_id;
	}



	public String getSalle_nom() {
		return salle_nom;
	}



	public void setSalle_nom(String salle_nom) {
		this.salle_nom = salle_nom;
	}
	
	
	
	
	

}
