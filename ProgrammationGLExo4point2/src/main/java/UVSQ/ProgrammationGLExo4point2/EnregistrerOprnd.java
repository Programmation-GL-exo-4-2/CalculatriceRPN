package UVSQ.ProgrammationGLExo4point2;

public class EnregistrerOprnd extends CommandClass implements Command {

	public EnregistrerOprnd(MoteurRPN rpn)
	{
		this.setInter(rpn);
	}
	
	
	public void execute() 
	{
		this.getRpn().enregistrerOprnd();
	}


	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
