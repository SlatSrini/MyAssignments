package Week6.day11;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

		public EdgeDriver driver;
		 
		@BeforeMethod
		public void start() {
			
			WebDriverManager.edgedriver().setup();
			
			driver=new EdgeDriver();
			
			Set<String> windowHandles = driver.getWindowHandles();
			ArrayList<String> list = new ArrayList<String>(windowHandles);
			driver.switchTo().window(list.get(1));
		
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("http://leaftaps.com/opentaps");
		}	
		@AfterMethod	
		public void stop() {
			
			driver.quit();
		
		

	}


}
