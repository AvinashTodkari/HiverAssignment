package Module_HiverExtension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_signout_Page 
{
@FindBy(xpath="//div[@class='gb_za gb_3f gb_s gb_g']") private WebElement usericon;
@FindBy(xpath="//div[text()='Sign out']") private WebElement signout;

public Gmail_signout_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickusericon_logo()
{
	usericon.click();
}

public void clicksignout_button()
{
	signout.click();
}
}
