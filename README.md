# Java_TestAutomation_Project_WebUI_API

## Description:

Test Automation project for Web UI and API tests using Java, Selenium Webdriver, TestNG. Project is builed by Maven. Web UI tests are implementes using Selenium Webdriver and PageObjectPattern. API tests are implemented using Jersey. Test results Reports are generated using TestNG.

## Used Technologies/Tools:

Java 8, Selenium Webdriver, TestNG, Apache Maven, XML, Jersey, Git


## To Run the Test Automation Project Locally:

1)	Install Java 8 and Apache Maven
2)	Install Eclipse IDE
3)	Set environment variables JAVA_HOME, M2_HOME and Path, in the Windows environment
4)	Clone locally the repository and open the project using Eclipse IDE
5)  Run mvn install
6)  Download Google Chrome Driver 2.33 from https://www.seleniumhq.org/download/ and save it locally by path D:\SeleniumDr\chromedriver_win32
7)	For run the test suites from Eclipse IDE select the xml test suite and run by Run As> TestNG Suite
* For UI tests > regression-web-ui-tests.xml 
* For API tests > regression-api-tests.xml
* For run both UI and API tests > regression.xml
8)  Reports of the test result are generated on the directory /test-output/emailable-report.htm

![image](https://user-images.githubusercontent.com/6391522/38243925-b7df8828-3741-11e8-989d-f231a101c71e.png)

![image](https://user-images.githubusercontent.com/6391522/38243859-8815f0fa-3741-11e8-8d51-f2f7f70d2e82.png)

