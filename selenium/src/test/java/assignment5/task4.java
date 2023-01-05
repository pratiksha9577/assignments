package assignment5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		   List<WebElement> elements = driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[contains(@target,'_blank')]"));
		   HashMap<String,String> map=new HashMap<String,String>(); 
		   
		 
		       map.put("Linkedin",elements.get(0).getAttribute("href"));  
			   map.put("FaceBook",elements.get(1).getAttribute("href")); 
			   map.put("Twitter",elements.get(2).getAttribute("href"));  
			   map.put("Youtube",elements.get(3).getAttribute("href"));  

			   for(Map.Entry<String, String> m:map.entrySet()){    
			       System.out.println(m.getKey()+" "+m.getValue());    
			      }  
			   
		 
		 
	}

}
