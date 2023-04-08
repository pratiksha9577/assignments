package assignment11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1 {
	static WebDriverWait wait;
	static boolean value;
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();
		wait = helper.Wait(driver, 20);
		value = helper.verifytext("//p[@id='demo']", "WebDriver");
		System.out.println(value);
		driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();
		value = helper.verifytexttobepresent("//p[@id='demo']", "WebDriver");
		System.out.println(value);

		System.out.println("git pratiksh");

		System.out.println("git main");

	}
}
