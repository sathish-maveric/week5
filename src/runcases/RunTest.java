package runcases;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import TestCases.Case1;
import TestCases.Case2;

public class RunTest {

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "./Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		Case1 ticketBooking = new Case1(driver);
		Case2 hotelBooking = new Case2(driver);

		ticketBooking.flightticket();
		hotelBooking.resortbooking();
		
		driver.quit();
		
		

	}
}

