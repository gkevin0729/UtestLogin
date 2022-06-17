package PakeageTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LogiinPage {

private WebDriver driver;
	
	
	//Locators
	By registerLink = By.linkText("Join Today");
	By username = By.cssSelector("#firstName");
	By lastname = By.cssSelector("#lastName");
	By email = By.cssSelector("#email");
	By month = By.id("birthMonth");
	By day = By.name("birthDay");
	By year = By.name("birthYear");
	By nextButton = By.xpath("//a[. = '\n        Next: Location\n        chevron_right\n      ']");
	By zipCode = By.id("zip");
	By nextButton1 = By.xpath("//span[. = 'Next: Devices']");
	By brand = By.xpath("//div[2]/div[1]/div[2]/div/div/span");
	By device = By.xpath("//div[. = 'Apple']");
	By modelDevice = By.xpath("//span[. = 'Select a Model']");
	By selectdevice = By.xpath("//span[. = '\n                iPhone XS Max\n              ']");
	By OS = By.xpath("//div[2]/div[3]/div[2]/div/div/span");
	By sistemOS = By.xpath("//div[. = 'iOS 15.5']");
	By nextButton2 = By.xpath("//span[. = 'Next: Last Step']");
	By password = By.id("password");
	By confirmPassword = By.id("confirmPassword");
	By checkbox = By.xpath("//div[4]//span");
	By checkbox1 = By.xpath("//div[5]//span[1]");
	By checkbox2 = By.xpath("//div[6]//span[1]");
	By completebutton = By.xpath("//span[. = 'Complete Setup']");
	By pageSingING = By.xpath("//img[@src='assets/images/uTestLogoNavDark.svg']");
	
	@Before
	public void setUpTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://utest.com/");
		
	}

	@After
	public void turnOff () throws Exception {
		if(driver.findElement(pageSingING).isDisplayed()) {
			System.out.println("Usuario Registrado");
		
			
		}
		else {
			System.out.println("No se pudo registrar el usuario");
		}
		
		driver.quit();
	}

	@Test
	public void registerUser() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(registerLink).click();
		Thread.sleep(2000);
		    //data
		    //Page1
			driver.findElement(username).sendKeys("Kevin");
			driver.findElement(lastname).sendKeys("Gonzalez");
			driver.findElement(email).sendKeys("ggggk@gmail.com");
			driver.findElement(month).click();
			(new Select(driver.findElement(month))).selectByValue("number:7");
			driver.findElement(day).click();
			(new Select(driver.findElement(day))).selectByValue("number:18");
			driver.findElement(year).click();
			(new Select(driver.findElement(year))).selectByValue("number:2000");
			driver.findElement(nextButton).click();

			//page 2
			Thread.sleep(1000);
			driver.findElement(zipCode).sendKeys("6484616");
			Thread.sleep(1000);
			driver.findElement(nextButton1).click();
			
			//page3
			driver.findElement(brand).click();
			driver.findElement(device).click();
			Thread.sleep(1000);
			driver.findElement(modelDevice).click();
			Thread.sleep(1000);
			driver.findElement(selectdevice).click();
			Thread.sleep(1000);
			driver.findElement(OS).click();
			driver.findElement(sistemOS).click();
			driver.findElement(nextButton2).click();
			//page 4
			driver.findElement(password).sendKeys("Kevin-14-34");
			driver.findElement(confirmPassword).sendKeys("Kevin-14-34");
			driver.findElement(checkbox).click();
			driver.findElement(checkbox1).click();
			driver.findElement(checkbox2).click();
			driver.findElement(completebutton).click();
			
			
			
			
			
	
		
	
//wichigan	
	}
}
