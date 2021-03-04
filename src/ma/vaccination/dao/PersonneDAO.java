package ma.vaccination.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ma.vaccination.model.Personne;

public class PersonneDAO {
	
	public static int getCount()  {
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        int count;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Vaccination");
            entityManager = entityManagerFactory.createEntityManager();
            count = entityManager.createQuery( "from Personne", Personne.class ).getResultList().size();
        } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
		return count;
	}
	
	public static int getId(String cin)  {

		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        int id = 0;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Vaccination");
            entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createQuery( "from Personne WHERE cin = :txtCIN", Personne.class ).setParameter("txtCIN", cin);
            id = ( (Personne) query.getSingleResult() ).getId();
        } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
		return id;
		
	}
	
	public static Personne isLoginValid(String cin, String password)  {

		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        Personne person = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Vaccination");
            entityManager = entityManagerFactory.createEntityManager();
            Query query = entityManager.createQuery( "from Personne WHERE cin = :txtCIN AND password = :txtPassword", Personne.class )
            										.setParameter("txtCIN", cin)
            										.setParameter("txtPassword", password);
            if (query.getResultList().size() == 1) {
            	person = (Personne) query.getSingleResult() ;
            }
            
        } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
		return person;
		
	}
	
	public static Personne getPerson(int id)  {

		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        Personne person = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Vaccination");
            entityManager = entityManagerFactory.createEntityManager();
            person = entityManager.find( Personne.class, id);
        } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
		return person;
		
	}
	
	public static List<Personne> getPersons()  {

		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        List<Personne> persons = new ArrayList<>();
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Vaccination");
            entityManager = entityManagerFactory.createEntityManager();
            persons = entityManager.createQuery( "from Personne", Personne.class ).getResultList();
            return persons;
        } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
		
	}
		
	public static boolean insertPerson(Personne person) {
		
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Vaccination");
            entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction trans = entityManager.getTransaction();
            trans.begin();
            	entityManager.persist( person );
            trans.commit();
            return true;
        }catch(Exception e){
        	return false;
        }finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
        
	}

}
