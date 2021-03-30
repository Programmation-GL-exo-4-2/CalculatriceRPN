package UVSQ.ProgrammationGLExo4point2;

import org.junit.Test;

import junit.framework.TestCase;

public class AdditionTest extends TestCase {
	@Test 
	public void testConstructeurAddition()
	{
		MoteurRPN rpn = new MoteurRPN();
		Addition command = new Addition(rpn);
		assertEquals(command.getInter(),rpn);
	}
	
	@Test 
	public void testExecuteAddition()
	{
		MoteurRPN rpn = new MoteurRPN();
		Addition a =new Addition(rpn);
		a.getRpn().setSaisie("1");
		a.getRpn().enregistrerOprnd();
		a.getRpn().setSaisie("2");
		a.getRpn().enregistrerOprnd();
		a.getRpn().setSaisie("+");
		a.execute();
		int x=rpn.getListOperande().get(0);
		assertEquals(x,3);
	}
	
	@Test 
	public void testUndoAddition()
	{
		MoteurRPN rpn = new MoteurRPN();
		Addition a =new Addition(rpn);
		a.getRpn().setSaisie("1");
		a.getRpn().enregistrerOprnd();
		a.getRpn().setSaisie("2");
		a.getRpn().enregistrerOprnd();
		a.getRpn().setSaisie("+");
		a.execute();
		a.undo();
		assertEquals(a.getRpn().toString(),"1 2");
	}

}
