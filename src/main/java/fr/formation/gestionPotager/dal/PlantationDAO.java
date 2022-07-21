package fr.formation.gestionPotager.dal;

import org.springframework.data.repository.CrudRepository;

import fr.formation.gestionPotager.bo.Plantation;

public interface PlantationDAO extends CrudRepository<Plantation, Integer>{

}
