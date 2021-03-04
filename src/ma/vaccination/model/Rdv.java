package ma.vaccination.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table( name = "Rendezvous")
public class Rdv {
	
	@Id @GeneratedValue( strategy=GenerationType.IDENTITY )
	private int rdv_id;
	private String rdv_date;
	private String rdv_heure;
	private boolean rdv_bool;
	private int id;
	private int vac_id;
	private int salle_id;
	
	
	public Rdv() {
		
	}
	
	public Rdv(String rdv_date, String rdv_heure, int id, int salle_id ) {
		this.rdv_id = 0;
		this.rdv_date = rdv_date;
		this.rdv_heure = rdv_heure;
		this.rdv_bool = false;
		this.id = id;
		this.salle_id = salle_id;
		this.vac_id = 1;
	}


	public Rdv(int rdv_id, String rdv_date, String rdv_heure, boolean rdv_bool, int id, int vac_id, int salle_id) {
		this.rdv_id = rdv_id;
		this.rdv_date = rdv_date;
		this.rdv_heure = rdv_heure;
		this.rdv_bool = rdv_bool;
		this.id = id;
		this.vac_id = vac_id;
		this.salle_id = salle_id;
	}
	
	
	public int getRdv_id() {
		return rdv_id;
	}
	public void setRdv_id(int rdv_id) {
		this.rdv_id = rdv_id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getVac_id() {
		return vac_id;
	}
	public void setVac_id(int vac_id) {
		this.vac_id = vac_id;
	}
	public int getSalle_id() {
		return salle_id;
	}
	public void setSalle_id(int salle_id) {
		this.salle_id = salle_id;
	}
	
	
	

}
