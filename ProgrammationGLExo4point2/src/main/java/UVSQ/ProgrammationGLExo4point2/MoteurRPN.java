package UVSQ.ProgrammationGLExo4point2;

import java.util.ArrayList;
import java.util.Stack;

public class MoteurRPN extends Interpreteur{
	
	private ArrayList<Integer> listOperande;
	private Stack<ArrayList<Integer>> _undo=new Stack<ArrayList<Integer>>();
	private String dernierSaisie;
	//constructeur
	public MoteurRPN() 
	{
		listOperande = new ArrayList<Integer>();
		_undo.push(null);
	}
	
	public void enregistrerOprnd() 
	{
		listOperande.add(Integer.parseInt(dernierSaisie));
		_undo.push(listOperande);
	}
	
	public void operationOprnd()
	{
			int taille=this.listOperande.size();
			int oprnd1=this.listOperande.get(taille-2);
			int oprnd2=this.listOperande.get(taille-1);
			int rsult=0;
			if(dernierSaisie=="+")
				rsult=oprnd1+oprnd2;
			else if(dernierSaisie=="-")
				rsult=oprnd1-oprnd2;
			else if(dernierSaisie=="*")
				rsult=oprnd1*oprnd2;
			else if(dernierSaisie=="/")
				rsult=oprnd1/oprnd2;
			this.listOperande.remove(taille-1);
			this.listOperande.remove(taille-2);
			this.listOperande.add(rsult);
			
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
		String str = "";
		str += listOperande.get(0);
		
		for(int i = 1 ; i < listOperande.size() ; i++)
		{
			str += " " + listOperande.get(i); 
		}
		return str;
	}
	
	public Stack<ArrayList<Integer>> getStackUndo()
	{
		return this._undo;
	}
}