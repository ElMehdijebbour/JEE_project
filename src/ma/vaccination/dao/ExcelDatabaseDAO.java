package ma.vaccination.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ma.vaccination.model.ExcelDatabase;
import ma.vaccination.model.Personne;
import ma.vaccination.model.Rdv;
import ma.vaccination.model.Vaccin;

public class ExcelDatabaseDAO {
	
	public static List<ExcelDatabase> getDatabase()  {
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        List<ExcelDatabase> database = new ArrayList<>();
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Vaccination");
            entityManager = entityManagerFactory.createEntityManager();
            List<Personne> persons = entityManager.createQuery( "from Personne", Personne.class ).getResultList();
            int size = persons.size();
            for(int i=0; i < size; i++) {
            	Personne person = persons.get(i);
            	List<Rdv> rdvList = entityManager.createQuery( "from Rdv WHERE id = :txtID ORDER BY rdv_date DESC, rdv_heure DESC", Rdv.class )
            									.setParameter("txtID", person.getId() ).getResultList();
            	int count = rdvList.size() ;
            	for(int j=0; j < count; j++) {
                	Rdv rdv = rdvList.get(j);
                	Vaccin vac = entityManager.find(Vaccin.class, rdv.getVac_id());
                	ExcelDatabase excelDatabase = new ExcelDatabase(
							person.getId(), 
							person.getCin(), 
							person.getPassword(), 
							person.getNom(), 
							person.getPrenom(), 
							person.getAdress(), 
							person.getEmail(), 
							person.getPhone(), 
							person.getProfession(), 
							person.getAge(), 
							rdv.getRdv_date(), 
							rdv.getRdv_heure(), 
							rdv.isRdv_bool(), 
							vac.getVac_serie(), 
							vac.getVac_dose(), 
							vac.getVac_brand() );
					database.add(excelDatabase);
            	}
            }
			
        } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
        return database;
	}

}
