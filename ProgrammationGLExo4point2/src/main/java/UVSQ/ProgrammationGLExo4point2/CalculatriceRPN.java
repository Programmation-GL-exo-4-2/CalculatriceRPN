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
	public static void main()
	{
		System.out.println("===========================CalculatriceRPN=====================");
		while(true)
		{
			String chaine = saisie.saisir();
			if(chaine=="exit")
			{
				System.out.println("Je suis dans exite");
				q.execute();
			}
				
			else if(chaine=="undo")
				u.execute();
			else 
				saisie.evaluerSaisie(chaine);
			System.out.println(chaine);
		}
		
			
	}
	
	
	

}
