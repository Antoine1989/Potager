package fr.formation.gestionPotager.dal;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import fr.formation.gestionPotager.bo.Carre;

public interface CarreDAO extends CrudRepository<Carre, Integer> {

/*	@Query("SELECT count(p) FROM Plante p WHERE p.carre.nom = :nom")
    int getCandidatCount(@Param("candidat") String candidat);*/
	
}
