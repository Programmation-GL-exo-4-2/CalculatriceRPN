package UVSQ.ProgrammationGLExo4point2;

public class Addition extends CommandClass implements Command {

	public Addition(MoteurRPN rpn)
	{
		this.setInter(rpn);
	}
	
	
	public void execute() {
		this.getRpn().operationOprnd();
	}

}
