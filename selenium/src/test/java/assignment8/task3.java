package assignment8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[normalize-space()='Create New Account'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("pratiksha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("nigade");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Pratiksha@8693");
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(day);
		s.selectByVisibleText("2");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s2 = new Select(month);
		s2.selectByVisibleText("Jul");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s3 = new Select(year);
		s3.selectByVisibleText("1998");
		driver.findElement(By.xpath("(//label[normalize-space()='Female'])[1]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		driver.close();
		
		
	}

}
