package automationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1A {
public static void main(String[] args) {
	
	
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
    @SuppressWarnings("unused")
    WebDriver driver= new ChromeDriver();
	
    driver.get("https://blazedemo.com/");
    
	List<WebElement> links=driver.findElements(By.tagName("a"));
    System.out.println("The total number of links are: "+links.size());
    
    List<WebElement> images=driver.findElements(By.tagName("img"));
    System.out.println("The total number of images are: "+images.size());
    
    driver.close();
	

   }
}
