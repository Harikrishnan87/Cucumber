package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Implementation {
	
	public WebDriver driver;
	
	
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		driver = new FirefoxDriver();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		System.out.println("home");
			    
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		
		 driver.get("http://downloads.smartbear.com/samples/TestComplete10/WebOrders/Login.aspx?");
			
		 System.out.println("login");
	    
	}

	@When("^User enters UserName and Password$")
		public void user_enters_UserName_and_Password() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id='ctl00_MainContent_username']")).sendKeys("Tester");
		driver.findElement(By.xpath("//*[@id='ctl00_MainContent_password']")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']")).click();
			        
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id='aspnetForm']/table/tbody/tr/td[2]/div[1]")).isDisplayed();
		System.out.println("Login Successfully");
		Thread.sleep(3000);
	    
	    
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		
		Thread.sleep(10000);
		 driver.findElement(By.xpath(".//*[@id='ctl00_logout']")).click();
	    
		
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		
		System.out.println("LogOut Successfully");
		driver.quit();
	   
	    
	}



}
