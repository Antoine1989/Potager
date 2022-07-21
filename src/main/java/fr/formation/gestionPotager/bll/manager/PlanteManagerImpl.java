package fr.formation.gestionPotager.bll.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.gestionPotager.bo.Plante;
import fr.formation.gestionPotager.dal.PlanteDAO;

@Service
public class PlanteManagerImpl implements ManagerGlobal<Plante>{

	
	@Autowired
	private PlanteDAO planteDao;
	
	@Override
	public void add(Plante plante) {
		planteDao.save(plante);
		
	}

	@Override
	public List<Plante> getAll() {
		
		 return (List<Plante>) planteDao.findAll();
	}

	@Override
	public void delete(Plante plante) {
		planteDao.delete(plante);
		
	}

	@Override
	public void update(Plante plante) {
		planteDao.save(plante);
		
	}

}
