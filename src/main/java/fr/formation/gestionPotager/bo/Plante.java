package fr.formation.gestionPotager.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	
	@OneToOne
	private Plantation plantation;
	
	public Plante(String nom, String type, Integer surface, String variete) {
		
		this.nom = nom;
		this.type = type;
		this.surface = surface;
		this.variete = variete;
	}



	
	
	
}
