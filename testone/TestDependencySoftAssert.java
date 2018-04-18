package by.htp.testng.testone;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestDependencySoftAssert {
	
	@Test(enabled = true)
	public void test1(){
		
		int x = 3;
		int y = 3;
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(x, 2,"2 is not 2");
		sa.assertEquals(y, 3,"2 is not 2");
		
		int result = x + y;
		sa.assertEquals(result, 5, "x + y != x+y");
		sa.assertAll();
	}
	
	
	@Test(enabled = false)
	public void test2(){
		
		int x = 3;
		int y = 3;		
		
		assertEquals(x, 2,"2 is not 2");
		assertEquals(y, 3,"2 is not 2");
		
		int result = x + y;
		assertEquals(result, 5, "x + y != x+y");
		
	}
	
	
}
