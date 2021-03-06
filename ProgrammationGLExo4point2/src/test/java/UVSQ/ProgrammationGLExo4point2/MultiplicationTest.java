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
		m.getRpn().setSaisie("3");
		m.getRpn().enregistrerOprnd();
		m.getRpn().setSaisie("2");
		m.getRpn().enregistrerOprnd();
		m.getRpn().setSaisie("*");
		m.execute();
		int x=rpn.getListOperande().get(0);
		assertEquals(x,6);
	}
	
	@Test 
	public void testUndoMultiplication()
	{
		MoteurRPN rpn = new MoteurRPN();
		Multiplication m =new Multiplication(rpn);
		m.getRpn().setSaisie("3");
		m.getRpn().enregistrerOprnd();
		m.getRpn().setSaisie("2");
		m.getRpn().enregistrerOprnd();
		m.getRpn().setSaisie("*");
		m.execute();
		m.undo();
		assertEquals("3 2",m.getRpn().toString());
	}

}
