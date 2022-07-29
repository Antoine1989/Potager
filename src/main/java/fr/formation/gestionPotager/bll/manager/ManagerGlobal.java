package fr.formation.gestionPotager.bll.manager;

import java.util.List;

import fr.formation.gestionPotager.bo.Plantation;
import fr.formation.gestionPotager.bo.Plante;

public interface ManagerGlobal<T>{
	public void add(T t) throws PotagerException;
	public List<T> getAll();
	//public Object addt (T t);
	public void delete(T t);
	public void update(T t);
	public T getById(Integer id);
	
	
	
	

}
