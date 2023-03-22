package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Mmtriptesting {
	@Test
	public void validateCase1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Case1 ticketBooking = new Case1(driver);
		ticketBooking.flightticket();
		driver.quit();
		 
	}
	
    @Test	
	public void validateCase2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Case2 hotelBooking = new Case2(driver);
		hotelBooking.resortbooking();
		driver.quit();		
}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Test NG has Started");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Test NG has Ended");
	
	}

}
