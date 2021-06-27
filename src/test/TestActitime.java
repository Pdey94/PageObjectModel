package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.POMActitimeEnterTimeTrack;
import pom.POMActitimeLoginPage;
import pom.Setting;

public class TestActitime {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe")	;
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com");
	
	POMActitimeLoginPage login=new POMActitimeLoginPage(driver);
	login.loginMethod();
	
	POMActitimeEnterTimeTrack timetrack=new POMActitimeEnterTimeTrack(driver);
	timetrack.enter_timetrack();
	
	
	Setting cancel=new Setting(driver);
	cancel.Cancel();
	
	Alert alt= driver.switchTo().alert();
	//System.out.println(alt.getText());
	alt.accept();
	//alt.dismiss();

	}

}
