package ma.vaccination.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ma.vaccination.model.Rdv;

public class RdvDAO {
	
	public static int getCount()  {

		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        int count;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Vaccination");
            entityManager = entityManagerFactory.createEntityManager();
            count = entityManager.createQuery( "from Rdv", Rdv.class ).getResultList().size();
        } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
		return count;
		
	}
	
	public static int getRdvPresent()  {

		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        int count;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Vaccination");
            entityManager = entityManagerFactory.createEntityManager();
            count = entityManager.createQuery( "from Rdv WHERE rdv_bool = :bool", Rdv.class )
            					 .setParameter("bool", true).getResultList().size();
        } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
		return count;
		
	}
	
	public static int getRdvAbsent()  {

		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        int count;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Vaccination");
            entityManager = entityManagerFactory.createEntityManager();
            count = entityManager.createQuery( "from Rdv WHERE rdv_bool = :bool", Rdv.class )
            					 .setParameter("bool", false).getResultList().size();
        } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
		return count;
		
	}
	
	public static Rdv getLastRdv(int id) {
		
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        Rdv rdv = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Vaccination");
            entityManager = entityManagerFactory.createEntityManager();
            rdv = entityManager.createQuery( "from Rdv WHERE id = :txtID ORDER BY rdv_date DESC, rdv_heure DESC", Rdv.class )
					 		   .setParameter("txtID", id).setMaxResults(1).getSingleResult();
        } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
		return rdv;
		
	}
	
	
	
	public static boolean insertRdv(Rdv rdv) {
		
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Vaccination");
            entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction trans = entityManager.getTransaction();
            trans.begin();
            	entityManager.persist( rdv );
            trans.commit();
            return true;
        } catch(Exception e){
        	return false;
        } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
		
	}
	
	public static boolean updateRdv(Rdv rdv) {
		
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Vaccination");
            entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction trans = entityManager.getTransaction();
            trans.begin();
            	entityManager.merge( rdv );
            trans.commit();
            return true;
        }  finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
		
	}

}
