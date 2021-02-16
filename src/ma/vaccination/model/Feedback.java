package ma.vaccination.model;

public class Feedback {
	
	private int fb_id;
	private int id;
	private String fb_description;
	private String fb_date;
	
	
	
	
	public Feedback(int fb_id, int id, String fb_description, String fb_date) {
		this.fb_id = fb_id;
		this.id = id;
		this.fb_description = fb_description;
		this.fb_date = fb_date;
	}
	
	public int getFb_id() {
		return fb_id;
	}
	public void setFb_id(int fb_id) {
		this.fb_id = fb_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFb_description() {
		return fb_description;
	}
	public void setFb_description(String fb_description) {
		this.fb_description = fb_description;
	}
	public String getFb_date() {
		return fb_date;
	}
	public void setFb_date(String fb_date) {
		this.fb_date = fb_date;
	}
	
	
	

}
