package fr.formation.gestionPotager.bo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter 
@Setter
@ToString
@NoArgsConstructor
public class Potager {

	@Id
	@GeneratedValue
	private Integer idPotager;
	
	private String localisation;
	private String nom;
	private Integer surface;
	private String ville;
	
	@OneToMany(mappedBy="potager")
	@ToString.Exclude
	Set<Carre> lstCarres = new HashSet<Carre>();
	
	
	public void addCarre(Carre carre) {
		lstCarres.add(carre);
		carre.setPotager(this);
	
	}


	public Potager(String localisation, String nom, Integer surface, String ville) {
		
		this.localisation = localisation;
		this.nom = nom;
		this.surface = surface;
		this.ville = ville;
	}
}
