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
	
	@Test 
	public void testExecuteDivision()
	{
		MoteurRPN rpn = new MoteurRPN();
		Division d =new Division(rpn);
		d.getRpn().setSaisie("4");
		d.getRpn().enregistrerOprnd();
		d.getRpn().setSaisie("2");
		d.getRpn().enregistrerOprnd();
		d.getRpn().setSaisie("/");
		d.execute();
		int x=rpn.getListOperande().get(0);
		assertEquals(x,2);
	}
	
	@Test 
	public void testUndoDivision()
	{
		MoteurRPN rpn = new MoteurRPN();
		Division d =new Division(rpn);
		d.getRpn().setSaisie("4");
		d.getRpn().enregistrerOprnd();
		d.getRpn().setSaisie("2");
		d.getRpn().enregistrerOprnd();
		d.getRpn().setSaisie("/");
		d.execute();
		d.undo();
		assertEquals(d.getRpn().toString(),"4 2");
	}

}
