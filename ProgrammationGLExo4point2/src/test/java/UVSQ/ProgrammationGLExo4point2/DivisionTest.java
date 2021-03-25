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

}
