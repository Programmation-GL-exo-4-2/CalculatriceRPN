package UVSQ.ProgrammationGLExo4point2;

import java.util.ArrayList;

public class MoteurRPN extends Interpreteur{
	
	private ArrayList<Integer> listOperande;
	//constructeur
	public MoteurRPN() 
	{
		listOperande = new ArrayList<Integer>();
	}
	
	public void enregistrerOprnd(int op) 
	{
		listOperande.add(op);
	}
	
	public void operationOprnd()
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