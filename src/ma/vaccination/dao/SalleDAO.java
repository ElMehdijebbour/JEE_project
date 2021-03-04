package ma.vaccination.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ma.vaccination.model.Salle;

public class SalleDAO {
	
	
	public static int getId(String nom)  {

		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        int id = 0 ;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Vaccination");
            entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createQuery( "from Salle WHERE salle_nom = :txtNom", Salle.class )
            										.setParameter("txtNom", nom);
            if (query.getResultList().size() == 1) {
            	id = ( (Salle) query.getSingleResult() ).getSalle_id() ;
            }
            
        } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
		return id;
		
	}
	
	
	public static Salle getSalle(int id) {
		
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        Salle salle = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Vaccination");
            entityManager = entityManagerFactory.createEntityManager();
            salle = entityManager.find( Salle.class, id);
        } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
		return salle;
		
	}
	
}
