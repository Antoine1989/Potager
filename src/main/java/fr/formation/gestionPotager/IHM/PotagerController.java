package fr.formation.gestionPotager.IHM;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.formation.gestionPotager.bll.manager.ManagerGlobal;
import fr.formation.gestionPotager.bll.manager.PotagerException;
import fr.formation.gestionPotager.bo.Carre;
import fr.formation.gestionPotager.bo.Plantation;
import fr.formation.gestionPotager.bo.Plante;
import fr.formation.gestionPotager.bo.Potager;

@Controller
@RequestMapping("/")
public class PotagerController {

	@Autowired
	ManagerGlobal<Potager> managerPotager;
	@Autowired
	ManagerGlobal<Plantation> managerPlantation;
	@Autowired
	ManagerGlobal<Plante> managerPlante;
	@Autowired
	ManagerGlobal<Carre> managerCarre;

	@PostConstruct
	public void init() {
		Potager potager1 = new Potager("Bretagne", "Potager de maman", 90, "Brest");
		Potager potager2 = new Potager("Normandie", "Potager de tonton", 90, "Avranches");
		try {
			managerPotager.add(potager1);
		} catch (PotagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			managerPotager.add(potager2);
		} catch (PotagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@GetMapping("")
	public String index(Model model) {
		model.addAttribute("list", managerPotager.getAll());
		
		return "index";
	}
	@GetMapping("/add")
	public String addPotager(Potager potager, Model model) {
		return "add";
		
	}

	@PostMapping("/add")
	public String validAddForm(@Valid Potager potager, BindingResult errors, Model model) {
	
		
		 if(errors.hasErrors()) {
	            return "add";
	        }
	        try {
	        	managerPotager.add(potager);
	        } catch (PotagerException e) {
	            errors.addError(new FieldError("potager","nom",e.getMessage()));
	            return "add";
	        }
		return "redirect:/";
	}
	}


