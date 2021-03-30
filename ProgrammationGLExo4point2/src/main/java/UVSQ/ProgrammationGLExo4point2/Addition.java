package UVSQ.ProgrammationGLExo4point2;

import java.util.ArrayList;

public class Addition extends CommandClass implements Command {

	public Addition(MoteurRPN rpn)
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
