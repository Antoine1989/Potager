package fr.formation.gestionPotager.bll.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.gestionPotager.bo.Plantation;
import fr.formation.gestionPotager.dal.PlantationDAO;
@Service
public class PlantationManagerImpl implements ManagerGlobal<Plantation> {
	@Autowired
	private PlantationDAO plantationDao;

	@Override
	public void add(Plantation plantation) {
		plantationDao.save(plantation);
		
	}

	@Override
	public void delete(Plantation plantation) {
		// TODO Auto-generated method stub
		plantationDao.delete(plantation);
	}

	@Override
	public void update(Plantation plantation) {
		// TODO Auto-generated method stub
		plantationDao.save(plantation);
	}

	@Override
	public List<Plantation> getAll() {
		return (List<Plantation>) plantationDao.findAll();
	}

	@Override
	public Plantation getById(Integer id) {
		return plantationDao.findById(id).orElse(null);
	}

}
