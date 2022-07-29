package fr.formation.gestionPotager.dal;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import fr.formation.gestionPotager.bo.Carre;
import fr.formation.gestionPotager.bo.Plantation;
import fr.formation.gestionPotager.bo.Plante;

public interface PlanteDAO extends CrudRepository<Plante, Integer>  {

}
