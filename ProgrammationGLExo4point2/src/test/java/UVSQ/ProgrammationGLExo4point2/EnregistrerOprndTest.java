package UVSQ.ProgrammationGLExo4point2;

import static org.junit.Assert.*;

import org.junit.Test;

public class EnregistrerOprndTest {

	@Test
	public void testConstructeurEng() 
	{
		MoteurRPN rpn = new MoteurRPN();
		EnregistrerOprnd command = new EnregistrerOprnd(rpn);
		assertEquals(command.getInter(),rpn);
	}
	
	@Test 
	public void testExecuteEnregistrer()
	{
		MoteurRPN rpn = new MoteurRPN();
		EnregistrerOprnd eng =new EnregistrerOprnd(rpn);
		rpn.setSaisie("1");
		eng.execute();
		int x=0;
		if(!eng.getRpn().getListOperande().isEmpty())
			x=eng.getRpn().getListOperande().get(0);
		assertEquals(x,1);
	}
	
	@Test 
	public void testUndoEnregistrer()
	{
		MoteurRPN rpn = new MoteurRPN();
		EnregistrerOprnd eng =new EnregistrerOprnd(rpn);
		rpn.setSaisie("1");
		eng.execute();
		rpn.setSaisie("1");
		eng.execute();
		eng.undo();
		assertEquals(eng.getRpn().toString(),"1");
		
	}
	
	

}
