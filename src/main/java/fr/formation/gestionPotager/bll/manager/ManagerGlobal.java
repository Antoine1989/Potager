package fr.formation.gestionPotager.bll.manager;

import java.util.List;

public interface ManagerGlobal<T>{
	public void add(T t);
	public List<T> getAll();
	public void delete(T t);
	public void update(T t);
	

}
