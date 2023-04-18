package Module_HiverExtension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_enterpassword_Page
{
@FindBy(xpath="//input[@type='password']") private WebElement pwd;
@FindBy(xpath="//span[text()='Next']") private WebElement next;

public Gmail_enterpassword_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void setpassword(String password)
{
	pwd.sendKeys(password);
}

public void clicknext_button()
{
	next.click();
}
}
