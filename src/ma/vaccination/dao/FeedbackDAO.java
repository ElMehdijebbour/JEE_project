package ma.vaccination.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ma.vaccination.model.Feedback;

public class FeedbackDAO {
	
	public static List<Feedback> getFeedbacks()  {

		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        List<Feedback> feedbacks = new ArrayList<>();
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Vaccination");
            entityManager = entityManagerFactory.createEntityManager();
            feedbacks = entityManager.createQuery( "from Feedback ORDER BY fb_date DESC", Feedback.class ).getResultList();
            return feedbacks;
        } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
	}
		
	public static boolean insertFeedback(Feedback feedback) {
		
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Vaccination");
            entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction trans = entityManager.getTransaction();
            trans.begin();
            	entityManager.persist( feedback );
            trans.commit();
            return true;
        } catch(Exception e){
        	return false;
        } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
		
	}

}
