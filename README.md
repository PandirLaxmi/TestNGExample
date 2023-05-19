# TestNGExample
test NG examples


use of maven
1. Dependency management
2. project structure
3. build automation


features of a test framework
1. Execution of set of test cases (ex - only criticle test)
2. Better reporting
3. Grouping of test cases :- @Test(groups = "Chirag", priority = 2 , dependsOnMethods = "verigyUserCanChangeQuantityOfItem")
4. Data driven Testing
5. Passing the external parameters from runner file:- @Parameters("browser") and then pass the paramete in the method and use
6. Parallel Execution- <suite name="Automation Execution" verbose="1" parallel="methods" thread-count="3"> By default thread-count is 5.
7. Assertion
8. Before/ After
9. Cloud Execution :- Saucelab
10. dependency := @Test(groups = "Chirag", priority = 2 , dependsOnMethods = "verifyUserCanChangeQuantityOfItem")
11. priority := @Test(groups = "Chirag", priority = 2 , dependsOnMethods = "verifyUserCanChangeQuantityOfItem")
12. Soft assert


* TestNG is the prior version of jUnit*

feature of testNG
Runner
grouping of the test cases
Parallel execution
before after
cloud Execution


Title - Verify Login Successful
1. open website
2. login with valid credentials
3. verify user is on home page