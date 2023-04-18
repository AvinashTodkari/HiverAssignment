package Module_HiverExtension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_chooseAcType_Page
{
@FindBy(xpath="//span[text()='Sign in with Google']") private WebElement signwgoogle;

public Gmail_chooseAcType_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clicksignwgoogle_button()
{
	signwgoogle.click();
}
}
