package assignment6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3 {
	static String value ="Admin";
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(value);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']//li[@class='oxd-main-menu-item-wrapper'][1]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Ashwini1");
		driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]")).click();
		driver.findElement(By.xpath(" (//div[@role='option'])[2]")).click();
		
		
		driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]")).click();
		driver.findElement(By.xpath(" (//div[@role='option'])[2]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("A");
		driver.findElement(By.xpath("//div[@role='listbox']//div[2]")).click();
		String selectedvalue=driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).getAttribute("value");
		System.out.println(selectedvalue);
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Pratiksha@12");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Pratiksha@12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String toaster=driver.findElement(By.xpath("//div[@id='oxd-toaster_1']//div[@class='oxd-toast oxd-toast--success oxd-toas"
				+ "t-container--toast oxd-toast-list-enter-active oxd-toast-list-enter-to']")).getText();
		System.out.println("Print true when user save successfully"+ toaster.contains("Success"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Ashwini1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		try {
			driver.findElement(By.xpath("//div[@class='orangehrm-container']//div[@role='cell'][6]//button[@type='button'][1]")).click();
		}
		catch(Exception StaleElementReferenceException ) {
			driver.findElement(By.xpath("//div[@class='orangehrm-container']//div[@role='cell'][6]//button[@type='button'][1]")).click();

			}
		
		driver.findElement(By.xpath("//div[@role='document']//button[normalize-space()='Yes, Delete']")).click();
		String Deletemesg=driver.findElement(By.xpath("//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']//p[contains(normalize-space(),'Successfully Deleted')]")).getText();
		System.out.println("Print true when user deleted successfully"+ Deletemesg.contains("Successfully Deleted"));
	}

} 