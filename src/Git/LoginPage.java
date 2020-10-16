package Git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage {
	
	public void chromebrowser() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C://Users//Dinesh//workspace//ProjectTraining//Drivers//chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();	
	driver.get("https://www.facebook.com/");	
	System.out.println("Title ::"+driver.getTitle());	
	driver.manage().window().maximize();	

	
	WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
	username.sendKeys("Username");

	WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
	password.sendKeys("Password");

	WebElement loginicon = driver.findElement(By.xpath("//button[@name='login']"));
	loginicon.click();
	
		
}


public static void main(String[] args) throws Exception {
	LoginPage XT= new LoginPage();
	XT.chromebrowser();
}
}
