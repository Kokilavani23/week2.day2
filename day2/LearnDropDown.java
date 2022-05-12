package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) {

	//download the driver and set the path
	WebDriverManager.chromedriver().setup();
	//launch the browser 
    ChromeDriver driver=new ChromeDriver();
	//load the application url
	driver.get("http://www.leafground.com/pages/Dropdown.html");
	//maximize the browser
	driver.manage().window().maximize();
				
	//find the first dropdown
	WebElement eleDropDown1=driver.findElement(By.id("dropdown1"));
	//convert to select class
	Select dd1=new Select(eleDropDown1);
	//select By visible Text
	dd1.selectByVisibleText("Selenium");

	}

}
