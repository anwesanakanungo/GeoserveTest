Frame work support :
Framework built using Selenium, Java 11 , Maven, Test NG , Lombok ,JAVA faker , Jackson binding ,allure report .
Frame work support :
 Design pattern used :
1.	Factory design pattern (Browser support , CHORME and Firefox . it can be extended any number of Browsers )
2.	Page objects model  fluent style
3.	3.	Support parallel testing. (Need to update testing.xml <suite name="TestEcommerce" parallel="methods" thread-count="4"> )
4.	Configuration file stored in the resource/config/ config.properites
5.	Static Test like search text ,product details are taken from src/main/resources/jsonfile/testData.json 
6.	Dynamic test data is generated using JAVA faker .
7.	Auto retry is also implemented for the failed test cases.
8.	Install java 11 installed and set JAVA_HOME
9.	Set Maven_home
10.	Check out the code .
11.	mvn clean test
![image](https://github.com/user-attachments/assets/ab8befd8-9817-4474-9f26-1faf7453ad1d)
![image](https://github.com/user-attachments/assets/481ed019-1cba-436c-a880-bc31a9d6c920)

