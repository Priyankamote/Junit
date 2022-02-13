package Com.accenture.tetcase;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;


class Factorialtest {

	Factorial num;
	 @Before
	 public void setUp() throws Exception {
	 num=new Factorial();}

	 @After
	 public void tearDown() throws Exception {
	 num=null;}

	 @Test
	 public void test() {
	  assertEquals(120,num.fact(5));
	 }

	}

