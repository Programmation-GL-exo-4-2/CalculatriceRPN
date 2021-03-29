package UVSQ.ProgrammationGLExo4point2;

public class Soustraction extends CommandClass implements Command{

	public Soustraction(MoteurRPN rpn)
	{
		this.setInter(rpn);
	}
	public void execute() {
		this.getRpn().operationOprnd();	
	}
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
