package week4.day7;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		// Switching to Main Window
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		
		//Login
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Password#123");
		driver.findElement(By.id("Login")).click();
		
		//SwitchingWindow
		driver.findElement(By.xpath("//span[text()='Learn More']//parent::button")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		ArrayList<String> list1 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(list1.get(2));
		
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		System.out.println("Title of the Page : "+driver.getTitle());
		
		//Swithching to parent window
		driver.switchTo().window(list1.get(1));
		
		System.out.println("All Test Passed Sucessfully!!");
		
		Thread.sleep(2000);
		
		driver.quit();
				
	}

}
