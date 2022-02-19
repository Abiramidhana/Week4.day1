package advancedselenium;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortTables {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(); // Open a new chrome browser
        driver.manage().window().maximize(); // Maximize the opened chrome browser window
        driver.get("http://www.leafground.com/pages/sorttable.html"); // Loads the URL in the opened browser
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      List<WebElement>Valueoftablerow=  driver.findElements(By.xpath("(//td[@class='sorting_1'])"));
   for(int i=0;i<Valueoftablerow.size();i++)	
   {
	   System.out.println(Valueoftablerow.get(i).getText());
   }
   List<   WebElement >Valueoftablerows=  driver.findElements(By.xpath("//td[2]"));
   for(int i=0;i<Valueoftablerows.size();i++)	
	  {
	   System.out.println(Valueoftablerows.get(i).getText());
	  
	  }
   List<   WebElement >Valueoftablerows3=  driver.findElements(By.xpath("//td[3]"));
   for(int i=0;i<Valueoftablerows3.size();i++)	
	  {
	   System.out.println(Valueoftablerows3.get(i).getText());
	  
	  }
   
   WebDriverWait wait = new WebDriverWait(driver,30);   
   wait.until(ExpectedConditions.elementToBeClickable(By.className("sorting_asc")));
   driver.findElement(By.className("sorting_asc")).click();

}
}