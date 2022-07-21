package fr.formation.gestionPotager.bll.manager;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import fr.formation.gestionPotager.bo.Potager;
import fr.formation.gestionPotager.dal.PotagerDAO;



@Service
public class PotagerManagerImpl implements ManagerGlobal<Potager> {
	@Autowired
	private PotagerDAO potagerDao;

	@Override
	public void add(Potager potager) {
		potagerDao.save(potager);
		
	}

	@Override
	public List<Potager> getAll() {
		 return (List<Potager>) potagerDao.findAll();
	}

	@Override
	public void delete(Potager potager) {
		potagerDao.delete(potager);
		
	}

	@Override
	public void update(Potager potager) {
		potagerDao.save(potager);
		
	}
}
