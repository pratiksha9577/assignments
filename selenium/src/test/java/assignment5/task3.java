package assignment5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		   List<WebElement> elements = driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[contains(@target,'_blank')]"));
		   System.out.println("footer present social icon count is :"+elements.size());
	}

}
