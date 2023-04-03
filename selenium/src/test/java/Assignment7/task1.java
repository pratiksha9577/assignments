package Assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		String username= element.getCssValue("border");
		System.out.println("print true when order is 1px"+username.contains("1px"));
		
		WebElement element2=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		String password= element2.getCssValue("border");
		System.out.println("print true when order is 1px"+password.contains("1px"));
		driver.close();
		System.out.println("print true when order is 1px");
		System.out.println("print true when order is 1px");
	}

}
