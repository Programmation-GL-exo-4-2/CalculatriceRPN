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
		rpn.enregistrerOprnd(1);
		rpn.enregistrerOprnd(2);
		a.execute();
		int x=rpn.getListOperande().get(0);
		assertEquals(x,3);
	}

}
