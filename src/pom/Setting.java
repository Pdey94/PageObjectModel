package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Setting
{
	@FindBy(xpath="//div[@class=\"popup_menu_button popup_menu_button_settings \"]")
	private WebElement setting_dropdown ;	
	
	@FindBy(xpath="//a[text()=\"Leave Types\"]")
	private WebElement leave_type ;	
	
	@FindBy(xpath="//span[text()=\"Create Leave Type\"]")
	private WebElement createLeave_Type;
	
	@FindBy(id="leaveTypeLightBox_nameField")
	private WebElement Text_Field;
	
	@FindBy(id="leaveTypeLightBox_cancelBtn")
	private WebElement cancel;
	
	
	public Setting(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Cancel()
	{
		setting_dropdown.click();
		leave_type.click();
		 createLeave_Type.click();
		Text_Field.sendKeys("Rajnis");;
		cancel.click();
		
		

		
		}
	
	
	
	

}
