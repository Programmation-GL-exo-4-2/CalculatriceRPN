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

}
