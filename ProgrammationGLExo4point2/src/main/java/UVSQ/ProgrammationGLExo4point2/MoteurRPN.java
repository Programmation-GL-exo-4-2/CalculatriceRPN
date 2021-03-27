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
		if(dernierSaisie=="+")
		{
			int taille=this.listOperande.size();
			int oprnd1=this.listOperande.get(taille-2);
			int oprnd2=this.listOperande.get(taille-1);
			int rsult=oprnd1+oprnd2;
			this.listOperande.remove(taille-1);
			this.listOperande.remove(taille-2);
			this.listOperande.add(rsult);
			
		}
		else if(dernierSaisie=="-")
		{
			int taille=this.listOperande.size();
			int oprnd1=this.listOperande.get(taille-2);
			int oprnd2=this.listOperande.get(taille-1);
			int rsult=oprnd1-oprnd2;
			this.listOperande.remove(taille-1);
			this.listOperande.remove(taille-2);
			this.listOperande.add(rsult);
		}
		else if(dernierSaisie=="*")
		{
			int taille=this.listOperande.size();
			int oprnd1=this.listOperande.get(taille-2);
			int oprnd2=this.listOperande.get(taille-1);
			int rsult=oprnd1*oprnd2;
			this.listOperande.remove(taille-1);
			this.listOperande.remove(taille-2);
			this.listOperande.add(rsult);
		}
		else if(dernierSaisie=="/")
		{
			int taille=this.listOperande.size();
			int oprnd1=this.listOperande.get(taille-2);
			int oprnd2=this.listOperande.get(taille-1);
			int rsult=oprnd1/oprnd2;
			this.listOperande.remove(taille-1);
			this.listOperande.remove(taille-2);
			this.listOperande.add(rsult);
		}	
			
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
	@Override
	public String toString() 
	{
		
		return "";
	}
}