package fr.formation.gestionPotager.dal;

import org.springframework.data.repository.CrudRepository;

import fr.formation.gestionPotager.bo.Plante;

public interface PlanteDAO extends CrudRepository<Plante, Integer>  {
	

}
