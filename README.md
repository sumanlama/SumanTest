# SumanTest

About the Project: This project is to find length and longest word in a sentence(String)

PreRequisite:
1)JDK should be preinstalled(if you don't have JDK then get the latest version from the Oracle site)

Features:
There are two Class in Maven project
1) TestBase.java in src/main/java
TestBase.java has two pubic static methods which accepts string object as a argument
a) lengthOfLongestWord  which returns int type
b) longestWord which returns String type

2) UnitTestCases.java in src/test/java
There are 6 unit test cases which can be tested with diffent data input.
a) All the tests are written using testng annotation
b) Scanner object has been created in this class to get the runtime input from the user.
c) TestNG priority has been used to execute test cases in order.
d) @Test(enabled=false) can be used instead of @Test(priority=num) for skipping the particular test.

Installing:
1) Instal JDK version from Oracle Site
2) Build tool Maven(TestNg Dependency defined in POM.xml)
3) Execution trigger from testng.xml (Run as testng suite)

Running the Tests:
1) Trigger the testscript from testng.xml
2) Provide the user input once the scripts prompts for data in the console
3) Once you see successfull message "Test case completed" repeat the step 2 for the remaining tests.


Thanks Suman Lama
