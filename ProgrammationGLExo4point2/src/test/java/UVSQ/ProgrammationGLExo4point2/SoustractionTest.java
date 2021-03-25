package UVSQ.ProgrammationGLExo4point2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SoustractionTest {

	@Test
	public void testConstructeurSoustraction()
	{
		MoteurRPN rpn = new MoteurRPN();
		Soustraction command = new Soustraction(rpn);
		assertEquals(command.getInter(),rpn);
	}

}
