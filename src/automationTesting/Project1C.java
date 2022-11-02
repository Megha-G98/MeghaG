package automationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Project1C {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	   
	    driver.get("https://blazedemo.com/");

	    Select depart=new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")));
	    // getting the list of options in the dropdown
	    List<WebElement> op1= depart.getOptions();
	    int depsize= op1.size();
	    System.out.println("The Length of data in Departure dropdown : "+ depsize);
	    for(int i=0; i<depsize; i++) {
	    	String option1=op1.get(i).getText();
	    	System.out.println(option1);
	    }
	    
	    
        Select dest=new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")));
	    
	    List<WebElement> op2= dest.getOptions();
	    int destsize= op2.size();
	    System.out.println("The Length of data in Destination dropdown : "+ destsize);
	    for(int i=0; i<destsize; i++) {
	    	String option2=op2.get(i).getText();
	    	System.out.println(option2);
	    }
	    
	    driver.close();
	}

}
