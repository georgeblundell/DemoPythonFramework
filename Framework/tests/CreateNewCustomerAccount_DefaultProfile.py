import pytest


import pages.Create_New_Customer_Account


#https://curiosity.partner.testinsights.io/app/#!/model-engine/guid/d445062d-f72c-417b-abdc-6ae4ace4bb24


@pytest.mark.usefixtures("driver")
def test_OpenCreateNewCustomerAccountpageGotopagePositiveEnterFirstNamePositiveEnterLastNamePositiveEnte(driver):
    
    _Create_New_Customer_Account = pages.Create_New_Customer_Account.Create_New_Customer_Account(driver);
    _Create_New_Customer_Account.GoToUrl();

    _Create_New_Customer_Account.Enter_First_Name("Alexandrine");

    _Create_New_Customer_Account.Enter_Last_Name("Boyer");

    _Create_New_Customer_Account.Enter_Email("huw.price@outlook.com");

    _Create_New_Customer_Account.Enter_Password("Qu3PX4D1CZ");

    _Create_New_Customer_Account.Enter__Confirm_Password_("BL0bkBLSe4");

    _Create_New_Customer_Account.Click__Create_an_Account_();



@pytest.mark.usefixtures("driver")
def test_OpenCreateNewCustomerAccountpageGotopagePositiveEnterFirstNamePositiveEnterLastNamePositiveEnte1(driver):
    
    _Create_New_Customer_Account = pages.Create_New_Customer_Account.Create_New_Customer_Account(driver);
    _Create_New_Customer_Account.GoToUrl();

    _Create_New_Customer_Account.Enter_First_Name("Boris");

    _Create_New_Customer_Account.Enter_Last_Name("Hoeger");

    _Create_New_Customer_Account.Enter_Email("huw.price@outlook.com");

    _Create_New_Customer_Account.Enter_Password("ADPoFPDdmR");

    _Create_New_Customer_Account.Enter__Confirm_Password_("XTgRtVR_W8");

    _Create_New_Customer_Account.Click__Allow_remote_shopping_assistance_();

    _Create_New_Customer_Account.Click__Create_an_Account_();



@pytest.mark.usefixtures("driver")
def test_OpenCreateNewCustomerAccountpageGotopagePositiveEnterFirstNamePositiveEnterLastNamePositiveEnte2(driver):
    
    _Create_New_Customer_Account = pages.Create_New_Customer_Account.Create_New_Customer_Account(driver);
    _Create_New_Customer_Account.GoToUrl();

    _Create_New_Customer_Account.Enter_First_Name("Leila");

    _Create_New_Customer_Account.Enter_Last_Name("Gutmann");

    _Create_New_Customer_Account.Enter_Email("huw.price@outlook.com");

    _Create_New_Customer_Account.Enter_Password("zQxw28PMKX");

    _Create_New_Customer_Account.Enter__Confirm_Password_("z1Kpm0Evkj");

    _Create_New_Customer_Account.Click__Sign_Up_for_Newsletter_();

    _Create_New_Customer_Account.Click__Create_an_Account_();



@pytest.mark.usefixtures("driver")
def test_OpenCreateNewCustomerAccountpageGotopagePositiveEnterFirstNamePositiveEnterLastNamePositiveEnte3(driver):
    
    _Create_New_Customer_Account = pages.Create_New_Customer_Account.Create_New_Customer_Account(driver);
    _Create_New_Customer_Account.GoToUrl();

    _Create_New_Customer_Account.Enter_First_Name("Stan");

    _Create_New_Customer_Account.Enter_Last_Name("Conroy");

    _Create_New_Customer_Account.Enter_Email("huw.price@outlook.com");

    _Create_New_Customer_Account.Enter_Password("SNkLEVtTKN");

    _Create_New_Customer_Account.Enter__Confirm_Password_("#!_ @");



@pytest.mark.usefixtures("driver")
def test_OpenCreateNewCustomerAccountpageGotopagePositiveEnterFirstNamePositiveEnterLastNamePositiveEnte4(driver):
    
    _Create_New_Customer_Account = pages.Create_New_Customer_Account.Create_New_Customer_Account(driver);
    _Create_New_Customer_Account.GoToUrl();

    _Create_New_Customer_Account.Enter_First_Name("George");

    _Create_New_Customer_Account.Enter_Last_Name("Bogisich");

    _Create_New_Customer_Account.Enter_Email("huw.price@outlook.com");

    _Create_New_Customer_Account.Enter_Password("#!_ @");



@pytest.mark.usefixtures("driver")
def test_OpenCreateNewCustomerAccountpageGotopagePositiveEnterFirstNamePositiveEnterLastNameNegativeEnte(driver):
    
    _Create_New_Customer_Account = pages.Create_New_Customer_Account.Create_New_Customer_Account(driver);
    _Create_New_Customer_Account.GoToUrl();

    _Create_New_Customer_Account.Enter_First_Name("Sydnie");

    _Create_New_Customer_Account.Enter_Last_Name("Bosco");

    _Create_New_Customer_Account.Enter_Email("huw.price");



@pytest.mark.usefixtures("driver")
def test_OpenCreateNewCustomerAccountpageGotopagePositiveEnterFirstNameNegativeEnterLastNameError(driver):
    
    _Create_New_Customer_Account = pages.Create_New_Customer_Account.Create_New_Customer_Account(driver);
    _Create_New_Customer_Account.GoToUrl();

    _Create_New_Customer_Account.Enter_First_Name("Chanel");

    _Create_New_Customer_Account.Enter_Last_Name("");



@pytest.mark.usefixtures("driver")
def test_OpenCreateNewCustomerAccountpageGotopagePositiveEnterFirstNameNegativeEnterLastNameError1(driver):
    
    _Create_New_Customer_Account = pages.Create_New_Customer_Account.Create_New_Customer_Account(driver);
    _Create_New_Customer_Account.GoToUrl();

    _Create_New_Customer_Account.Enter_First_Name("Betty");

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



