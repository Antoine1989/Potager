package fr.formation.gestionPotager.dal;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import fr.formation.gestionPotager.bo.Carre;
import fr.formation.gestionPotager.bo.Plantation;
import fr.formation.gestionPotager.bo.Plante;



public interface PlantationDAO extends CrudRepository<Plantation, Integer>{
	@Query("SELECT p.carre FROM Plantation p WHERE p= :plantation")
	Carre findPlantationCarre(@Param("plantation") Plantation plantation);
	
	@Query("SELECT p.plante FROM Plantation p WHERE p= :plantation")
	Plante findPlantationPlante(@Param("plantation") Plantation plantation);


}
