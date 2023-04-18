package Module_HiverExtension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_homepage_Page
{
@FindBy(xpath="//div[@class='hiver-nonLogged-btn']") private WebElement hivericon;
@FindBy(xpath="//a[text()='Login to Hiver']") private WebElement loginhiver;

public Gmail_homepage_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickhivericon()
{
	hivericon.click();
}

public void clickloginhiver_button()
{
	loginhiver.click();
}
}
