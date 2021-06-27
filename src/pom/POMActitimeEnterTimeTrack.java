package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitimeEnterTimeTrack
{
	@FindBy(xpath="//a[text()='View Time-Track']")
	private WebElement timetrack;	
	
	
@FindBy(id="ext-gen78")
private WebElement balance_as_of;


@FindBy(id="ext-gen104")
private WebElement next;

@FindBy(xpath="//span[text()='24']")
private WebElement date;


@FindBy(xpath="//span[text()='Working Time:']")
private WebElement table;

public POMActitimeEnterTimeTrack(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void enter_timetrack() throws InterruptedException
{
	timetrack.click();
	balance_as_of.click();
	
	Thread.sleep(5000);
	for(int i=0;i<=3;i++)
	{
		Thread.sleep(10000);
		next.click();
	}
	date.click();
	table.click();
	
	
	
	}


}
