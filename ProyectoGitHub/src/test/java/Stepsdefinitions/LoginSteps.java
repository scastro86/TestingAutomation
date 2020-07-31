package Stepsdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import FactoryPages.HomeWebstore;
import FactoryPages.LUAPage;
import io.cucumber.java.en.*;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver=null;
	LUAPage login;
	HomeWebstore home;
	
	@Given("browser is open")
	public void browser_is_open() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/61625336/git/TestingAutomation/ProyectoGitHub/src/test/resources/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

	}

	@And("user is on Webstore homepage")
	public void user_is_on_webstore_homepage() {
		
		driver.navigate().to("https://tienda-test.sva.antel.com.uy");
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@When("user clicks on button ingresar")
	public void user_clicks_on_button_ingresar() {
	    
		home = new HomeWebstore(driver);
		home.clickIngresar();
	}

	@And("enters username and password")
	public void enters_username_and_password() {
	    
		login=new LUAPage(driver);
		login.enterUsername("adm");
		login.enterPassword("password");
	}

	@And("clicks on button ingresar")
	public void clicks_on_button_ingresar() {
	    
		login.clickOnBtnIngresar();
	}

	@Then("user is logged on webstore homepage")
	public void user_is_logged_on_webstore_homepage() throws Exception {
		
		home.logoutIsDispalyed();
	    
	    driver.close();
	    driver.quit();
	}


}
