package Module_HiverExtension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CS_search_Page 
{
@FindBy(xpath="//div[@class='g-na-k']//input") private WebElement search;
@FindBy(xpath="//div[@class='zsZFFd']//div[@class='UgujC']") private WebElement hiver;

public CS_search_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void setsearchextension()
{
	search.sendKeys("hiver");
}

public void clickhiver()
{
	hiver.click();
}
}
