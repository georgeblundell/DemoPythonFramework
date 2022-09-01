package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://curiosity.partner.testinsights.io/app/#!/model-engine/guid/bc15d739-5af6-4afd-8215-8bd79b1775eb
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 7377, profileId = 115498)
public class CustomerLogin_UserStories extends TestBase
{
    

    
    @Test  (groups= {"Customer Login","Customer Login - User Stories"})
    @TestModellerPath(guid = "7e44d8e5-8da7-43f6-b5f0-06da81855d52")
    public void GoToUrlNegativeEnterEmailNegativeEnterPasswordPasswordClickSignInClickTheaccountsigninwasincorr()
    {
        
        pages.Customer_Login _Customer_Login = new pages.Customer_Login(driver);
    TestModellerLogger.SetLastNodeGuid("51f336cf-49ed-4acb-a242-3c1314992f09");
    _Customer_Login.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("0ea48474-1497-4780-b560-73b74901bcff");
    _Customer_Login.Enter_Email("huw.price");

    TestModellerLogger.SetLastNodeGuid("ad55c066-152a-4317-8254-122624ee20d2");
    _Customer_Login.Enter_PasswordPassword("#!_ @");

    TestModellerLogger.SetLastNodeGuid("d1ff946c-a468-4c9f-9fe3-a7dc78c207fc");
    _Customer_Login.Click_Sign_In();

    TestModellerLogger.SetLastNodeGuid("e6e04aee-669c-4472-8c33-442fe5b4157e");
    _Customer_Login.Click_The_account_signin_was_incorrect_or_your_account_is_disabled_temporarily_Please_wait_and_try_agai();

    }


    @Test  (groups= {"Customer Login","Customer Login - User Stories"})
    @TestModellerPath(guid = "299f1144-4d6d-42f1-bc0a-1f09d98fd5ac")
    public void GoToUrlNegativeEnterEmailPositiveEnterPasswordPasswordClickSignInClickTheaccountsigninwasincorr()
    {
        
        pages.Customer_Login _Customer_Login = new pages.Customer_Login(driver);
    TestModellerLogger.SetLastNodeGuid("51f336cf-49ed-4acb-a242-3c1314992f09");
    _Customer_Login.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("0ea48474-1497-4780-b560-73b74901bcff");
    _Customer_Login.Enter_Email("huw.price");

    TestModellerLogger.SetLastNodeGuid("856adaa7-904c-46a7-9f11-c1a978a97575");
    _Customer_Login.Enter_PasswordPassword("n_6YweIFBz");

    TestModellerLogger.SetLastNodeGuid("d1ff946c-a468-4c9f-9fe3-a7dc78c207fc");
    _Customer_Login.Click_Sign_In();

    TestModellerLogger.SetLastNodeGuid("e6e04aee-669c-4472-8c33-442fe5b4157e");
    _Customer_Login.Click_The_account_signin_was_incorrect_or_your_account_is_disabled_temporarily_Please_wait_and_try_agai();

    }


    @Test  (groups= {"Customer Login","Customer Login - User Stories"})
    @TestModellerPath(guid = "994e4f12-be19-48f1-85fc-0c56bf8837da")
    public void GoToUrlPositiveEnterEmailPositiveEnterPasswordPasswordClickSignInPositive()
    {
        
        pages.Customer_Login _Customer_Login = new pages.Customer_Login(driver);
    TestModellerLogger.SetLastNodeGuid("51f336cf-49ed-4acb-a242-3c1314992f09");
    _Customer_Login.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("a7b5342b-f457-4e36-a043-ead102698cf3");
    _Customer_Login.Enter_Email("huw.price@outlook.com");

    TestModellerLogger.SetLastNodeGuid("bde01afc-2863-49f2-babf-a8484257db9e");
    _Customer_Login.Enter_PasswordPassword("Zeet2cwmna");

    TestModellerLogger.SetLastNodeGuid("2686f25b-c1bf-49a1-ba32-bd9f463871e0");
    _Customer_Login.Click_Sign_In();

    }


    @Test  (groups= {"Customer Login","Customer Login - User Stories"})
    @TestModellerPath(guid = "cb34fec2-a8e6-4229-926b-bf6f114445e4")
    public void GoToUrlPositiveEnterEmailNegativeEnterPasswordPasswordClickSignInClickTheaccountsigninwasincorr()
    {
        
        pages.Customer_Login _Customer_Login = new pages.Customer_Login(driver);
    TestModellerLogger.SetLastNodeGuid("51f336cf-49ed-4acb-a242-3c1314992f09");
    _Customer_Login.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("a7b5342b-f457-4e36-a043-ead102698cf3");
    _Customer_Login.Enter_Email("huw.price@outlook.com");

    TestModellerLogger.SetLastNodeGuid("ad1a197b-a2f8-43b5-a33c-4997c1eb6f0c");
    _Customer_Login.Enter_PasswordPassword("#!_ @");

    TestModellerLogger.SetLastNodeGuid("d1ff946c-a468-4c9f-9fe3-a7dc78c207fc");
    _Customer_Login.Click_Sign_In();

    TestModellerLogger.SetLastNodeGuid("e6e04aee-669c-4472-8c33-442fe5b4157e");
    _Customer_Login.Click_The_account_signin_was_incorrect_or_your_account_is_disabled_temporarily_Please_wait_and_try_agai();

    }


}