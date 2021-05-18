package Mccm.Pega.OSF;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Mccm.Pega.Outbound.PegaTestBase.TestBase;
import Mccm.Pega.QAUtil.TestUtil;
import Mccm.Pega.excel.utility.Excel_Reader;

public class OSFDMCCMSettings extends TestBase {

	public static String ExcelFilePath;

	@FindBy(xpath="(//h3[@class='layout-group-item-title'])[5]")
	WebElement Recordclk;

	@FindBy(xpath="(//div[@id='iconExpandCollapse'])[15]")
	WebElement SysAdmin;

	@FindBy(xpath="//a[text()='Dynamic System Settings']")
	WebElement webelement4;

	@FindBy(xpath="(//*[@id=\"iconExpandCollapse\"]/a)[15]")
	WebElement SysAdmin1;
	@FindBy(xpath="/html/body/div[5]/aside/div[1]/div/div[1]/div/div/div[9]/div[2]/div/span/div/span/div[1]/span/div/span/div/div[2]/div/table/tbody/tr/td/div/div/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/div/ul/li[16]/ul/li[1]/div/div[1]/a")
	WebElement SysAdmin2;



	@FindBy(xpath="//input[@type='text'][@name='$PpyDisplayHarness$ppySearchText']")
	WebElement D_mccmsettings;

	@FindBy(xpath="//*[@class='pi pi-search-2']")
	WebElement SerchClick;

	@FindBy(xpath="//a[text()='D_MCCMSettings']")
	WebElement Clickdmccmsetting;


	@FindBy(xpath="//*[@class='pi pi-caret-down margin-l-1x']")
	WebElement ActionClkDmccmsetting;

	@FindBy(xpath="(//text()[.='Run']/ancestor::a[1])[2]")
	WebElement RunActionClk;

	@FindBy(xpath="//input[@type='checkbox'][@name='$PD_pzRunRecord$ppxRunWindow$gTABTHREAD1$ppxRunParameters$ppyFlushAll']")
	WebElement FlushClk;

	@FindBy(xpath="(//div[@class='pzbtn-mid'])[3]")
	WebElement RunFlushClk;







	Excel_Reader obj= new Excel_Reader(ExcelFilePath+"/UseCaseConfigFile/TestData/PegaTestData.xlsx");


	//D_mccmsettingsValue

	String D_mccmsettingsValue = obj.getCellValue("PegaTestDataOSF", 1, 11);

	//D_mccmsettingsValue





	public OSFDMCCMSettings( ) {
		PageFactory.initElements(driver, this);
	}

	//	public void Recordclk() throws InterruptedException
	//	{
	//		//wait.until(ExpectedConditions.visibilityOf(Recordclk));
	//	 //	Recordclk.click( );
	//	      Thread.sleep(1000);
	//	//	System.out.println("hi");
	//		 Actions  action = new Actions(driver);
	//	     action.moveToElement(Recordclk).click().build().perform();
	//	  //   Thread.sleep(1000);
	//	
	// 
	//	}
	//	public void SysAdmin() throws InterruptedException
	//	{
	//	// 	wait.until(ExpectedConditions.elementToBeClickable(SysAdmin));
	//	  	 Thread.sleep(3000);
	//		
	//     SysAdmin.click( );
	//	 
	//	 
	//	}


	public void Recordclk() throws InterruptedException
	{ 
		Thread.sleep(8000);
		Recordclk.click( );
		Thread.sleep(8000);
		System.out.println("test 51");
		}

	public void SysAdmin() throws InterruptedException
	{
		Thread.sleep(8000);
		SysAdmin.click( );
		Thread.sleep(8000);
		System.out.println("test 50");
	}  


	public void javaexictor4() throws InterruptedException
	{
		TestUtil obj=new TestUtil();
		obj.JavascriptExecutor(webelement4);
	}	
	public void DynamicSystemSettins() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(webelement4));
		webelement4.click( );

	}

	//D_mccmsettings
	public void D_mccmsettings() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(D_mccmsettings));
		D_mccmsettings.sendKeys(D_mccmsettingsValue);

	}

	public void SerchClick() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(SerchClick));
		SerchClick.click( );

	}
	public void Clickdmccmsetting() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(Clickdmccmsetting));
		Clickdmccmsetting.click( );

	}
	public void ActionClkDmccmsetting() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(ActionClkDmccmsetting));
		ActionClkDmccmsetting.click( );

	}

	public void RunActionClk() throws InterruptedException
	{
		TestUtil obj=new TestUtil();
		obj.ActionMouseMov(RunActionClk);
	}	

	public void FulshRunClick() throws InterruptedException
	{
		String mainWindow=driver.getWindowHandle();
		Set<String> set =driver.getWindowHandles();
		Iterator<String> itr= set.iterator();
		while(itr.hasNext())
		{
			String childWindow=itr.next();
			if(!mainWindow.equals(childWindow)){
				driver.switchTo().window(childWindow);

				wait.until(ExpectedConditions.visibilityOf(FlushClk));
				FlushClk.click();

				wait.until(ExpectedConditions.visibilityOf(RunFlushClk));
				RunFlushClk.click( );


				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);

	}
	//D_mccmsettings



}