package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitimeLoginPage 
{

	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextdfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement checkbox;
	
	@FindBy(id="loginButton")
	private WebElement login;

	@FindBy(xpath="//a[text()='Forgot your password?']")
	private WebElement forgotPasswordlink;
	
	@FindBy(xpath="//a[text()='actiTIME Inc.']")
	private WebElement actitimeIncLink;
	
	public POMActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

public void loginMethod()
{
	usernameTextfield.sendKeys("admin");
	passwordTextdfield.sendKeys("manager");
	checkbox.click();
	login.click();
	}

}
