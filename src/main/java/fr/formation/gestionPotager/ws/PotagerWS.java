package fr.formation.gestionPotager.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.gestionPotager.bll.manager.ManagerGlobal;
import fr.formation.gestionPotager.bll.manager.PotagerException;
import fr.formation.gestionPotager.bo.Carre;
import fr.formation.gestionPotager.bo.Plantation;
import fr.formation.gestionPotager.bo.Plante;
import fr.formation.gestionPotager.bo.Potager;


@RestController
public class PotagerWS {
	@Autowired
	ManagerGlobal<Potager> managerPotager;
	@Autowired
	ManagerGlobal<Plantation> managerPlantation;
	@Autowired
	ManagerGlobal<Plante> managerPlante;
	@Autowired
	ManagerGlobal<Carre> managerCarre;
	
	
	@PostMapping("/potager")
	public void addPotager(@RequestBody Potager potager) {
		try {
			managerPotager.add(potager);
		} catch (PotagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
	@PostMapping("/plante")
	public void addPlante(@RequestBody Plante plante) {
		try {
			managerPlante.add(plante);
		} catch (PotagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@PostMapping("/carre")
	public void addCarre(@RequestBody Carre carre) {
		try {
			managerCarre.add(carre);
		} catch (PotagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@PostMapping("/plantation")
	public void addPlantation(@RequestBody Plantation plantation) {
		try {
			managerPlantation.add(plantation);
		} catch (PotagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	@GetMapping("/planter/{idPlantation}")
	public void planter(@PathVariable("idPlantation") Integer idPlantation) {
		try {
			managerPlantation.add(managerPlantation.getById(idPlantation));
		} catch (PotagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
