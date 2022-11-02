package automationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1B {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		
	    driver.get("https://blazedemo.com/");
	   
	    String title=driver.getTitle();
	    System.out.println("The title of Page is : "+ title );
	    
	    
	    driver.close();

	}

}


