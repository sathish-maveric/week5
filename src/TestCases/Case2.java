package TestCases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Case2 {
	WebDriver driver;

	public Case2(WebDriver driver) {
		this.driver = driver;
	}

	public void resortbooking() throws InterruptedException {

		driver.findElement(By.xpath("//a[@href='https://www.makemytrip.com/hotels/']")).click();
		Thread.sleep(1000);
		// City
		driver.findElement(By.xpath("//span[@data-cy='hotelCityLabel']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Enter city/ Hotel/ Area/ Building')]"))
				.sendKeys("chennai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='Chennai, Tamil Nadu, India']")).click();

		// from and to date selection
		DateFormat dateFormat = new SimpleDateFormat("dd");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		System.out.println(date1);
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[4]"))
				.click();
		Thread.sleep(1000);

		// driver.findElement(By.xpath("//span[text()='Return']")).click();
		DateFormat toDate = new SimpleDateFormat("dd");
		Date Tdate = new Date();
		String date2 = toDate.format(Tdate);
		System.out.println(date2);
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[5]"))
				.click();

		driver.findElement(By.xpath("//button[@data-cy='RoomsGuestsNew_327']")).click();
		driver.findElement(By.xpath("//button[@data-cy='submit']//self::button")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		WebElement resultPage = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Showing Properties in Chennai']")));
		resultPage.click();

		By hResult = By.xpath("//p[text()='Showing Properties in Chennai']");
		String tResult = driver.findElement(hResult).getText();
		System.out.println(tResult + ".......Expected Title ");

	}
}
