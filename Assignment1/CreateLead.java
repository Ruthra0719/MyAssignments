package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ruthra");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mohan");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ruthra");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
driver.findElement(By.id("createLeadForm_description")).sendKeys("Thank you");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ruthras0702@gmail.com");
driver.findElement(By.className("smallSubmit")).click();
String title = driver.getTitle();
System.out.println(title);

	}

}
