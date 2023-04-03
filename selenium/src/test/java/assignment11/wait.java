package assignment11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wait {
	static WebDriverWait wait;
	static boolean value;
	static WebDriver driver ;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.findElement(By.id("email1")).sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.name("password1")).sendKeys("ineuron");
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		wait = helper.Wait(driver, 1000);
		value = helper.verifytexturl("https://ineuron-courses.vercel.app/");
		System.out.println(value);
		String originalTitle = driver.getCurrentUrl();
		System.out.println(originalTitle);
		driver.quit();
	}

}
