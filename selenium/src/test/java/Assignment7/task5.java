package Assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task5 {
	WebDriver driver;

	public static void main(String[] args) {
       task5.chromeexecution();
		task5.firefoxexecution();
		task5.edgebrowser();
	}

	public static void chromeexecution() {
		System.out.println("First task executed on chrome");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		String username = element.getCssValue("border");
		System.out.println("print true when order is 1px" + username.contains("1px"));

		WebElement element2 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		String password = element2.getCssValue("border");
		System.out.println("print true when order is 1px" + password.contains("1px"));
		driver.close();

		System.out.println("second task executed on chrome");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		boolean value = driver.findElement(By.xpath(
				"//span[@class='oxd-text oxd-text--span oxd-input-field-" + "error-message oxd-input-group__message']"))
				.isDisplayed();
		System.out.println("Print true when required field is display for password" + value);
		driver.close();

		System.out.println("Third task executed on chrome");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("mukesh");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String message = driver.findElement(By.xpath("//div[@role='alert']")).getText();
		System.out.println(
				"print true if message contains Invalid credentials" + message.contains("Invalid credentials"));
		driver.close();

		System.out.println("Fourth task executed on chrome");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String url = driver.getCurrentUrl();
		System.out.println("Print true if url contains dashboard:" + url.contains("dashboard"));
		driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		driver.close();
	}
	public static void firefoxexecution() {
		System.out.println("First task executed on firefox");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		String username = element.getCssValue("border");
		System.out.println("print true when order is 1px" + username.contains("1px"));

		WebElement element2 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		String password = element2.getCssValue("border");
		System.out.println("print true when order is 1px" + password.contains("1px"));
		driver.close();

		System.out.println("second task executed on firefox");
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		boolean value = driver.findElement(By.xpath(
				"//span[@class='oxd-text oxd-text--span oxd-input-field-" + "error-message oxd-input-group__message']"))
				.isDisplayed();
		System.out.println("Print true when required field is display for password" + value);
		driver.close();

		System.out.println("Third task executed on firefox");
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("mukesh");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String message = driver.findElement(By.xpath("//div[@role='alert']")).getText();
		System.out.println(
				"print true if message contains Invalid credentials" + message.contains("Invalid credentials"));
		driver.close();

		System.out.println("Fourth task executed on firefox");
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String url = driver.getCurrentUrl();
		System.out.println("Print true if url contains dashboard:" + url.contains("dashboard"));
		driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		driver.close();
	}
	public static void edgebrowser() 
	{
		System.out.println("First task executed on edgebrowser");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		String username = element.getCssValue("border");
		System.out.println("print true when order is 1px" + username.contains("1px"));

		WebElement element2 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		String password = element2.getCssValue("border");
		System.out.println("print true when order is 1px" + password.contains("1px"));
		driver.close();

		System.out.println("second task executed on Edgebrowser");
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		boolean value = driver.findElement(By.xpath(
				"//span[@class='oxd-text oxd-text--span oxd-input-field-" + "error-message oxd-input-group__message']"))
				.isDisplayed();
		System.out.println("Print true when required field is display for password" + value);
		driver.close();

		System.out.println("Third task executed on Edgebrowser");
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("mukesh");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String message = driver.findElement(By.xpath("//div[@role='alert']")).getText();
		System.out.println(
				"print true if message contains Invalid credentials" + message.contains("Invalid credentials"));
		driver.close();

		System.out.println("Fourth task executed on edgebrowser");
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String url = driver.getCurrentUrl();
		System.out.println("Print true if url contains dashboard:" + url.contains("dashboard"));
		driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		driver.close();
}
}
