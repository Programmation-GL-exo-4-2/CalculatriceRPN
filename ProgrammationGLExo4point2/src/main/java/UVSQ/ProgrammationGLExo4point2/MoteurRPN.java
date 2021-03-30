package UVSQ.ProgrammationGLExo4point2;

import java.util.ArrayList;
import java.util.Stack;

public class MoteurRPN extends Interpreteur{
	
	private ArrayList<Integer> listOperande;
	private ArrayList<String> _undo=new ArrayList<String>();
	private String dernierSaisie;
	public MoteurRPN() 
	{
		listOperande = new ArrayList<Integer>();
		
	}
	
	public void enregistrerOprnd() 
	{
		listOperande.add(Integer.parseInt(dernierSaisie));
		String x="";
		x+=listOperande.get(0);
		for(int i=1;i<listOperande.size();i++)
		{
			x+=" "+listOperande.get(i);
		}
		_undo.add(x);
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
	
	public ArrayList<String> getStackUndo()
	{
		return this._undo;
	}
	
	public ArrayList<Integer> stringToArrayInteger(String s)
	{
		ArrayList<Integer>a=new ArrayList<Integer>();
		String [] nombre =s.split(" ");
		for(int i=0;i<nombre.length;i++)
		{
			listOperande.add(Integer.parseInt(nombre[i].toString()));
		}
		return new ArrayList<Integer>();
	}
	
	
}