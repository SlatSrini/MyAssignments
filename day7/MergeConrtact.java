package week4.day7;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeConrtact {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		//Loading URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		
		//Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[contains(text(),'Merge')]")).click();
		Thread.sleep(1000);
		
		//Click on Widget of From Contact
		driver.findElement(By.xpath("(//img[(@alt='Lookup')]//parent::a)[1]")).click();
		Thread.sleep(1000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		//System.out.println(windowHandles);
		ArrayList<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(2));
		
		//Click on First Resulting Contact
		driver.findElement(By.xpath("//a[text()='12061']")).click();
		driver.switchTo().window(list.get(1));
		
		//Click on Widget of To Contact
		driver.findElement(By.xpath("(//img[(@alt='Lookup')]//parent::a)[2]")).click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		//System.out.println(windowHandles1);
		ArrayList<String> list1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(list1.get(2));
		
		//Click on Second Resulting Contact
		driver.findElement(By.xpath("//a[text()='12118']")).click();
		driver.switchTo().window(list.get(1));
		
		//Click on Merge button using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		//Accept the Alert
		driver.switchTo().alert().accept();
		
		//Verify the title of the page
		String title = driver.getTitle();
		if(title.contains("View Contact"))
		{
			System.out.println("Title Of the Page Verified");
		}
		else
		{
			System.out.println("Title Of the Page Not Verified");
		}
		

	}

}
