package assignment11;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class helper {
	static WebDriverWait wait;
	
	public static WebDriverWait Wait(WebDriver driver, int time) {
		 wait = new WebDriverWait(driver, Duration.ofSeconds(time));

		return wait;
	}
	public static boolean verifytext(String element,String text) {
		boolean value=	helper.wait.until(ExpectedConditions.textToBe(By.xpath(element), text));
		return value;
	}
	public static boolean verifytexttobepresent(String element,String text) {
		boolean value=	helper.wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(element), text));
		return value;
	}
	public static boolean verifytexturl(String url) {
		boolean value=	helper.wait.until(ExpectedConditions.urlToBe(url));
		return value;
	}

	public static void waitforelement(By locator, int seconds) {

		for (int i = 0; i <= 20; i++) {
			try {
				WebElement element = task4.driver.findElement(locator);
				boolean value = element.isEnabled();
				element.sendKeys("password");
				if (value == true) {
					System.out.println("Element found ");

					task4.driver.findElement(locator).sendKeys("password");
					break;
				}

			} catch (Exception e) {
				
				System.out.println("element not found yet ");
				waitForSeconds(seconds);
			}
		}
	}
	public static void waitForSeconds(int seconds)
	{
		try 
		{
			Thread.sleep(seconds*1);
		} catch (InterruptedException e) 
		{
		
		}
	}
	public static void captureScreenshotOfWebElement(WebDriver driver,WebElement element)
	{
		File src=	element.getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(src, new File("./screenshots/Screenshot_"+getCurrentTime()+".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
}
	public static String getCurrentTime()
	{
		String date=new SimpleDateFormat("HH:mm:ss_dd_MM_yyyy").format(new Date());
		System.out.print(date);
		return date;
	}
}