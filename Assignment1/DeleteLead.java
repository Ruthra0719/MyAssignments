package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field ']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		WebElement findele = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]"));
		String text = findele.getText();
		System.out.println(text);
		findele.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("javascript:document.deleteLeadForm.submit()")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field ']")).sendKeys("text");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		String tt = driver.findElement(By.className("x-paging-info")).getText();
		if (tt.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		driver.close();
		
		
	
	
	
	
	
	}
}