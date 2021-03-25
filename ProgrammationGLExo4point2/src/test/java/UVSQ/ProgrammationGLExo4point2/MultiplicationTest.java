package UVSQ.ProgrammationGLExo4point2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicationTest {

	@Test
	public void testConstructeurMultiplication() {
		MoteurRPN rpn = new MoteurRPN();
		Multiplication command = new Multiplication(rpn);
		assertEquals(command.getInter(),rpn);
	}

}
