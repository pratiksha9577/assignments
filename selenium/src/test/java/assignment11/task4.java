package assignment11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task4 {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Show me']")).click();
		helper.waitforelement( By.xpath("//input[@id='passnew']"), 1000);
		
		}
	}


