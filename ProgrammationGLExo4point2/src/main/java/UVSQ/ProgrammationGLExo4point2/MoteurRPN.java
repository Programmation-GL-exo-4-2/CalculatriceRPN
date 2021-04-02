package UVSQ.ProgrammationGLExo4point2;

import java.util.ArrayList;
import java.util.Stack;

public class MoteurRPN extends Interpreteur{
	
	private ArrayList<Integer> listOperande;
	private ArrayList<String> _undo=new ArrayList<String>();
	private String dernierSaisie;
<<<<<<< HEAD
||||||| 1ea3cd9
	//constructeur
=======
	private Stack<Integer> _undo=new Stack<Integer>();
	//constructeur
>>>>>>> main
	public MoteurRPN() 
	{
		listOperande = new ArrayList<Integer>();
		
	}
	
	public void enregistrerOprnd() 
	{
		listOperande.add(Integer.parseInt(dernierSaisie));
<<<<<<< HEAD
		String x="";
		x+=listOperande.get(0);
		for(int i=1;i<listOperande.size();i++)
		{
			x+=" "+listOperande.get(i);
		}
		_undo.add(x);
||||||| 1ea3cd9
=======
		this._undo.push(Integer.parseInt(dernierSaisie));
	}
	public void enregistrerOprndUndo() 
	{
		
		listOperande.add(Integer.parseInt(dernierSaisie));
>>>>>>> main
	}
	
	public void supprimerOprnd()
	{
		int lastx=listOperande.size()-1;
		listOperande.remove(lastx);
		this._undo.pop();
	};
	
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
<<<<<<< HEAD
			String x="";
			x+=listOperande.get(0);
			for(int i=1;i<listOperande.size();i++)
			{
				x+=" "+listOperande.get(i);
			}
			_undo.add(x);
||||||| 1ea3cd9
=======
			this._undo.push(rsult);
			
			
	}
	
	public void operationOprndUndo()
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
			
>>>>>>> main
			
	}
	public ArrayList<Integer> getEnsembleOpnd()
	{
		
		//Pour l'instant rien, à developper
		return null;
	}

	public ArrayList<Integer> getListOperande() {
		return listOperande;
	}
	public Stack<Integer> getUndo()
	{
		return this._undo;
	}
 
	public void setListOperande(ArrayList<Integer> listOperande) {
		this.listOperande.removeAll(this.listOperande);
		for(int i=0;i<listOperande.size();i++)
		{
			this.listOperande.add(listOperande.get(i));
		}
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
	
	public void removeStackUndoLastI()
	{
		this._undo.remove(this._undo.size()-1);
	}
	
	public ArrayList<Integer> stringToArrayInteger(String s)
	{
		ArrayList<Integer>a=new ArrayList<Integer>();
		String [] nombre =s.split(" ");
		for(int i=0;i<nombre.length;i++)
		{
			a.add(Integer.parseInt(nombre[i].toString()));
		}
		return a;
	}
	
	public void annuler()
	{
		this.removeStackUndoLastI();
		int lastI=this.getStackUndo().size()-1;
		String x=this.getStackUndo().get(lastI);
		ArrayList<Integer> a=this.stringToArrayInteger(x);
		this.setListOperande(a);
	}
	
	
}