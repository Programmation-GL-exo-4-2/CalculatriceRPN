package UVSQ.ProgrammationGLExo4point2;

public class Addition extends CommandClass implements Command {

	public Addition(MoteurRPN rpn)
	{
		this.setInter(rpn);
	}
	
	
	public void execute() 
	{
		this.getRpn().operationOprnd();
	}


	public void undo() 
	{
		int lastIndex=this.getRpn().getListOperande().size()-1;
		this.getRpn().getListOperande().remove(lastIndex);
		String saisie;
		this.getRpn().getUndo().pop();//supp le résult au sommet de la pile
		int x=this.getRpn().getUndo().pop();
		saisie=Integer.toString(this.getRpn().getUndo().peek());
		this.getRpn().setSaisie(saisie);
		this.getRpn().enregistrerOprndUndo();
		this.getRpn().setSaisie(Integer.toString(x));
		this.getRpn().enregistrerOprndUndo();
		
	}

}
