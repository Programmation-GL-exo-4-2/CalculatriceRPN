package UVSQ.ProgrammationGLExo4point2;

public class CalculatriceRPN {
	private static SaisieRPN saisie;
	static Quit q;
	static Undo u;
	
	public CalculatriceRPN()
	{
		saisie = new SaisieRPN();
		u=new Undo(saisie);
	}
	public SaisieRPN getSaisieRPN()
	{
		return saisie;
	}
	public void main()
	{
		System.out.println("===========================CalculatriceRPN=====================");
		while(true)
		{
			String chaine = saisie.saisir();
			String exit="exit";
			String undo="undo";
			if(chaine.equals(exit))
			{
				System.out.println("Exit...");
				q.execute();
			}
				
			else if(chaine.equals(undo))
			{
				if(!saisie.pileUndoVide())
					u.execute();
				else 
					System.out.println("La pile des commands est vide!");
			}
				
			else 
				saisie.evaluerSaisie(chaine);
			System.out.println(chaine);
			System.out.print("Pile : ");
			System.out.println(saisie.getMoteur().toString());
		}
		
			
	}
	
	
	

}
