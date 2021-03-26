package UVSQ.ProgrammationGLExo4point2;

import static org.junit.Assert.*;

import org.junit.Test;

public class EnregistrerOprndTest {

	@Test
	public void testConstructeurEng() 
	{
		MoteurRPN rpn = new MoteurRPN();
		Addition command = new Addition(rpn);
		assertEquals(command.getInter(),rpn);
	}

}
