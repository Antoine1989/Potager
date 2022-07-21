package fr.formation.gestionPotager.bll.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.gestionPotager.bo.Carre;
import fr.formation.gestionPotager.dal.CarreDAO;

@Service
public class CarreManagerImpl implements ManagerGlobal<Carre>{
	
	@Autowired
	private CarreDAO carreDao;
	@Override
	public void add(Carre carre) {
		carreDao.save(carre);
		
	}

	@Override
	public List<Carre> getAll() {
		return (List<Carre>) carreDao.findAll();
	}

	@Override
	public void delete(Carre carre) {
		carreDao.delete(carre);
		
	}

	@Override
	public void update(Carre carre) {
		carreDao.save(carre);
		
	}

}
