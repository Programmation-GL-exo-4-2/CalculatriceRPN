package UVSQ.ProgrammationGLExo4point2;

public class Soustraction extends CommandClass implements Command{

	public Soustraction(MoteurRPN rpn)
	{
		this.setInter(rpn);
	}
	public void execute() {
		this.getRpn().operationOprnd();	
	}
<<<<<<< HEAD
	public void undo() 
	{
		this.getRpn().annuler();
	}
||||||| 1ea3cd9
=======
	public void undo() {
		// TODO Auto-generated method stub
		
	}
>>>>>>> main

}
