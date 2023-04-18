package Module_HiverExtension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_hiveraddcompanycred_Page
{
@FindBy(id="h-companyName") private WebElement companyname;
@FindBy(id="h-userPhone") private WebElement companyphone;
@FindBy(id="h-validatePhone") private WebElement okay;
@FindBy(xpath="//div[text()='Continue']") private WebElement contnue;

public Gmail_hiveraddcompanycred_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void setcompanyname(String comp_name)
{
	companyname.sendKeys(comp_name);
}

public void setcompanyphone(String comp_phome)
{
	companyphone.sendKeys(comp_phome);
}

public void clickoksetupSM_button()
{
	okay.click();
}

public void clickcontinuepopup_button()
{
	contnue.click();
}
}
