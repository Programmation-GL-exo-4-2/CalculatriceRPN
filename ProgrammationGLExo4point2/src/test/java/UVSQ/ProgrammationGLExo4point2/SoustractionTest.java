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

}
