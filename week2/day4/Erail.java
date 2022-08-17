package week2.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();
		
		// From and To
		
		WebElement eleFrom = driver.findElement(By.id("txtStationFrom"));
		eleFrom.clear();
		eleFrom.sendKeys("MS",Keys.TAB);
		
		WebElement eleTo = driver.findElement(By.id("txtStationTo"));
		eleTo.clear();
		eleTo.sendKeys("PDY",Keys.TAB);
		
		WebElement eleCheckBox = driver.findElement(By.id("chkSelectDateOnly"));
		eleCheckBox.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> elerow = driver.findElements(By.xpath("//table [@class = 'DataTable TrainList TrainListHeader']//tr"));
		
		//List<WebElement> elercol = driver.findElements(By.xpath("//table [@class = 'DataTable TrainList TrainListHeader']//tr[1]//td"));
		
		for(int i=1; i<=elerow.size() ; i++)
		{
			for(int j=1; j<=9; j++)
			{
				String text = driver.findElement(By.xpath("//table [@class = 'DataTable TrainList TrainListHeader']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(text+"     ");
			}
			System.out.println();
		}
		
		System.out.println("Title : "+ driver.getTitle());

	}

}
