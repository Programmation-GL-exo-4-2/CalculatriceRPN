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
	
	@Test 
	public void testExecuteMultiplication()
	{
		MoteurRPN rpn = new MoteurRPN();
		Multiplication m =new Multiplication(rpn);
		rpn.enregistrerOprnd(3);
		rpn.enregistrerOprnd(2);
		m.execute();
		int x=rpn.getListOperande().get(0);
		assertEquals(x,6);
	}

}
