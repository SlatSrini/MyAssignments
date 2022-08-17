package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		// Opening Web Browser using Driver
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		// Selecting WebElements & Performing Actions
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Srinivasan");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("(//a[text()='Srinivasan'])[1]")).click();
		
		String actual_title = driver.getTitle();
		String expected_title = "View Lead | opentaps CRM";
		
		if(actual_title.equals(expected_title))
		{
			System.out.println("Title Verifed Sucessfully!!!");
		}
		else
		{
			System.out.println("Title Not Verifed Sucessfully!!!");
		}
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("2D Entertainment");
		
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		
		String com_name = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(com_name.contains("2D Entertainment"))
		{
			System.out.println("Confirmed!!!");
		}
		else
		{
			System.out.println("Not Confirmed!!!");
		}
		
		driver.close();

	}

}
