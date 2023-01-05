package assignment5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		String tittle = driver.getTitle();
		System.out.println(url);
		System.out.println("Return true when url ends with login : "+url.endsWith("login"));
		System.out.println("Return true when url contains demo : "+url.contains("demo"));
		System.out.println("Return true tittle contains HRM  : "+tittle.contains("HRM"));
	}

}
