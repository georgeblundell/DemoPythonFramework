package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;

import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://curiosity.partner.testinsights.io/app/#!/module-collection/guid/e12188e8-b1b8-4db2-a1fc-71bd28c47be3
@TestModellerModule(guid = "e12188e8-b1b8-4db2-a1fc-71bd28c47be3")
public class Hyperon_Demo_App_Car_Information extends BasePage
{
	public Hyperon_Demo_App_Car_Information (WebDriver driver)
	{
		super(driver);
	}


	
	private By Production_YearElem = By.xpath("//SELECT[@class='common-input-default__select ng-pristine ng-untouched ng-valid ng-not-empty el-selection']");

	private By MakeElem = By.xpath("//SELECT[@class='common-input-default__select ng-pristine ng-untouched ng-valid ng-not-empty el-selection']");

	private By TypeElem = By.xpath("//SELECT[@class='common-input-default__select ng-pristine ng-untouched ng-valid ng-not-empty el-selection']");

	private By ModelElem = By.xpath("//SELECT[@class='common-input-default__select ng-pristine ng-untouched ng-valid ng-not-empty el-selection']");


	
	public void GoToUrl()
	{
		m_Driver.get("https://motor-insurance-demo.hyperon.io/");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://motor-insurance-demo.hyperon.io/");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://motor-insurance-demo.hyperon.io/");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://motor-insurance-demo.hyperon.io/";

        if (!currentUrl.equals("https://motor-insurance-demo.hyperon.io/")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select Production Year
     * @name Select Production Year
     */
    public void Select_Production_Year(String Production_Year)
 	{
 	    
 		WebElement elem = getWebElement(Production_YearElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Production_Year", "Select_Production_Year failed. Unable to locate object: " + Production_YearElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Production_Year", "Select_Production_Year failed. Unable to locate object: " + Production_YearElem.toString());

 			Assert.fail("Unable to locate object: " + Production_YearElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Production_Year);
 		

 		ExtentReportManager.passStep(m_Driver, "Select_Production_Year " + Production_Year);

 		TestModellerLogger.PassStep(m_Driver, "Select_Production_Year " + Production_Year);
 	}
    
	/**
 	 * Select Make
     * @name Select Make
     */
    public void Select_Make(String Make)
 	{
 	    
 		WebElement elem = getWebElement(MakeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Make", "Select_Make failed. Unable to locate object: " + MakeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Make", "Select_Make failed. Unable to locate object: " + MakeElem.toString());

 			Assert.fail("Unable to locate object: " + MakeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Make);
 		

 		ExtentReportManager.passStep(m_Driver, "Select_Make " + Make);

 		TestModellerLogger.PassStep(m_Driver, "Select_Make " + Make);
 	}
    
	/**
 	 * Select Type
     * @name Select Type
     */
    public void Select_Type(String Type)
 	{
 	    
 		WebElement elem = getWebElement(TypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Type", "Select_Type failed. Unable to locate object: " + TypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Type", "Select_Type failed. Unable to locate object: " + TypeElem.toString());

 			Assert.fail("Unable to locate object: " + TypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Type);
 		

 		ExtentReportManager.passStep(m_Driver, "Select_Type " + Type);

 		TestModellerLogger.PassStep(m_Driver, "Select_Type " + Type);
 	}
    
	/**
 	 * Select Model
     * @name Select Model
     */
    public void Select_Model(String Model)
 	{
 	    
 		WebElement elem = getWebElement(ModelElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Model", "Select_Model failed. Unable to locate object: " + ModelElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Model", "Select_Model failed. Unable to locate object: " + ModelElem.toString());

 			Assert.fail("Unable to locate object: " + ModelElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Model);
 		

 		ExtentReportManager.passStep(m_Driver, "Select_Model " + Model);

 		TestModellerLogger.PassStep(m_Driver, "Select_Model " + Model);
 	}}