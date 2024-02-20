# Lab 2 – Test Driven Development
Test Driven development is a crucial skill that every engineer needs to understand. In this lab, you will be given a Java library with three individual java classes that need to be fully tested. The “Before you begin” section of this lab will tell you the tools that should be installed and the “Getting Started” section will contain the commands or helpful hints for running the test suites. This lab can either be done in your windows or your Linux VM. Macs should work but its untested.
After you are set up, the lab’s repo is forked, and can run the tests, make necessary modifications to each file and unit tests as described in the Task sections.
Commit your changes to your Github repository for grading.
# Getting Started
Please fork the repository to your personal username and make sure that you give me permissions to view the project. After you have forked, in your Linux VM, you should clone using Intellij. This project uses intellj, maven, and java. If you don’t have these, the Week 4 In class exercise contains instructions to install on Linux.

Once cloned, right click on pom.xml and select “Add as Maven Project”. This will tell IntelliJ where all the source code is and assist in running it. Next, we will want to run the unit-tests. Many will fail. Right click on src/test/java and select “Run Tests”.
# Tasks
## Task 1
Task One is a collection of 2 files: Task1.java and Task1UnitTests.java.
In this task, you are given slightly incorrect logic for each method in Task1.java but correct Unit Tests. The goal of this task is to correct the logic in Task 1.java so that ALL the tests are passing. In TDD, tests are usually written first and define the behavior that would be expected. In this case, the someone has modified the code to be incorrect and its your job to identify the errors.

Hint: Be sure to check the documentation of each method. It should tell you how the method should behave. You’re also welcome to look at the tests, but you should NOT be modifying them.

You are not allowed to change the parameters or outputs, only the logic of the methods defined in Task1.java. Grading will use an unmodified version of Task1UnitTests.java.
## Task 2
Task Two is a collection of 2 files: Task2.java and Task2UnitTests.java.

Like Task 1, you are given a full test suite of proper tests but unlike Task 1, there is no incorrect logic. In fact, there is no logic at all. There are not even hints in the documentation! Your task is to read the tests and fill out the logic for each method.

Often in Software Engineering, you are asked to reimplement a certain section of code with new logic that utilizes different techniques or software libraries. Usually, the same exact behavior is desired but for whatever reason (license restrictions, major vulnerabilities, mean tech leads), the existing implementation isn’t good enough and you have very little to go off but the tests you were given. In a perfect world, you would have the original requirements to fall back on but this isn’t a perfect world and all you have are the tests.

You are not allowed to change the parameters or outputs, only the logic of the methods defined in Task2.java. Again, you’re also welcome to look at the tests, but you should NOT be modifying them. Grading will use an unmodified version of Task2UnitTests.java.
## Task 3
Task Two is a collection of 2 files: Task3.java and Task3UnitTests.

There will come a time where additional tests need to be written for an existing code base. This can happen when time does not a lot for true TDD or when a critical failure has made clear that the automated testing suite is not robust enough. In this task, you will reverse engineer a few code samplings and write tests to make sure ALL the logic is hit on these methods. Getting code coverage to 100% is a worthy goal, though sometimes impossible. In this small setting though, its very achievable.

In addition to making tests that pass, you need to use IntelliJ’s built in code coverage tool. Right click on src/test/java and select run > More Run/Debug > Run “All Tests” with Code Coverage. This should show how covered the java code is. For this task, you are aiming between 90-100%. You also should be testing various scenarios including null and empty strings.

You should only be modifying Task3UnitTests in this section. Grading will use an unmodified version of Task3.java.

