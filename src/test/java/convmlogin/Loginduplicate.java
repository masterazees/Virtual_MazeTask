package convmlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://tracker.vmmaps.com");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		login.click();
		WebElement sign = driver.findElement(By.xpath("//div[@class='slider-btn']/child::div[@id='register-tab']"));
		sign.click();
		
		WebElement name = driver.findElement(By.xpath("//div[@class='input-container']/child::input[@id='Name']"));
		name.sendKeys("Abirami");
		WebElement email = driver.findElement(By.xpath("//div[@class='input-container']/child::input[@id='email']"));
		email.sendKeys("sivachidhabaram@gmail.com");
		
		WebElement number = driver.findElement(By.xpath("//div[@class='PhoneInput']/child::input"));
		number.sendKeys("9841141346");
		WebElement pass = driver.findElement(By.xpath("//div[@class='input-container']/child::input[@id='password']"));
		pass.sendKeys("Azees@123");
		
		driver.findElement(By.xpath("//button[@id='registerSubmit']")).click();
	}

}
