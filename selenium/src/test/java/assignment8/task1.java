package assignment8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String msg = driver.findElement(By.xpath("(//h2[contains(text(),'Facebook helps you connect and share with the peop')])[1]")).getText();
		System.out.println("Print true if text is correct: "+msg.contains("Facebook helps you connect and share with the people in your life"));
	}

}
