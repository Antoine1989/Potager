package fr.formation.gestionPotager.bo;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Plantation {
	@Id
	@GeneratedValue
	private Integer idPlantation;

	private Integer qte;
	private LocalDate datePlantation;
	private LocalDate dateRecolte;
	
	@ManyToOne
	private Plante plante;
	@ManyToOne
	private Carre carre;
	
	
	public Plantation(Integer qte, LocalDate datePlantation, LocalDate dateRecolte) {
	
		this.qte = qte;
		this.datePlantation = datePlantation;
		this.dateRecolte = dateRecolte;
	}





	}
