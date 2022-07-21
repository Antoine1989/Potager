package fr.formation.gestionPotager.bo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
public class Carre {
	@Id
	@GeneratedValue
	private Integer idCarre;
	private Integer surface;
	private String typeSol;
	private String exposition;
	
	@ManyToOne
	private Potager potager;
	
	@OneToMany(mappedBy="carre")
	Set<Plante> lstPlantes = new HashSet<>();
	
	public Carre( Integer surface, String typeSol, String exposition) {
		
		this.surface = surface;
		this.typeSol = typeSol;
		this.exposition = exposition;
	}

	public void addPlante(Plante plante) {
		lstPlantes.add(plante);
		plante.setCarre(this);
	
	}
	
}
