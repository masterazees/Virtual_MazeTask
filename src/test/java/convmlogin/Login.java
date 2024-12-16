package convmlogin;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testng.BaseClass;
import testng.Loadproperties;


public class Login extends BaseClass {

@Test (priority=1, dataProvider="dataproviderreg")
	public void Register(String nam, String mail, String num, String pas) throws InterruptedException {
	
	Loadproperties Lp = new Loadproperties();
	Lp.loadprop();
	browser();
	MasterUrl();
	max();
	WebElement login = xpathlocator("//a[text()='Login']");
	login.click();
	WebElement sign = xpathlocator("//div[@class='slider-btn']/child::div[@id='register-tab']");
	sign.click();
	WebElement name = xpathlocator("//div[@class='input-container']/child::input[@id='Name']");
	name.sendKeys(nam);
	WebElement email = xpathlocator("//div[@class='input-container']/child::input[@id='email']");
	email.sendKeys(mail);
	WebElement number = xpathlocator("//div[@class='PhoneInput']/child::input");
	number.sendKeys(num);
	WebElement pass = xpathlocator("//div[@class='input-container']/child::input[@id='password']");
	pass.sendKeys(pas);
	xpathlocator("//button[@id='registerSubmit']").click();	
	Thread.sleep(2000);
	
	try {
		WebElement label = xpathlocator("//div[@class='Toastify']/descendant::div[4]");
		String text = label.getText();
		System.out.println(text);
		assertEquals(text, "Succuessfully Registered");
	}
	catch(Exception e) {
		try {
			WebElement label = xpathlocator("//div[@class='Toastify']/descendant::div[5]");
			String text2 = label.getText();
			System.out.println(text2);
			assertEquals(text2, "User mobile or email already exists");
		}
		catch(Exception b) {
		WebElement label = xpathlocator("//h3[@class='error-msg']");
		String text1 = label.getText();
		System.out.println(text1);
		assertEquals(text1, "Please Enter Valid Email");
		}
	}
	quitb();
	}
@Test (priority=2, dataProvider="dataprovider")

	public void login(String umail, String password) throws InterruptedException {
	
	Loadproperties Lp = new Loadproperties();
	Lp.loadprop();
	browser();
	MasterUrl();
	max();
	WebElement login = xpathlocator("//a[text()='Login']");
	login.click();
	WebElement email = xpathlocator("//div[@class='input-container']/child::input[@id='email']");
	email.sendKeys(umail);
	WebElement pass = xpathlocator("//div[@class='input-container']/child::input[@id='pass']");
	pass.sendKeys(password);
	xpathlocator("//button[@id='loginSubmit']").click();
	try {
		Thread.sleep(4000);
		xpathlocator("//div[@class='user_detail_div']//p").click();
		
		Thread.sleep(2000);
		xpathlocator("//div[@class='user_menu_dropdown_box']/descendant::p[text()='Log Out']").click();	
	}
	catch(Exception e) {
		try {
			WebElement label = xpathlocator("//h3[@class='error-msg']");
			String text = label.getText();
			System.out.println(text);
		}
		catch(Exception b) {
			WebElement label = xpathlocator("//div[@class='Toastify']/descendant::div[5]");
			String text = label.getText();
			System.out.println(text);
			
		}
		
	}
	
	quitb();

}




}
