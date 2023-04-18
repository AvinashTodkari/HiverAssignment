package Module_HiverExtension;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_signin_Page
{
@FindBy(xpath="//a[text()='Sign in']") private WebElement sign;
WebDriver driver1;

public Gmail_signin_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clicksignin_button()
{
	sign.click();
}
}
