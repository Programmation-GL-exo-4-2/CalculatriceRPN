package UVSQ.ProgrammationGLExo4point2;

import java.util.ArrayList;

public class MoteurRPN extends Interpreteur{
	
	private ArrayList<Integer> listOperande;
	private String dernierSaisie;
	//constructeur
	public MoteurRPN() 
	{
		listOperande = new ArrayList<Integer>();
	}
	
	public void enregistrerOprnd() 
	{
		
		listOperande.add(Integer.parseInt(dernierSaisie));
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
	
	public String getSaisie()
	{
		return this.dernierSaisie;
	}
	
	public void setSaisie(String a)
	{
		this.dernierSaisie=a;
	}
}