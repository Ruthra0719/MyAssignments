package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ruthra");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sakthi");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9965730704");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Ruthra@28");
		WebElement Date = driver.findElement(By.xpath("//select[@id='day']"));
		Select Day=new Select(Date);
		Day.selectByIndex(7);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select Mon=new Select(month);
		Mon.selectByIndex(3);
		WebElement Year=driver.findElement(By.xpath("//select[@id='year']"));
		Select Yrs=new Select(Year);
		Yrs.selectByVisibleText("1999");
		driver.findElement(By.xpath("//label[@for='u_d_4_Hw']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		


		  
		
		
		
		
}
}