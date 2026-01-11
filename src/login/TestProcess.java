package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestProcess { // this code to declare the basic:
 

		String webSite = "https://www.saucedemo.com/"; // declare the webSite link to use it
		
		// WebDriver it is an interface in selenium to control the web browser:
		WebDriver driver = new EdgeDriver(); // I choose Edge
		
		// variables to use in login test:
		String username = "standard_user";
		String password = "secret_sauce";
		
		@BeforeTest
		public void webSite() 
		{
			
			driver.get(webSite); // open the WebSite
			
			driver.manage().window().maximize(); // command for maximizing the window 
			
			
			// if u want to navigate for another webSite please use a ( navigate().to(string url) ...etc  )
			// driver.navigate().to("https://www.facebook.com/");
			
			
		}

		@Test
		public void login() // get the "id" of each element by using inspect and point on that
		{
			
			// A WebElement represents any element on a web_page.
			WebElement usernameId = driver.findElement(By.id("user-name")); // find element and store it inside WebElement variable
			usernameId.sendKeys(username); // fill the username input with data
			
			WebElement passwordId = driver.findElement(By.id("password"));
			passwordId.sendKeys(password);//fill the password input with data
			
			WebElement loginBtnId = driver.findElement(By.id("login-button"));
			loginBtnId.click();// click on button to login
			
		}
		
		@AfterTest
		public void afterTesting()
		{
			
			
		}
		
		
	}

	
	

