package assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		boolean value = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println(value);
		if (value) {
			System.out.println("logo is present");
		}

	}
}