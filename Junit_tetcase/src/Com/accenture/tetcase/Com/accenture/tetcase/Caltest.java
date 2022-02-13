package Com.accenture.tetcase;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Caltest {

	

	@Test
	public void test() 
	{
	assertEquals("error in add()",3,Calculator1.add(1,2));
	assertEquals("error in add()",-3,Calculator1.add(-1,-2));
	assertEquals("error in add()",9,Calculator1.add(9,0));
	 }
	     public void caladdFail()
	     {
	  assertEquals("error in add()",0,Calculator1.add(1,2));
	     }
	     public void caltestPass()
	     {
	  assertEquals("error in  sub()",1,Calculator1.add(1,2));
	assertEquals("error in sub()",-1,Calculator1.add(-1,-2));
	assertEquals("error in sub()",0,Calculator1.add(2,1));
	     }
	     public void calsubFail()
	     {
	    assertEquals("error in  add()",0,Calculator1.add(2,1));
	     }
	}




