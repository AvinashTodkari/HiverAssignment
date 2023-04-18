package Module_HiverExtension;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_Authentication_Page
{
@FindBy(xpath="//div[text()='Avinash Todkari']") private WebElement chooseacc;
@FindBy(xpath="//span[text()='Allow']") private WebElement allow;

public Gmail_Authentication_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public void clickAccount_button()
{
	chooseacc.click();
	
}

public void clickallow_button()
{
	allow.click();
}


}
