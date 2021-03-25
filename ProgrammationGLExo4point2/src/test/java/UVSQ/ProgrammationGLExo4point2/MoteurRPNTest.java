package UVSQ.ProgrammationGLExo4point2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoteurRPNTest {

	@Test
	public void test() {
		MoteurRPN m = new MoteurRPN();
		assertNotEquals(null, m.getListOperande());
	}

}
