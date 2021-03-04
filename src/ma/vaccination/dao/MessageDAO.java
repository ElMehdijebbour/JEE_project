package ma.vaccination.dao;

import java.util.ArrayList;
import java.util.List;

import ma.vaccination.model.Feedback;
import ma.vaccination.model.Message;
import ma.vaccination.model.Personne;

public class MessageDAO {
	
	public static List<Message> getMessages()  {
		
        List<Message> messages = new ArrayList<>();
        
        List<Feedback> feedbacks = FeedbackDAO.getFeedbacks();
        
        int size = feedbacks.size();
        
        for(int i = 0; i < size; i++) {
        	Feedback feedback = feedbacks.get(i);
        	Personne person = PersonneDAO.getPerson( feedback.getId() );
        	Message message = new Message( feedback, person );
        	messages.add(message);
        }
        
        return messages;
	}
	
}
