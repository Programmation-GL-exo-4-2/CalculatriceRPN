package UVSQ.ProgrammationGLExo4point2;

public class Multiplication extends CommandClass implements Command{
	
	public Multiplication(MoteurRPN rpn)
	{
		this.setInter(rpn);
	}
	public void execute() {
		this.getRpn().operationOprnd();
	}
	public void undo() 
	{	
		this.getRpn().annuler();
	}


}
