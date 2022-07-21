package fr.formation.gestionPotager.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
	
	@ManyToOne
	private Carre carre;
	
	public Plante(String nom, String type, Integer surface, String variete) {
		
		this.nom = nom;
		this.type = type;
		this.surface = surface;
		this.variete = variete;
	}

	@Override
	public String toString() {
		return "Plante [nom=" + nom + ", type=" + type + ", surface=" + surface + ", variete=" + variete + "]";
	}

	
	
	
}
