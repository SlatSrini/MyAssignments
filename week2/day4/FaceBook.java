package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://en-gb.facebook.com/");	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// InputBox Handling
		
		driver.findElement(By.name("firstname")).sendKeys("Srini");
		driver.findElement(By.name("lastname")).sendKeys("P");
		driver.findElement(By.name("reg_email__")).sendKeys("8015401856");
     	driver.findElement(By.id("password_step_input")).sendKeys("SeleniumTest@FB");
		
		// DropDown Handling
		
		Select day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByVisibleText("2");
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByVisibleText("Jul");
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("1998");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		

	}

}
