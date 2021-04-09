package UVSQ.ProgrammationGLExo4point2;

public class Undo  implements Command{

	private SaisieRPN saisie;
	
	public Undo(SaisieRPN s)
	{
		saisie = s;
	}
	public void undo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void execute() {
		
		saisie.getPopStack().undo();
	}

}
