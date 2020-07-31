package FactoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomeWebstore {
	
	WebDriver driver;
	LUAPage login; 

	@FindBy(xpath = "//a[@class='nav-link btn btn-sm']")
	WebElement ingresarBtn;

	@FindBy(xpath = "//div[@class='owl-item active']//a[@id='btnArmarCombo']")
	WebElement comprar;

	@FindBy(xpath = "//span[@class='ico logout']")
	WebElement logoutIcon;

	@FindBy(xpath = "//div[@class='owl-item active']//a[@id='btnCanjearPromo']")
	WebElement btnCanjearPromo;

	public HomeWebstore(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickIngresar() {
		ingresarBtn.click();
	}

	public void clickComprar() {
		comprar.click();
	}

	public void clickCanje() {		
		btnCanjearPromo.click();
	}

	public void logoutIsDispalyed() throws Exception {
		login=new LUAPage(driver);
		try {
			logoutIcon.isDisplayed();
			System.out.println("Usuario logged");
		} catch (Exception e) {
			
			System.out.println("No quedo logueado el usuario");
			login.hiddenAlert();									
		}		
		
	}

}
