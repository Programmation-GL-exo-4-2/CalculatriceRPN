package UVSQ.ProgrammationGLExo4point2;

public class CommandClass extends AbstractCommandClass{
	public MoteurRPN getRpn() 
	{
		return (MoteurRPN)this.getInter();
	}
	
	public void setRpn(MoteurRPN rpn) 
	{
		this.setInter(rpn);
	}

}
