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

//https://curiosity.partner.testinsights.io/app/#!/model-engine/guid/811c6b95-bc39-4737-bd73-5df80b877c17
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 7431, profileId = 113983)
public class RhysLinaModellingChallenge_UserStories extends TestBase
{
    

    
    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "df95b6b4-b801-4da1-85d8-eefc58c2f459")
    public void GoToUrlNegativeEnterFirstnameUnsuccessful()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("f30342ae-8d25-4a20-a864-3ffcaf66e2a3");
    _Hyperon_Demo_App.Enter_First_name("");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "86554b1b-b652-4537-a251-7fcf30e9a15c")
    public void GoToUrlPositiveEnterFirstnameNegativeEnterLastnameUnsuccessful()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("21474406-32f4-4c5c-b505-d7cb45f0e28c");
    _Hyperon_Demo_App.Enter_Last_name("#!_ @");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "8c4a84f8-7836-473e-ac2f-7942f677bbd6")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthUnsuccessful()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "2204e787-ab10-4ede-b8ca-0e70c9602cb2")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemaleNegativeEnterZipc()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("969206a5-e92f-41f4-937f-4cc627021af8");
    _Hyperon_Demo_App.Enter_Zip_code("");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "53617bfc-df8a-4f54-b84c-0905e988edb5")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZipc()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("a72b7e82-b5f2-4280-b3c5-6408dbba56af");
    _Hyperon_Demo_App.Enter_City("#!_ @");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "b294daf7-f025-4963-b286-9853f6761c36")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZipc1()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("a72b7e82-b5f2-4280-b3c5-6408dbba56af");
    _Hyperon_Demo_App.Enter_City("");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "186f814b-554f-4abc-8f59-e1bf67772db5")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZipc2()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "803a6a73-2b4c-4669-a886-507ea3784ea0")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZipc3()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "3a5b4d2f-0264-4bf8-bc81-6e4166413f22")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZipc4()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "e1b3a63b-ea01-4283-9c42-3a008991ea88")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "3d91f8d1-4e71-4f33-91ff-108bcf6d1303")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip1()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "12c2fc1a-e52f-4839-9f43-cc8060f75b36")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip2()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "6175dbcd-cefe-424b-a05b-cdb127bdae53")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip3()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "ff5aa0b7-b81c-437f-a9f1-f8a282cf52ca")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip4()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "72128581-d0fd-430c-a33d-d0e518a9c3f3")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip5()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "40892a98-0a7d-41d8-81ad-128e9d5ff617")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip6()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "ca244567-c8ad-4c35-9872-ce8ef4d066a5")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip7()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "81a01e82-9796-4bcc-a281-5e36fa27f3f3")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip8()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "89f262e9-4545-49ec-82e4-b222e035eefa")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip9()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "370b57d8-d56c-45af-a92e-9774152b784b")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip10()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "16b0acaa-f2ca-4239-8bd8-d0a1b62c4abb")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip11()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "0ed7f103-b959-4ea1-aae1-6067ecc54a7c")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip12()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "e3492ba0-7cdb-46b6-9f04-53025996de4a")
    public void GoToUrlPositiveEnterFirstnameNegativeEnterLastnameUnsuccessful1()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("21474406-32f4-4c5c-b505-d7cb45f0e28c");
    _Hyperon_Demo_App.Enter_Last_name("");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "be84f57a-e5a9-46d3-a2aa-e7954352de9d")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip13()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "e2daace8-0394-4c47-b070-1c9229ac604e")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip14()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "d711a5f4-1db2-4b5c-97b1-f6158b7a6501")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip15()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "eaea3410-6276-4fd3-8bc6-ee85e6633c09")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip16()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "b13f392d-29c1-485b-aa1c-8415610f4871")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip17()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "946256e6-aca5-43ca-aed0-cfef8b9a5f76")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip18()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "704894af-f446-4bc4-aebb-ea3a7a4bd9a5")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip19()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "0b3ea3e3-2dff-466a-bd72-4aa272e902a1")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip20()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "9f09a8a2-6dc5-4ce0-8af6-80a3aa1e3c02")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip21()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "34cc0457-1228-497e-a5c5-719df028f666")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip22()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "60a5fd80-5045-4763-8ef1-34429aea738c")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemalePositiveEnterZip23()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("3807955e-a462-4c33-be28-498d90e9f3f0");
    _Hyperon_Demo_App.Enter_Zip_code("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (Sex==" & <Gender> & ") and (DateOfBirth==" & <Date of Birth> & ")&random&col=4","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("80d2bca2-219d-4098-9170-e33ef32b8786");
    _Hyperon_Demo_App.Enter_City("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ")&random&col=5","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("608bde9b-090c-4798-9016-6b68ba824e6a");
    _Hyperon_Demo_App.Enter_Street("123 Main Avenue");

    TestModellerLogger.SetLastNodeGuid("84d970ce-8b0f-4147-bfa7-14632ee3ecae");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ")&random&col=7","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("f434d49a-de63-4c01-bfa9-d15e006024eb");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ") and (DateOfBirth==" & <Date of Birth> & ") and (Sex==" & <Gender> & ") and (ZipCode==" & <Zip Code> & ") and (City==" & <City> & ") and (StreetAddress==" & <Street Address> & ") and (NoAccidents==" & <Number_of_Accidents> & ")&random&col=8","NotFound","ResolveError")'. Expected cell ref or constant literal");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "5c2f380e-aae9-446c-b2b7-deaf28ec9332")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickFemaleNegativeEnterZip()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("8bce086e-830b-4601-8f13-06c467d7563f");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("969206a5-e92f-41f4-937f-4cc627021af8");
    _Hyperon_Demo_App.Enter_Zip_code("#!_ @");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "d5ba3d89-24f9-4e81-af22-acc3146b31d7")
    public void GoToUrlPositiveEnterFirstnamePositiveEnterLastnameEnterDateofBirthClickMaleNegativeEnterZipco()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("7bff943c-977a-40fa-8432-f20b730179c3");
    _Hyperon_Demo_App.Enter_First_name("False");

    TestModellerLogger.SetLastNodeGuid("46d7c15a-892f-42fc-85ed-78eddb64927b");
    _Hyperon_Demo_App.Enter_Last_name("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ")&random&col=1","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("28b3c3ab-1197-4a95-a717-d9a605e18c4b");
    _Hyperon_Demo_App.Enter_Drivers_Age("Parse error near char 47 '<' in specified formula 'RESOLVELIST("listId=2157&where=(FirstName==" & <First Name> & ") and (LastName==" & <Last Name> & ")&random&col=3","NotFound","ResolveError")'. Expected cell ref or constant literal");

    TestModellerLogger.SetLastNodeGuid("3ecb59d3-c4b5-4e93-9f25-91c6117a9f88");
    _Hyperon_Demo_App.Click__Male_();

    TestModellerLogger.SetLastNodeGuid("969206a5-e92f-41f4-937f-4cc627021af8");
    _Hyperon_Demo_App.Enter_Zip_code("");

    }


    @Test  (groups= {"Rhys / Lina - Modelling Challenge","Rhys / Lina - Modelling Challenge - User Stories"})
    @TestModellerPath(guid = "7c93932a-b650-47e6-9776-ad3a28e588cf")
    public void GoToUrlNegativeEnterFirstnameUnsuccessful1()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("f5e9c4f7-beb9-48cc-91ef-01cb9164734d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("f30342ae-8d25-4a20-a864-3ffcaf66e2a3");
    _Hyperon_Demo_App.Enter_First_name("#!_ @");

    }


}