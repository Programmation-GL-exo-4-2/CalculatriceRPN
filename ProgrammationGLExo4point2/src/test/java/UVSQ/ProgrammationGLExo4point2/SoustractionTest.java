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
	
	@Test 
	public void testExecuteSoustraction()
	{
		MoteurRPN rpn = new MoteurRPN();
		Soustraction s =new Soustraction(rpn);
		s.getRpn().setSaisie("3");
		s.getRpn().enregistrerOprnd();
		s.getRpn().setSaisie("2");
		s.getRpn().enregistrerOprnd();
		s.getRpn().setSaisie("-");
		s.execute();
		int x=rpn.getListOperande().get(0);
		assertEquals(x,1);
	}
	
	@Test 
	public void testUndoSoustraction()
	{
		MoteurRPN rpn = new MoteurRPN();
		Division d =new Division(rpn);
		d.getRpn().setSaisie("3");
		d.getRpn().enregistrerOprnd();
		d.getRpn().setSaisie("2");
		d.getRpn().enregistrerOprnd();
		d.getRpn().setSaisie("-");
		d.execute();
		d.undo();
		assertEquals(d.getRpn().toString(),"3 2");
	}


}
