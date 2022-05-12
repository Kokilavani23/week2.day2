package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTaps {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
	
		//To login the testleaf page
        
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		//To create a new lead
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kokilavani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
        driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("23/03/2001");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select ele=new Select(source);
		ele.selectByVisibleText("Employee");
		
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select ele1=new Select(industry);
		ele1.selectByIndex(2);
		
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ele2=new Select(ownership);
		ele2.selectByValue("OWN_CCORP");
		
		WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select ele3=new Select(marketing);
		ele3.selectByVisibleText("Automobile");
		
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select ele4=new Select(country);
		ele4.selectByVisibleText("India");
		
		//WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		//Select ele5=new Select(state);
        //ele5.selectByVisibleText("");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("638183");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("011");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("koki23@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Kokilavani");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("leaftaps.com");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Koki");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Gandhi salai");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("pallavanthangal");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600108");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Deepi");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("College road");
		
		String firstName=driver.findElement(By.name("firstName")).getText();
		System.out.println("firstName");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
	
	 }

}
