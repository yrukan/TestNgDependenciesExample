package by.htp.testng.testthree;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestThree {
  @Test(groups={ "Smoke1" })
  public void test3() {
	  assertTrue(false, "test 3 not true");
  }
}
