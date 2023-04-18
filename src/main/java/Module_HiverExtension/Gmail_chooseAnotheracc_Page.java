package Module_HiverExtension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_chooseAnotheracc_Page
{
@FindBy(xpath="//div[text()='Use another account']") private WebElement chooseaccnt;

public Gmail_chooseAnotheracc_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickchooseanotheraccnt_button()
{
	chooseaccnt.click();
}
}
