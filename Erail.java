package advancedselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("tpj",Keys.TAB);
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("mdu",Keys.TAB);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		driver.findElement(By.xpath("//td[2])"));
		List<WebElement> trainnames = driver.findElements(By.tagName("//tr"));
		for (WebElement listnames : trainnames) {
			System.out.println(listnames);
			
		}
		

	}

}
