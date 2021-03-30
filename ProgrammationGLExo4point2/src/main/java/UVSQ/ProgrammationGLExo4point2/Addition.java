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
		this.getRpn().removeStackUndoLastI();
		int lastI=this.getRpn().getStackUndo().size()-1;
		String x=this.getRpn().getStackUndo().get(lastI);
		ArrayList<Integer> a=this.getRpn().stringToArrayInteger(x);
		System.out.println(a.toString());
		this.getRpn().setListOperande(a);
		
	}

}
