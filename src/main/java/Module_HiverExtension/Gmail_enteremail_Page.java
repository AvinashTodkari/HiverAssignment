package Module_HiverExtension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_enteremail_Page
{
@FindBy(xpath="//input[@type='email']") private WebElement emailid;
@FindBy(xpath="//span[text()='Next']") private WebElement next;

public Gmail_enteremail_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void set_emailid(String email)
{
	emailid.sendKeys(email);
}

public void clicknext_button()
{
	next.click();
}
}
