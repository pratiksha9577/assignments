package assignment6;

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
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("username with xpath ");
		boolean xpathusername1 = driver.findElement(By.xpath("//input[@placeholder='Username']")).isDisplayed();
		System.out.println(xpathusername1);
		boolean xpathusername2 = driver.findElement(By.xpath("//input[@name='username']")).isDisplayed();
		System.out.println(xpathusername2);
		boolean xpathusername3 = driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active'][1]"))
				.isDisplayed();
		System.out.println(xpathusername3);
		System.out.println("username with css selector");
		boolean cssselectoreusername1 = driver.findElement(By.cssSelector("input[placeholder^='User']")).isDisplayed();
		System.out.println(cssselectoreusername1);
		boolean cssselectoreusername2 = driver.findElement(By.cssSelector("input[placeholder=Username]")).isDisplayed();
		System.out.println(cssselectoreusername2);
		boolean cssselectoreusername3 = driver.findElement(By.cssSelector("input[name=username]")).isDisplayed();
	    System.out.println(cssselectoreusername3);
	    
	    System.out.println("password with xpath ");
		boolean xpathpassword1 = driver.findElement(By.xpath("//input[@placeholder='Password']")).isDisplayed();
		System.out.println(xpathpassword1);
		boolean xpathpassword2 = driver.findElement(By.xpath("//input[@name='password']")).isDisplayed();
		System.out.println(xpathpassword2);
		boolean xpathpassword3 = driver.findElement(By.xpath("//input[@type='password']"))
				.isDisplayed();
		System.out.println(xpathpassword3);
		
		System.out.println("password with css selector");
		boolean cssselectorpassword1 = driver.findElement(By.cssSelector("input[placeholder='Password']")).isDisplayed();
		System.out.println(cssselectorpassword1);
		boolean cssselectorpassword2 = driver.findElement(By.cssSelector("input[name='password']")).isDisplayed();
		System.out.println(cssselectorpassword2);
		boolean cssselectorpassword3 = driver.findElement(By.cssSelector("input[type='password']")).isDisplayed();
	    System.out.println(cssselectorpassword3);
	    
	    System.out.println("login button with xpath ");
		boolean xpathloginbutton1 = driver.findElement(By.xpath("//input[@placeholder='Password']")).isDisplayed();
		System.out.println(xpathloginbutton1);
		boolean xpathloginbutton2 = driver.findElement(By.xpath("//input[@name='password']")).isDisplayed();
		System.out.println(xpathloginbutton2);
		boolean xpathloginbutton3 = driver.findElement(By.xpath("//input[@type='password']"))
				.isDisplayed();
		System.out.println(xpathloginbutton3);
		
		System.out.println("loginbutton with css selector");
		boolean cssselectorloginbutton1 = driver.findElement(By.cssSelector("input[placeholder='Password']")).isDisplayed();
		System.out.println(cssselectorloginbutton1);
		boolean cssselectorloginbutton2 = driver.findElement(By.cssSelector("input[name='password']")).isDisplayed();
		System.out.println(cssselectorloginbutton2);
		boolean cssselectorloginbutton3 = driver.findElement(By.cssSelector("input[type='password']")).isDisplayed();
	    System.out.println(cssselectorloginbutton3);
	    
	    
		

	}

}
