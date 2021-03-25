package UVSQ.ProgrammationGLExo4point2;

import static org.junit.Assert.*;

import org.junit.Test;

public class UndoTest {

	@Test
	public void testConstructeur() {
		Interpreteur I = new Interpreteur();
		Undo u = new Undo(I);
		assertEquals(I,u.getInter());
	}

}
