package fr.formation.gestionPotager;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.formation.gestionPotager.bll.manager.ManagerGlobal;
import fr.formation.gestionPotager.bo.Carre;
import fr.formation.gestionPotager.bo.Plantation;
import fr.formation.gestionPotager.bo.Plante;
import fr.formation.gestionPotager.bo.Potager;

@SpringBootApplication
public class GestionPotagerApplication implements CommandLineRunner{
	@Autowired
	private ManagerGlobal<Potager> potagerManager;
	@Autowired
	private ManagerGlobal<Carre> carreManager;
	@Autowired
	private ManagerGlobal<Plante> planteManager;
	@Autowired
	private ManagerGlobal<Plantation> plantationManager;
	
	
	public static void main(String[] args) {
		SpringApplication.run(GestionPotagerApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		Potager potager1 =new Potager ("Bretagne","Potager de maman",90,"Brest");
		Carre carre1=new Carre(25,"argileux","ombre");
		Carre carre2=new Carre(40,"sableux","ensoleillé");
		Plantation plantation1=new Plantation(3,LocalDate.of(2022,7,21),LocalDate.of(2022,9,21));
		Plantation plantation2=new Plantation(1,LocalDate.of(2022,7,21),LocalDate.of(2022,10,21));
		
		potagerManager.add(potager1);
		
		potager1.addCarre(carre1);
		carreManager.add(carre1);
		
		System.out.println(potager1);
		System.out.println(carre1);
		
		potager1.addCarre(carre2);
		carreManager.add(carre2);
		
		plantationManager.add(plantation1);
		
		Plante carotte=new Plante("carotte","racine",1,"Naine");
		planteManager.add(carotte);
		plantation1.setPlante(carotte);
		carre2.addPlantation(plantation1);
		
	

		
		Plante betterave=new Plante("bettrave","racine",2,"Rouge");
		planteManager.add(betterave);
		plantation2.setPlante(betterave);
		carre2.addPlantation(plantation2);
		
		System.out.println(plantation1);
		System.out.println(plantation2);
		System.out.println(potager1);
		System.out.println(carre2);
		System.out.println(carotte);
		System.out.println(carre2);
//		carreManager.get
		
	for (Plantation plantation : carre2.getLstPlantations()) {
		
	System.out.println(plantation.getPlante().getType());
	
	}

	}
}
