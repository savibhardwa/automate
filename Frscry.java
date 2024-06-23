package tng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Frscry {
	WebDriver  driver;
  @Test
  public void Homepage() {
	  	    driver.manage().window().maximize();
		
  }
  @Test
  public void Creat() {
	  driver.findElement(By.xpath("//a[normalize-space()='Create Account']")).click();
  }
  @Test
  public void Signup() {
	  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("savita");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("bhardwaj");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("savitab0973@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("2511");
		driver.findElement(By.xpath("//input[@name='confirmpassword']")).sendKeys("2511");
		driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("savib@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("2511");
    driver.findElement(By.xpath("//button[normalize-space()='SIGN IN']")).click();
  }
  @BeforeClass
  
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\savit\\eclipse-workspace\\firstcry\\driver\\chromedriver.exe" );
	   driver = new ChromeDriver();
	  driver.get("https://firstcrystore.in");
  }

  @AfterClass
  public void afterClass() {
	driver.close();
  }

}
