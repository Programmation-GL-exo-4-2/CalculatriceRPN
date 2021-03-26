package UVSQ.ProgrammationGLExo4point2;

import static org.junit.Assert.*;

import org.junit.Test;

public class EnregistrerOprndTest {

	@Test
	public void testConstructeurEng() 
	{
		MoteurRPN rpn = new MoteurRPN();
		Addition command = new Addition(rpn);
		assertEquals(command.getInter(),rpn);
	}
	
	@Test 
	public void testExecuteEnregistrer()
	{
		MoteurRPN rpn = new MoteurRPN();
		EnregistrerOprnd eng =new EnregistrerOprnd(rpn);
		rpn.setSaisie("1");
		eng.execute();
		int x=0;
		if(!rpn.getListOperande().isEmpty())
			x=rpn.getListOperande().get(0);
		assertEquals(x,1);
	}

}
