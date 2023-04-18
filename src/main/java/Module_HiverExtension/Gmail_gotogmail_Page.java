package Module_HiverExtension;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_gotogmail_Page
{
@FindBy(xpath="//button[text()='Go To Gmail']") private WebElement gotogmail;

public Gmail_gotogmail_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickgotogmail_button()
{
	gotogmail.click();
}
}
