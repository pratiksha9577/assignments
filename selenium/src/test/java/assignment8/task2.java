package assignment8;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task2 {

	public static void main(String[] args) {
		String url;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> Alllinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']//li//a"));
		for(WebElement link :Alllinks)
		{
			System.out.println(" All the link text from footer is "+link.getText());
		}
		for (int i = 0; i < Alllinks.size(); i++) {
		url=	Alllinks.get(i).getText();
		
		if(url.contains("Create Page")) {
			driver.findElement(By.linkText("Create Page")).click();
			break;
		}
	}
driver.close();
}
}