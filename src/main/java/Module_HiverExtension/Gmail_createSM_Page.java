package Module_HiverExtension;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibraryFiles.robotclass;

public class Gmail_createSM_Page
{
@FindBy(xpath="//input[@name='sourceEmail']") private WebElement addSMemail;
@FindBy(name="smName") private WebElement SMname;
@FindBy(xpath="//input[@role='combobox']") private WebElement adduser;
@FindBy(xpath="//button[text()='Create']") private WebElement create;

public Gmail_createSM_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void setSMemail(String SMemail)
{
	addSMemail.sendKeys(SMemail);
}

public void setSMname(String smname)
{
	SMname.sendKeys(smname);
}

public void setuser(String user) throws AWTException, InterruptedException
{
	adduser.sendKeys(user);
	Thread.sleep(2000);
	robotclass rob=new robotclass();
	rob.performkeyboardkeypress();
}

public void clickcreate_button()
{
	create.click();
}
}
