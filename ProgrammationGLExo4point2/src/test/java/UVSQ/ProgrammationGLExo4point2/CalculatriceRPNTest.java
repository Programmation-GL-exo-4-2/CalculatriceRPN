package UVSQ.ProgrammationGLExo4point2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatriceRPNTest {

	@Test
	public void test() {
		CalculatriceRPN c= new CalculatriceRPN();
		c.getSaisieRPN().evaluerSaisie("5");
		c.getSaisieRPN().evaluerSaisie("7");
		c.getSaisieRPN().evaluerSaisie("+");
		assertEquals(c.getSaisieRPN().getMoteur().toString(),"12");
		c.getSaisieRPN().evaluerSaisie("16");
		c.getSaisieRPN().evaluerSaisie("-");
		assertEquals(c.getSaisieRPN().getMoteur().toString(),"-4");
		c.getSaisieRPN().evaluerSaisie("3");
		c.getSaisieRPN().evaluerSaisie("*");
		assertEquals(c.getSaisieRPN().getMoteur().toString(),"-12");
		c.getSaisieRPN().evaluerSaisie("6");
		c.getSaisieRPN().evaluerSaisie("/");
		assertEquals(c.getSaisieRPN().getMoteur().toString(),"-2");
		c.u.execute();
		assertEquals(c.getSaisieRPN().getMoteur().toString(),"-12 6");
		c.u.execute();
		assertEquals(c.getSaisieRPN().getMoteur().toString(),"-12");
	}
	
	@Test
	public void testMain() {
		CalculatriceRPN c= new CalculatriceRPN();
		c.main();
		
	}

}
