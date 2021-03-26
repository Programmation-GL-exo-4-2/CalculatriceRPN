package UVSQ.ProgrammationGLExo4point2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoteurRPNTest {

	@Test
	public void test() {
		MoteurRPN m = new MoteurRPN();
		assertNotEquals(null, m.getListOperande());
	}
	
	@Test
	public void testEnregistrerOprnd()
	{
		MoteurRPN rpn=new MoteurRPN();
		rpn.getEnsembleOpnd().add(5);
		int x=rpn.getListOperande().get(0);
		assertEquals(5,x);
		
	}

}
