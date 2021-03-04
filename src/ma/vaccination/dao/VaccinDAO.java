package ma.vaccination.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ma.vaccination.model.Vaccin;

public class VaccinDAO {
	
	
	public static Vaccin getVaccin(int id) {
		
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        Vaccin vaccin = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Vaccination");
            entityManager = entityManagerFactory.createEntityManager();
            vaccin = entityManager.find( Vaccin.class, id);
        } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
		return vaccin;
		
	}
	
	public static int getLastVaccinID() {
		
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        int id ;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Vaccination");
            entityManager = entityManagerFactory.createEntityManager();
            id =  entityManager.createQuery( "from Vaccin ORDER BY vac_id DESC", Vaccin.class ).setMaxResults(1).getSingleResult().getVac_id();
        } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
		return id;
		
	}
	
	public static List<Vaccin> getVaccins() {
		
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        List<Vaccin> vaccins = new ArrayList<>();
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Vaccination");
            entityManager = entityManagerFactory.createEntityManager();
            vaccins = entityManager.createQuery( "from Vaccin", Vaccin.class ).getResultList();
            return vaccins;
        } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
		
	}
	
	public static boolean insertVaccin(Vaccin vaccin) {
		
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Vaccination");
            entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction trans = entityManager.getTransaction();
            trans.begin();
            	entityManager.persist( vaccin );
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
