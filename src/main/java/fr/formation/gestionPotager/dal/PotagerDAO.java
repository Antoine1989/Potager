package fr.formation.gestionPotager.dal;

import org.springframework.data.repository.CrudRepository;

import fr.formation.gestionPotager.bo.Potager;

public interface PotagerDAO extends CrudRepository<Potager, Integer> {

}
