package UVSQ.ProgrammationGLExo4point2;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {

	@Test
	public void testConstructeurDivision() {
		MoteurRPN rpn = new MoteurRPN();
		Division command = new Division(rpn);
		assertEquals(command.getInter(),rpn);
	}
	
	@Test 
	public void testExecuteDivision()
	{
		MoteurRPN rpn = new MoteurRPN();
		Division d =new Division(rpn);
		rpn.enregistrerOprnd(4);
		rpn.enregistrerOprnd(2);
		d.execute();
		int x=rpn.getListOperande().get(0);
		assertEquals(x,2);
	}

}
