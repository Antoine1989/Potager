package fr.formation.gestionPotager.bll.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.gestionPotager.dal.PotagerDAO;



@Service
public class PotagerManagerImpl implements PotagerManager {
	@Autowired
	private PotagerDAO potagerDao;
}
