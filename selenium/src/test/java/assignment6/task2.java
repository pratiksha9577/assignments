package assignment6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='oxd-main-menu']//li[@class='oxd-main-menu-item-wrapper']"));
		System.out.println(elements.size());
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']//li[@class='oxd-main-menu-item-wrapper'][1]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("A");
		
		driver.findElement(By.xpath("//div[@role='listbox']//div[@role='option'][2]"));
	
	
		List<WebElement> elements2 = driver.findElements(By.xpath("//div[@role='listbox']//div[@role='option']"));
		
		System.out.println("size of the all suggestions is"+ elements2.size());
		
	//	(//input[@class='oxd-input oxd-input--active'])[2]
	//  //input[@autocomplete='off'][1]
	//  (//*[contains(@class,'oxd-input oxd-input--active')])[2]
	
		
		
		
	}

}
