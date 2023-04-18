package HiverExtensionTest;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.MyscreenRecorder;
import LibraryFiles.baseclass;
import Module_HiverExtension.CS_hiverextension_page;
import Module_HiverExtension.CS_search_Page;
import Module_HiverExtension.CS_selecthiverextension_page;
import Module_HiverExtension.Gmail_Authentication_Page;
import Module_HiverExtension.Gmail_chooseAcType_Page;
import Module_HiverExtension.Gmail_chooseAnotheracc_Page;
import Module_HiverExtension.Gmail_createSM_Page;
import Module_HiverExtension.Gmail_enteremail_Page;
import Module_HiverExtension.Gmail_enterpassword_Page;
import Module_HiverExtension.Gmail_gotogmail_Page;
import Module_HiverExtension.Gmail_hiveraddcompanycred_Page;
import Module_HiverExtension.Gmail_homepage_Page;
import Module_HiverExtension.Gmail_signin_Page;
import Module_HiverExtension.Gmail_signout_Page;

public class Module_hiverextension_Test extends baseclass
{
	CS_search_Page searchbox;
	CS_selecthiverextension_page hiveroption;
	CS_hiverextension_page addextension;
	Gmail_signin_Page sign;
	Gmail_enteremail_Page mail;
	Gmail_enterpassword_Page pass;
	Gmail_homepage_Page home;
	Gmail_hiveraddcompanycred_Page company;
	Gmail_createSM_Page sm;
	Gmail_chooseAcType_Page swgoogle;
	Gmail_Authentication_Page auth;
	Gmail_gotogmail_Page gotgmail;
	Gmail_signout_Page signout;
	Gmail_chooseAnotheracc_Page acnt;
	
@BeforeClass
public void openbrowser() throws Exception
{
	MyscreenRecorder.startRecord("HiverTest");
	initializeBrowser();
	searchbox=new CS_search_Page(driver);
	hiveroption=new CS_selecthiverextension_page(driver);
	addextension=new CS_hiverextension_page(driver);
	sign=new Gmail_signin_Page(driver);
	mail=new Gmail_enteremail_Page(driver);
	pass=new Gmail_enterpassword_Page(driver);
	home=new Gmail_homepage_Page(driver);
	company=new Gmail_hiveraddcompanycred_Page(driver);
	sm=new Gmail_createSM_Page(driver);
	swgoogle=new Gmail_chooseAcType_Page(driver);
	auth=new Gmail_Authentication_Page(driver);
	gotgmail=new Gmail_gotogmail_Page(driver);
	signout=new Gmail_signout_Page(driver);
	acnt=new Gmail_chooseAnotheracc_Page(driver);	
}
	
@BeforeMethod
public void addextension() throws AWTException, InterruptedException
{
	searchbox.setsearchextension();
	Thread.sleep(4000);
	searchbox.clickhiver();
	hiveroption.clickhiverextension();
	addextension.clickaddtochromebutton();
	Thread.sleep(2000);
	addextension.clickaddextensionpopupbutton();
}

@Test
public void user1login() throws AWTException, InterruptedException
{
	Thread.sleep(4000);
	//sign.swithtogmailwindow();
	Set<String> id = driver.getWindowHandles();
	   ArrayList<String> allid=new ArrayList<String>(id);
	   String CSwindow=allid.get(0);
	   String gmailwindow=allid.get(1);
	   driver.switchTo().window(gmailwindow);
	
	sign.clicksignin_button();
	mail.set_emailid("avinash@sskbilling.com");
	mail.clicknext_button();
	Thread.sleep(4000);
	pass.setpassword("a9730391958");
	pass.clicknext_button();
	home.clickhivericon();
	Thread.sleep(2000);
	home.clickloginhiver_button();
	company.setcompanyname("hexaware-ssk");
	Thread.sleep(3000);
	company.setcompanyphone("+918208794703");
	company.clickoksetupSM_button();
	company.clickcontinuepopup_button();
	
	driver.switchTo().frame("Hiver_iframe_content");
	driver.switchTo().frame("iframe_handler");
	sm.setSMemail("avinash@sskbilling.com");
	sm.setSMname(" Todkari");
	sm.setuser("avinashtodkari3119@gmail.com");
	sm.clickcreate_button();
	swgoogle.clicksignwgoogle_button();
	
	Set<String> gaccnts = driver.getWindowHandles();
	ArrayList<String> accnt=new ArrayList<String>(gaccnts);
	String g1 = accnt.get(0);
	String g2 = accnt.get(1);
	String g3=accnt.get(2);
	driver.switchTo().window(g3);
	auth.clickAccount_button();
	auth.clickallow_button();
	
	driver.switchTo().window(g2);
	driver.switchTo().frame("Hiver_iframe_content");
	driver.switchTo().frame("iframe_handler");
	gotgmail.clickgotogmail_button();
	driver.switchTo().defaultContent();
	signout.clickusericon_logo();
	driver.switchTo().frame("account");
	signout.clicksignout_button();
}

@AfterMethod
public void user2login() throws InterruptedException
{
	acnt.clickchooseanotheraccnt_button();
	mail.set_emailid("avinashtodkari3119@gmail.com");
	mail.clicknext_button();
	Thread.sleep(4000);
	pass.setpassword("avinash3119");
	pass.clicknext_button();
	home.clickhivericon();
	Thread.sleep(2000);
	home.clickloginhiver_button();
	company.clickcontinuepopup_button();
	WebElement refresh = driver.findElement(By.xpath("//div[@class='asf T-I-J3 J-J5-Ji']"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", refresh);
	
}

@AfterClass
public void closebrowser() throws Exception
{
	driver.quit();
	MyscreenRecorder.stopRecord();
}
	
	
}



