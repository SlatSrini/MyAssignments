package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		// Opening Web Browser using Driver
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		// Selecting WebElements & Performing Actions
		
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("Demosalesmanager");
		
		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("crmsfa");
		
		WebElement eleLogin = driver.findElement(By.className("decorativeSubmit"));
		eleLogin.click();
		
		WebElement eleCRM = driver.findElement(By.linkText("CRM/SFA"));
		eleCRM.click();
		
		WebElement eleLeads = driver.findElement(By.linkText("Leads"));
		eleLeads.click();
		
		WebElement eleCreate = driver.findElement(By.linkText("Create Lead"));
		eleCreate.click();
		
		// Creating Lead
		
		WebElement eleCompany = driver.findElement(By.id("createLeadForm_companyName"));
		eleCompany.sendKeys("NetFlix");
		
		WebElement eleFirst = driver.findElement(By.id("createLeadForm_firstName"));
		eleFirst.sendKeys("Vicky");
		
		WebElement eleLast = driver.findElement(By.id("createLeadForm_lastName"));
		eleLast.sendKeys("S");
		
		WebElement eleDiscription = driver.findElement(By.id("createLeadForm_description"));
		eleDiscription.sendKeys("Automation Testing");
		
		WebElement eleEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		eleEmail.sendKeys("testxyz@gmail.com");
		
		WebElement eleState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select dd1 = new Select(eleState);
		dd1.selectByVisibleText("New York");
		
		WebElement eleSubmit = driver.findElement(By.className("smallSubmit"));
		eleSubmit.click();
		
		System.out.println("Title : "+ driver.getTitle());
		
		// Duplicate Lead
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		WebElement eleCompany1 = driver.findElement(By.id("createLeadForm_companyName"));
		eleCompany1.clear();
		eleCompany1.sendKeys("InfoEdge");
		
		WebElement eleFirst1 = driver.findElement(By.id("createLeadForm_firstName"));
		eleFirst1.clear();
		eleFirst1.sendKeys("Richard");
		
		WebElement eleSubmit1 = driver.findElement(By.className("smallSubmit"));
		eleSubmit1.click();
		
		System.out.println("Title : "+ driver.getTitle());

	}

}
