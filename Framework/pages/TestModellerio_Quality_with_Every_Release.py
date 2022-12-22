from selenium.webdriver.common.by import By
from selenium import webdriver
from selenium.webdriver.support.ui import Select

# https://curiosity.partner.testinsights.io/app/#!/module-collection/guid/3fc3eada-71b7-4c99-8878-d18d962c0ef5
class TestModellerio_Quality_with_Every_Release(object):
    
    Data_ListsElem = (By.XPATH, "//A[@href='#!/tdm/data-lists?filter=null']")

    ExplorerElem = (By.XPATH, "ReplaceIndenfier")

    TestsElem = (By.XPATH, "//A[@href='#!/modeller/tests']")

    Explorer_1Elem = (By.XPATH, "ReplaceIndenfier")

    Data_Lists_1Elem = (By.XPATH, "//A[@href='#!/tdm/data-lists?filter=null']")

    Tests_1Elem = (By.XPATH, "//A[@href='#!/modeller/tests']")
    
    def __init__(self, driver):
        self.driver = driver
	
    
    def GoToUrl(self):
        self.driver.get('https://curiosity.partner.testinsights.io/app/#!/test-modeller/100711')
    
    def AssertUrl(self):
        assert self.driver.current_url == 'https://curiosity.partner.testinsights.io/app/#!/test-modeller/100711'

    def Click_Data_Lists(self):
        self.driver.find_element(self.Data_ListsElem[0], self.Data_ListsElem[1]).click()

    def Click_Explorer(self):
        self.driver.find_element(self.ExplorerElem[0], self.ExplorerElem[1]).click()

    def Click_Tests(self):
        self.driver.find_element(self.TestsElem[0], self.TestsElem[1]).click()

    def Click_Explorer_1(self):
        self.driver.find_element(self.Explorer_1Elem[0], self.Explorer_1Elem[1]).click()

    def Click_Data_Lists_1(self):
        self.driver.find_element(self.Data_Lists_1Elem[0], self.Data_Lists_1Elem[1]).click()

    def Click_Tests_1(self):
        self.driver.find_element(self.Tests_1Elem[0], self.Tests_1Elem[1]).click()

testy test   