package UVSQ.ProgrammationGLExo4point2;

import java.util.ArrayList;

public class MoteurRPN extends Interpreteur{
	
	private ArrayList<Integer> listOperande;
	//constructeur
	public MoteurRPN() 
	{
		listOperande = new ArrayList<Integer>();
	}
	
	public void enregistrerOprnd(int oprnd) 
	{
		listOperande.add(oprnd);
	}
	
	public void operationOprnd(int op)
	{
		
	}
	public ArrayList<Integer> getEnsembleOpnd()
	{
		
		//Pour l'instant rien, à developper
		return null;
	}

	public ArrayList<Integer> getListOperande() {
		return listOperande;
	}

	public void setListOperande(ArrayList<Integer> listOperande) {
		listOperande = listOperande;
	}
}