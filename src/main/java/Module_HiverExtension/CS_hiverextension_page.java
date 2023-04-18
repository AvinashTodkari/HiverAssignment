package Module_HiverExtension;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import LibraryFiles.robotclass;

public class CS_hiverextension_page
{
@FindBy(xpath="(//div[text()='Add to Chrome'])[1]") private WebElement addtochrome;

public CS_hiverextension_page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickaddtochromebutton()
{
	addtochrome.click();
}

public void clickaddextensionpopupbutton() throws AWTException, InterruptedException
{
	robotclass mouse=new robotclass();
	mouse.mouseclick(830, 236);
}
}
