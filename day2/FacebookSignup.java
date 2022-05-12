package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignup {
      public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Kokilavani");
		driver.findElement(By.name("lastname")).sendKeys("M");
		driver.findElement(By.name("reg_email__")).sendKeys("Koki23@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Koki23@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Koki123");;
	    //for selecting the date
		WebElement date= driver.findElement(By.id("day"));
		Select day=new Select(date);
		day.selectByVisibleText("23");
		//for selecting the month
		WebElement month= driver.findElement(By.name("birthday_month"));
		Select march=new Select(month);
		march.selectByVisibleText("Mar");
		//for selecting the year
		WebElement year= driver.findElement(By.id("year"));
		Select yaer=new Select(year);
		yaer.selectByVisibleText("2001");
		//for selecting the gender
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();
	}

}
