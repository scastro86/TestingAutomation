package FactoryPages;

import static org.junit.Assert.assertFalse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LUAPage {
	
WebDriver driver;
	
	@FindBy(id = "username")
	WebElement txt_username;
	
	@FindBy(id = "password")
	WebElement txt_password;
	
	@FindBy(name = "submit")
	WebElement btn_ingresar;
	
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	public WebElement alerta;
	
	
	public LUAPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickOnBtnIngresar() {
		btn_ingresar.click();
				
		}
	public boolean hiddenAlert() {
		assertFalse("Credenciales incorrectas", alerta.isDisplayed());
		
		return true;				
		
	}

}
