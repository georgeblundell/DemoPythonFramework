from selenium.webdriver.common.by import By
from selenium import webdriver
from selenium.webdriver.support.ui import Select

# https://curiosity.partner.testinsights.io/app/#!/module-collection/guid/2f411ddc-280c-424d-a534-4a1554de381d
class Create_New_Customer_Account(object):
    
    First_NameElem = (By.XPATH, "//label[normalize-space()= 'First Name']/../div/input")

    Last_NameElem = (By.XPATH, "//label[normalize-space()= 'Last Name']/../div/input")

    _Sign_Up_for_Newsletter_Elem = (By.XPATH, "//label[normalize-space()= 'Sign Up for Newsletter']/../input")

    _Allow_remote_shopping_assistance_Elem = (By.XPATH, "//label[normalize-space()= 'Allow remote shopping assistance']/../input[1]")

    EmailElem = (By.XPATH, "//label[normalize-space()= 'Email']/../div/input")

    PasswordElem = (By.XPATH, "//label[normalize-space()= 'Password']/../div/input")

    _Confirm_Password_Elem = (By.XPATH, "//label[normalize-space()= 'Confirm Password']/../div/input")

    _Create_an_Account_Elem = (By.XPATH, "//BUTTON[@title='Create an Account']")
    
    def __init__(self, driver):
        self.driver = driver
	
    
    def GoToUrl(self):
        self.driver.get('https://magento.nublue.co.uk/customer/account/create/')
    
    def AssertUrl(self):
        assert self.driver.current_url == 'https://magento.nublue.co.uk/customer/account/create/'

    def Enter_First_Name(self, text):
        self.driver.find_element(self.First_NameElem[0], self.First_NameElem[1]).send_keys(text)

    def Enter_Last_Name(self, text):
        self.driver.find_element(self.Last_NameElem[0], self.Last_NameElem[1]).send_keys(text)

    def Click__Sign_Up_for_Newsletter_(self):
        self.driver.find_element(self._Sign_Up_for_Newsletter_Elem[0], self._Sign_Up_for_Newsletter_Elem[1]).click()

    def Click__Allow_remote_shopping_assistance_(self):
        self.driver.find_element(self._Allow_remote_shopping_assistance_Elem[0], self._Allow_remote_shopping_assistance_Elem[1]).click()

    def Enter_Email(self, text):
        self.driver.find_element(self.EmailElem[0], self.EmailElem[1]).send_keys(text)

    def Enter_Password(self, text):
        self.driver.find_element(self.PasswordElem[0], self.PasswordElem[1]).send_keys(text)

    def Enter__Confirm_Password_(self, text):
        self.driver.find_element(self._Confirm_Password_Elem[0], self._Confirm_Password_Elem[1]).send_keys(text)

    def Click__Create_an_Account_(self):
        self.driver.find_element(self._Create_an_Account_Elem[0], self._Create_an_Account_Elem[1]).click()

testy test   