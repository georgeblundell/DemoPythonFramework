from selenium.webdriver.common.by import By
from selenium import webdriver
from selenium.webdriver.support.ui import Select

# https://curiosity.partner.testinsights.io/app/#!/module-collection/guid/318dc9c4-faf4-4aa0-9ccb-e246dec27fef
class Demo_Import(object):
    
    First_NameElem = (By.XPATH, "//label[normalize-space()= 'First Name']/../div/input")

    Last_NameElem = (By.XPATH, "//label[normalize-space()= 'Last Name']/../div/input")

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

    def Enter_Email(self, text):
        self.driver.find_element(self.EmailElem[0], self.EmailElem[1]).send_keys(text)

    def Enter_Password(self, text):
        self.driver.find_element(self.PasswordElem[0], self.PasswordElem[1]).send_keys(text)

    def Enter__Confirm_Password_(self, text):
        self.driver.find_element(self._Confirm_Password_Elem[0], self._Confirm_Password_Elem[1]).send_keys(text)

    def Click__Create_an_Account_(self):
        self.driver.find_element(self._Create_an_Account_Elem[0], self._Create_an_Account_Elem[1]).click()

testy test   