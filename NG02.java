package tng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NG02 {
	
  @Test(groups  = {"add to cart"} , priority = 2)
  public void add() {
	  System.out.println("add to cart");
  }
  @Test (groups = {"open the url"} , priority = 1)
  public void beforeMethod() {
	  System.out.println("open the url");
  }

  @Test (groups = {"payment done"} , priority = 3)
  public void afterMethod() {
	  System.out.println("payment succesfully done");
  }

}
