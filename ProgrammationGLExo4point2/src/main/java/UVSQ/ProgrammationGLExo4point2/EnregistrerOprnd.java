package UVSQ.ProgrammationGLExo4point2;

public class EnregistrerOprnd extends AbstractCommandClass implements Command {

	public EnregistrerOprnd(MoteurRPN rpn)
	{
		this.setInter(rpn);
	}
	
	public MoteurRPN getRpn() {
		return (MoteurRPN)this.getInter();
	}
	public void execute() 
	{
		this.getRpn().enregistrerOprnd();
	}

}
