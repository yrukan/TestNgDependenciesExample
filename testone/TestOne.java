package by.htp.testng.testone;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestOne {
	
  @Test(groups={ "Smoke1" })
  public void test1() {
	  assertTrue(false, "test 1 not true");
  }
  
  @Test(groups={ "Smoke1" })
  public void test2() {
	  assertTrue(false, "test 2 not true");
  }
  
  @Test(groups={ "Smoke3" })
  public void test3() {
	  assertTrue(false, "test 3 not true");
  }
}
