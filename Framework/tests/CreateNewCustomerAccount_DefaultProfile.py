import pytest


import pages.Create_New_Customer_Account


#https://curiosity.partner.testinsights.io/app/#!/model-engine/guid/d445062d-f72c-417b-abdc-6ae4ace4bb24


@pytest.mark.usefixtures("driver")
def test_OpenCreateNewCustomerAccountpageGotopagePositiveEnterFirstNamePositiveEnterLastNamePositiveEnte(driver):
    
    _Create_New_Customer_Account = pages.Create_New_Customer_Account.Create_New_Customer_Account(driver);
    _Create_New_Customer_Account.GoToUrl();

    _Create_New_Customer_Account.Enter_First_Name("Alia");

    _Create_New_Customer_Account.Enter_Last_Name("Wilkinson");

    _Create_New_Customer_Account.Enter_Email("huw.price@outlook.com");

    _Create_New_Customer_Account.Enter_Password("ZmHr7WBIqV");

    _Create_New_Customer_Account.Enter__Confirm_Password_("MfaDbRF8AU");

    _Create_New_Customer_Account.Click__Create_an_Account_();



@pytest.mark.usefixtures("driver")
def test_OpenCreateNewCustomerAccountpageGotopagePositiveEnterFirstNamePositiveEnterLastNamePositiveEnte1(driver):
    
    _Create_New_Customer_Account = pages.Create_New_Customer_Account.Create_New_Customer_Account(driver);
    _Create_New_Customer_Account.GoToUrl();

    _Create_New_Customer_Account.Enter_First_Name("Franz");

    _Create_New_Customer_Account.Enter_Last_Name("Friesen");

    _Create_New_Customer_Account.Enter_Email("huw.price@outlook.com");

    _Create_New_Customer_Account.Enter_Password("KXEEZuFR6U");

    _Create_New_Customer_Account.Enter__Confirm_Password_("3XvDfUord6");

    _Create_New_Customer_Account.Click__Allow_remote_shopping_assistance_();

    _Create_New_Customer_Account.Click__Create_an_Account_();



@pytest.mark.usefixtures("driver")
def test_OpenCreateNewCustomerAccountpageGotopagePositiveEnterFirstNamePositiveEnterLastNamePositiveEnte2(driver):
    
    _Create_New_Customer_Account = pages.Create_New_Customer_Account.Create_New_Customer_Account(driver);
    _Create_New_Customer_Account.GoToUrl();

    _Create_New_Customer_Account.Enter_First_Name("Eino");

    _Create_New_Customer_Account.Enter_Last_Name("Swift");

    _Create_New_Customer_Account.Enter_Email("huw.price@outlook.com");

    _Create_New_Customer_Account.Enter_Password("Y21dGFuGOu");

    _Create_New_Customer_Account.Enter__Confirm_Password_("aiJp0oigED");

    _Create_New_Customer_Account.Click__Sign_Up_for_Newsletter_();

    _Create_New_Customer_Account.Click__Create_an_Account_();



@pytest.mark.usefixtures("driver")
def test_OpenCreateNewCustomerAccountpageGotopagePositiveEnterFirstNamePositiveEnterLastNamePositiveEnte3(driver):
    
    _Create_New_Customer_Account = pages.Create_New_Customer_Account.Create_New_Customer_Account(driver);
    _Create_New_Customer_Account.GoToUrl();

    _Create_New_Customer_Account.Enter_First_Name("Xavier");

    _Create_New_Customer_Account.Enter_Last_Name("Balistreri");

    _Create_New_Customer_Account.Enter_Email("huw.price@outlook.com");

    _Create_New_Customer_Account.Enter_Password("gD8DrWYorc");

    _Create_New_Customer_Account.Enter__Confirm_Password_("#!_ @");



@pytest.mark.usefixtures("driver")
def test_OpenCreateNewCustomerAccountpageGotopagePositiveEnterFirstNamePositiveEnterLastNamePositiveEnte4(driver):
    
    _Create_New_Customer_Account = pages.Create_New_Customer_Account.Create_New_Customer_Account(driver);
    _Create_New_Customer_Account.GoToUrl();

    _Create_New_Customer_Account.Enter_First_Name("Maxime");

    _Create_New_Customer_Account.Enter_Last_Name("Rath");

    _Create_New_Customer_Account.Enter_Email("huw.price@outlook.com");

    _Create_New_Customer_Account.Enter_Password("#!_ @");



@pytest.mark.usefixtures("driver")
def test_OpenCreateNewCustomerAccountpageGotopagePositiveEnterFirstNamePositiveEnterLastNameNegativeEnte(driver):
    
    _Create_New_Customer_Account = pages.Create_New_Customer_Account.Create_New_Customer_Account(driver);
    _Create_New_Customer_Account.GoToUrl();

    _Create_New_Customer_Account.Enter_First_Name("Makayla");

    _Create_New_Customer_Account.Enter_Last_Name("Kassulke");

    _Create_New_Customer_Account.Enter_Email("huw.price");



@pytest.mark.usefixtures("driver")
def test_OpenCreateNewCustomerAccountpageGotopagePositiveEnterFirstNameNegativeEnterLastNameError(driver):
    
    _Create_New_Customer_Account = pages.Create_New_Customer_Account.Create_New_Customer_Account(driver);
    _Create_New_Customer_Account.GoToUrl();

    _Create_New_Customer_Account.Enter_First_Name("Brandt");

    _Create_New_Customer_Account.Enter_Last_Name("");



@pytest.mark.usefixtures("driver")
def test_OpenCreateNewCustomerAccountpageGotopagePositiveEnterFirstNameNegativeEnterLastNameError1(driver):
    
    _Create_New_Customer_Account = pages.Create_New_Customer_Account.Create_New_Customer_Account(driver);
    _Create_New_Customer_Account.GoToUrl();

    _Create_New_Customer_Account.Enter_First_Name("Viola");

    _Create_New_Customer_Account.Enter_Last_Name("#!_ @");



@pytest.mark.usefixtures("driver")
def test_OpenCreateNewCustomerAccountpageGotopageNegativeEnterFirstNameError(driver):
    
    _Create_New_Customer_Account = pages.Create_New_Customer_Account.Create_New_Customer_Account(driver);
    _Create_New_Customer_Account.GoToUrl();

    _Create_New_Customer_Account.Enter_First_Name("");



@pytest.mark.usefixtures("driver")
def test_OpenCreateNewCustomerAccountpageGotopageNegativeEnterFirstNameError1(driver):
    
    _Create_New_Customer_Account = pages.Create_New_Customer_Account.Create_New_Customer_Account(driver);
    _Create_New_Customer_Account.GoToUrl();

    _Create_New_Customer_Account.Enter_First_Name("#!_ @");



