package fr.formation.gestionPotager.bll.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.gestionPotager.bo.Plantation;
import fr.formation.gestionPotager.dal.PlantationDAO;
@Service
public class PlantationManagerImpl implements ManagerGlobal<Plantation> {
	@Autowired
	private PlantationDAO plantationDAO;

	@Override
	public void add(Plantation plantation) {
		plantationDAO.save(plantation);
		
	}

	@Override
	public void delete(Plantation plantation) {
		// TODO Auto-generated method stub
		plantationDAO.delete(plantation);
	}

	@Override
	public void update(Plantation plantation) {
		// TODO Auto-generated method stub
		plantationDAO.save(plantation);
	}

	@Override
	public List<Plantation> getAll() {
		return (List<Plantation>) plantationDAO.findAll();
	}

}
