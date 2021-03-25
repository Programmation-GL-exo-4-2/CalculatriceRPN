package UVSQ.ProgrammationGLExo4point2;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuitTest {

	@Test
	public void testConstructeur() {
		Interpreteur I = new Interpreteur();
		Quit q = new Quit(I);
		assertEquals(I,q.getInter());
	}

}
