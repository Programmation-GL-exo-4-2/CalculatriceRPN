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
		rpn.setSaisie("5");
		rpn.enregistrerOprnd();
		int x=rpn.getListOperande().get(0);
		assertEquals(5,x);
		
	}
	
	@Test
	public void testOperationOprndAdd()
	{
		MoteurRPN rpn=new MoteurRPN();
		rpn.setSaisie("1");
		rpn.enregistrerOprnd();
		rpn.setSaisie("2");
		rpn.enregistrerOprnd();
		rpn.setSaisie("+");
		rpn.operationOprnd();
		int x=0;
		if(!rpn.getListOperande().isEmpty())
			x=rpn.getListOperande().get(0);
		assertEquals(3,x);
		
	}
	
	@Test
	
	public void testOperationOprndSub()
	{
		MoteurRPN rpn=new MoteurRPN();
		rpn.setSaisie("3");
		rpn.enregistrerOprnd();
		rpn.setSaisie("2");
		rpn.enregistrerOprnd();
		rpn.setSaisie("-");
		rpn.operationOprnd();
		int x=0;
		if(!rpn.getListOperande().isEmpty())
			x=rpn.getListOperande().get(0);
		assertEquals(1,x);
		
	}
	
	@Test
	public void testOperationOprndMult()
	{
		MoteurRPN rpn=new MoteurRPN();
		rpn.setSaisie("3");
		rpn.enregistrerOprnd();
		rpn.setSaisie("2");
		rpn.enregistrerOprnd();
		rpn.setSaisie("*");
		rpn.operationOprnd();
		int x=0;
		if(!rpn.getListOperande().isEmpty())
			x=rpn.getListOperande().get(0);
		assertEquals(6,x);
		
	}
	
	@Test
	public void testOperationOprndDiv()
	{
		MoteurRPN rpn=new MoteurRPN();
		rpn.setSaisie("4");
		rpn.enregistrerOprnd();
		rpn.setSaisie("8");
		rpn.enregistrerOprnd();
		rpn.setSaisie("+");
		rpn.operationOprnd();
		int x=0;
		if(!rpn.getListOperande().isEmpty())
			x=rpn.getListOperande().get(0);
		assertEquals(2,x);
		
	}

}
