package ma.vaccination.model;

public class Vaccin {
	
	private int vac_id;
	private int vac_serie;
	private int vac_dose;
	private String vac_brand;
	
	
	
	public Vaccin(int vac_id, int vac_serie, int vac_dose, String vac_brand) {
		this.vac_id = vac_id;
		this.vac_serie = vac_serie;
		this.vac_dose = vac_dose;
		this.vac_brand = vac_brand;
	}
	
	public int getVac_id() {
		return vac_id;
	}
	public void setVac_id(int vac_id) {
		this.vac_id = vac_id;
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
