package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Srinivasan");		
		driver.findElement(By.xpath("//input[@id='ext-gen250']")).sendKeys("Ramachandran");
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=10409']")).click();
		String Str = driver.getTitle();
		System.out.println(Str);
		if(Str.equals("View Lead|Opentaps CRM")) {
			System.out.println("Title page Verified");
			
		}
		else {
			System.out.println("mismatch in the title");
		}
		driver.findElement(By.xpath("//a[@href='updateLeadForm?partyId=10409']")).click();
		WebElement fn = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		fn.clear();
		fn.sendKeys("MNC");
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		WebElement fn1 = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		String Str2=fn1.getText();
		if(Str2.equals("MNC")) {
			System.out.println("the company name was changed");
			
		}
		else {
			System.out.println("the company name is not changed");
		}
		
	
	driver.close();
	
}
	
	
}