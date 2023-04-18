package LibraryFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class baseclass
{
	public WebDriver driver;
public void initializeBrowser()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SSK\\eclipse-workspace\\HiverExtension\\BrowserFiles\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.get("https://chrome.google.com/webstore/category/extensions");
}
}

