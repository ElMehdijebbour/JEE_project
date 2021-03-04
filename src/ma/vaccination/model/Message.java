package ma.vaccination.model;

public class Message {
	
	private Feedback feedback;
	private Personne person;
	
	public Message(Feedback feedback, Personne person) {
		this.feedback = feedback;
		this.person = person;
	}

	public Feedback getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}

	public Personne getPerson() {
		return person;
	}

	public void setPerson(Personne person) {
		this.person = person;
	}
	
	

}

