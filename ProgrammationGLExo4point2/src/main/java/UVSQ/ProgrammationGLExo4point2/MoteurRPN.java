package UVSQ.ProgrammationGLExo4point2;

import java.util.ArrayList;

public class MoteurRPN extends Interpreteur{
	
	private ArrayList<Integer> ListOperande;
	//constructeur
	public MoteurRPN() 
	{
		ListOperande = new ArrayList<Integer>();
	}
	
	public void enregistrerOprnd() 
	{

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
		return ListOperande;
	}

	public void setListOperande(ArrayList<Integer> listOperande) {
		ListOperande = listOperande;
	}
}