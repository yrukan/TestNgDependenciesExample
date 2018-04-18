package by.htp.testng.testone;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestDependency {
	private SoftAssert sa;
	
	@BeforeClass
	public void initData(){
		sa = new SoftAssert();
	}
	
  @Test(dependsOnMethods={"test2", "test3"})
  public void test1() {
	  System.out.println("test 1");	  
	  sa.assertTrue(true, "test 1 not true");
  }
  
  @Test(groups={ "smoke.positive" })
  public void test2() {
	  System.out.println("test 2");
	  sa.assertTrue(true, "test 2 not true");
  }
  
  @Test(groups={ "smoke.negative" })
  public void test3() {
	  System.out.println("test 3");
	  sa.assertTrue(false, "test 3 not true");
  }
  
  @AfterClass
  public void confirmTestResult(){
	  sa.assertAll();
  }
}
