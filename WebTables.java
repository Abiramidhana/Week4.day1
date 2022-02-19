package advancedselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(); // Open a new chrome browser
        driver.manage().window().maximize(); // Maximize the opened chrome browser window
        driver.get("http://www.leafground.com/pages/table.html"); // Loads the URL in the opened browser
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
List<WebElement> getcolumns=driver.findElements(By.tagName("th"));
int columns=getcolumns.size();
System.out.println("columns is"+columns);
List<WebElement> getrows=driver.findElements(By.tagName("tr"));
int rows=getrows.size();
System.out.println("Rows is"+rows);
WebElement text=driver.findElement(By.xpath("(//td[text()='Learn to interact with Elements']/following-sibling::td)[1]"));
String Text=text.getText();
System.out.println("Text is :"+Text);
WebElement text2=driver.findElement(By.xpath("(//td[text()='Learn to interact using Keyboard, Actions']/following-sibling::td)[2]"));
boolean b=text2.isSelected();
System.out.println(b);
	}

}
