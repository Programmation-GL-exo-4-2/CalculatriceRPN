package UVSQ.ProgrammationGLExo4point2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MoteurRPNTest {

	@Test
	public void testConstructeur() {
		MoteurRPN m = new MoteurRPN();
		assertNotEquals(null, m.getListOperande());
	}
	
	@Test
	public void teststringToArrayInteger()
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
	}
	
	
	
	
	/*@Test
	public void testEnregistrerOprnd()
	{
		MoteurRPN rpn=new MoteurRPN();
		rpn.setSaisie("5");
		rpn.enregistrerOprnd();
		System.out.println(rpn.getListOperande().toString());
		System.out.println(rpn.getStackUndo().toString());
		rpn.setSaisie("6");
		rpn.enregistrerOprnd();
		System.out.println(rpn.getListOperande().toString());
		System.out.println(rpn.getStackUndo().toString());
		rpn.setSaisie("7");
		rpn.enregistrerOprnd();
		System.out.println(rpn.getListOperande().toString());
		System.out.println(rpn.getStackUndo().toString());
		int x=rpn.getListOperande().get(0);
		assertEquals(5,x);
		assertEquals(rpn.getListOperande(),rpn.getStackUndo().get(0));
		
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
		rpn.setSaisie("8");
		rpn.enregistrerOprnd();
		rpn.setSaisie("4");
		rpn.enregistrerOprnd();
		rpn.setSaisie("/");
		rpn.operationOprnd();
		int x=0;
		if(!rpn.getListOperande().isEmpty())
			x=rpn.getListOperande().get(0);
		assertEquals(2,x);
		
	}
	
	@Test
	public void testToString()
	{
		MoteurRPN rpn=new MoteurRPN();
		rpn.setSaisie("8");
		rpn.enregistrerOprnd();
		rpn.setSaisie("4");
		rpn.enregistrerOprnd();
		System.out.print(rpn.toString());
		assertEquals("8 4",rpn.toString());
	}*/

}
