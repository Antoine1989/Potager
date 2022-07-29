package fr.formation.gestionPotager.bo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
public class Plante {
	@Id
	@GeneratedValue
	private Integer idPlante;
	private String nom;
	private String type;
	private Integer surface;
	private String variete;
	
	@OneToMany(mappedBy="plante")
	private Set<Plantation> lstPlantations=new HashSet<Plantation>();
	
	public Plante(String nom, String type, Integer surface, String variete) {
		
		this.nom = nom;
		this.type = type;
		this.surface = surface;
		this.variete = variete;
	}

	public void addPlantationPlante(Plantation plantation) {
		lstPlantations.add(plantation);
		plantation.setPlante(this);
	}
	
	
	
}
