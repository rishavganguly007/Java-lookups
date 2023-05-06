	Core Java 8 Lab Book 
# <a name="_toc209693801"></a><a name="_toc209695352"></a><a name="_toc209696374"></a><a name="_toc209696491"></a><a name="_toc221416213"></a><a name="_toc221416299"></a><a name="_toc221417669"></a><a name="_toc221417700"></a><a name="_toc296079589"></a><a name="_toc46500703"></a>**Document Revision History**



























# <a name="_toc46500713"></a>**Lab 4: Inheritance and Polymorphism**

**-------------------------Optional-----------------------------------------------------------------------**

**Exercise1:**   Create Person and Account Class as shown below in class diagram. Ensure minimum balance of INR 500 in a bank account is available.


![Aspose Words 59ca0026-7b6b-44a0-b725-240a4cd14fc1 004](https://user-images.githubusercontent.com/79499308/236642328-aefaba5c-05c3-473b-acf6-952523c2f3fb.png)

<a name="_toc372543068"></a>**Figure 14: Association of person with account class**

1) Create Account for smith with initial balance as INR 2000 and for Kathy with initial balance as 3000.(accNum should be auto generated).
1) Deposit 2000 INR to smith account.
1) Withdraw 2000 INR from Kathy account.
1) Display updated balances in both the account.
1) Extend the functionality through Inheritance and polymorphism. Inherit two classes Savings Account and Current Account from account class. And Implement the following in the respective classes.

- **Savings Account**
1. Add a variable called minimum Balance and assign final modifier.
1. Override method called withdraw (This method should check for minimum balance and allow withdraw to happen)

- **Current Account**
1. Add a variable called overdraft Limit
1. Override method called withdraw (checks whether overdraft limit is reached and returns a Boolean value accordingly)





**Exercise 2:**	 create packages and classes as given below:

1) **com.cg.eis.bean**

`	`In this package, create “Employee” class with different attributes such as id, name, salary, designation, insuranceScheme.

1) **com.cg.eis.service**

`		`This package will contain code for services offered in Employee Insurance System. The service class will have one EmployeeService Interface and its corresponding implementation class.

The services offered by this class are:

1) Get employee details from user.
1) Find the insurance scheme for an employee based on salary and designation.
1) Display all the details of an employee.
1) **com.cg.eis.pl**

`		`This package will contain code for getting input from user, produce expected output to the user and invoke services offered by the system. 

**-------------------------------Mandatory------------------------------------------------------------------------**

**Exercise 3:**  Using an inheritance hierarchy, design a Java program to model items at a library (books, journal articles, videos and CDs.) Have an abstract superclass called Item and include common information that the library must have for every item (such as unique identification number, title, and number of copies). No actual objects of type Item will be created - each actual item will be an object of a (non-abstract) subclass. Place item-type-specific behavior in subclasses (such as a video's year of release, a CD's musical genre, or a book's author).
More in detail:

1\. Implement an abstract superclass called Item and define all common operations on this class (constructors, getters, setters, equals, toString, print, checkIn, checkOut, addItem, etc). Have private data for: identification number, title, and number of copies.

2\. Implement an abstract subclass of Item named WrittenItem and define all common operations on this class. Added private data for author.

3\. Implement 2 subclasses of WrittenItem: Book and JournalPaper.


3\.1. Class Book: no new private data. When needed, override/overload methods from the superclass.
3\.2. Class JournalPaper: added private data for year published. When needed, override/overload methods from the superclass.


4\. Implement another abstract subclass of Item named MediaItem and define all common operations on this class. Added private data for runtime (integer).

5\. Implement 2 subclasses of MediaItem: Video and CD.

5\.1. Class Video: added private data for director, genre and year released. When needed, override/overload methods from the superclass.
5\.2. Class CD: added private data for artist and genre. When needed, override/overload methods from the superclass.

Write the definitions of these classes and a client program (your choice!) showing them in use.

**Note: Complete this exercise on Doselect.**               

# <a name="_toc46500714"></a>**Lab 5: Exception Handling**

**Exercise** 1:  Validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15.

**Note: Complete this exercise on Doselect.              Doselect Age Exception**

**Exercise 2:** Write a Java Program to validate the full name of an employee. Create and throw a user defined exception if firstName and lastName is blank.

**Note: Complete this exercise on Doselect.               Doselect    Name Exception**

**Exercise 3:**  Create an Exception class named as “EmployeeException”(User defined Exception) in a package named as “com.cg.eis.exception” and throw an exception if salary of an employee is below than 3000. Use Exception Handling mechanism to handle exception properly.

# <a name="_toc46500715"></a>**Lab 6: Collection Framework**
**-----------------------------Mandatory------------------------------------------------------------------------------------**

**Exercise 1**: Create a method which accepts a hash map and return the values of the map in sorted order as a List.


|Method Name |getValues |
| :- | :- |
|Method Description |Get the values of a map in sorted order |
|Argument |HashMap |
|Return Type |List |
|Logic |Return the values of a hash map in sorted order |

**Note: Complete this exercise on Doselect.                     [DoSelect-Lab7\_1 ]**

**Exercise2 Collection:** Create a method that accepts a character array and count the number of times each character is present in the array.

**Note: Complete this exercise on Doselect.                     [DoSelect-Lab3\_4]**


|Method Name |countChars|
| :- | :- |
|Method Description |method that accepts a character array and count the number of times each character is present in the array.|
|Argument |char[] arr|
|Return Type |Map<Character, Integer>|
|Logic ||

**Exercise 3:** Create a method which accepts an array of numbers and returns the numbers and their squares in Hashmap

|Method Name|getSquares|
| :- | :- |
|Method Description|Accepts a list of numbers and return their squares|
|Argument|int[]|
|Return Type|Map|
|Logic|<p>Iterate through the list, find the square of each</p><p>number and add the elements to a map object</p><p>with the number as the key and the square as the value</p>|

**Note: Complete this exercise on Doselect.                     [DoSelect-Lab7\_3]**

**Exercise 4:**  school offers medals to the students of tenth based on the following criteria 

If(Marks>=90) : Gold 

If(Marks between 80 and 90) : Silver 

If(Marks between 70 and 80) : Bronze 

**Note:** Marks between 80 and 90 means à marks>=80 and marks<90 

Write a function which accepts the marks of students as a Hashmap and return the details of the students eligible for the medals along with type of medal. 

The input Hashmap contains the student registration number as key and mark as value. 

The output Hashmap should contain the student registration number as key and the medal type as value.

|Method Name |getStudents |
| :- | :- |
|Method Description |Generate the list of students eligible for scholarship |
|Argument |Hashmap |
|Return Type |Hashmap |
|Logic |The method should return the details of the students eligible for the medals along with the medal type. |

**Exercise 5:** Create a method which accepts an array of integer elements and return the second smallest element in the array


|Method Name ||getSecondSmallest |
| :- | :- | :- |
|Method Description ||Get the second smallest element in the array |
|Argument ||int[] |
|Return Type ||int |
|Logic ||<p>Sort the array and return the second smallest element in the array Hint: 1. Convert to Array List 2. Use sort method in Collections class </p><p></p>|



**Exercise 6:** Create a method which accepts the id and the age of people as a Map and decide if they are eligible for vote. A person is eligible for vote if his age is greater than 18. Add the IDs of all the eligible persons to list and return the list. 


|Method Name |votersList |
| :- | :- |
|Method Description |Generate the list of voters based on the ages of the people |
|Argument |Map |
|Return Type |List |
|Logic |Accept a map with ID as key and Date of Birth as value and check if the person is eligible to vote. A person is eligible for vote for if his age is greater than 18. If the person is eligible add his ID to the list. |

**Exercise 7:** Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order


|Method Name |getSorted |
| :- | :- |
|Method Description |Return the resulting array after reversing the numbers and sorting it |
|Argument |int [] |
|Return Type |int |
|Logic |<p>Accept and integer array, reverse the numbers in the array, sort it and return the resulting array. </p><p>Hint </p><p>1\. Convert the numbers to String to reverse it </p><p>2\. Use Collection APIs to sort it </p><p></p>|


# <a name="_toc46500716"></a>**Lab 7: Layered Architecture**

Refer the case study and create an application for that requirement by creating packages and classes as given below:

**Case Study:**

1. **Employee Medical Insurance Scheme:**

- By default, all employees in an organization will be assigned with a medical insurance scheme based on the salary range and designation of the employee. 

Refer the below given table to find the eligible insurance scheme specific to an employee.

|**Salary**|**Designation**|**Insurance scheme**|
| - | - | - |
|>5000 and < 20000|System Associate|Scheme C|
|>=20000 and <40000|Programmer|Scheme B|
|>=40000|Manager|Scheme A|
|<5000 |Clerk|No Scheme|

- **com.cg.eis.bean**

`	`In this package, create “Employee” class with different attributes such as id, name, salary, designation, insuranceScheme.

- **com.cg.eis.service**

This package will contain code for services offered in Employee Insurance System. The service class will have one EmployeeService Interface and its corresponding implementation class.

- **com.cg.eis.pl**

This package will contain code for getting input from user, produce expected output to the user and invoke services offered by the system. 

On the basis of above case study implement a class to accept multiple employee details and store all employee objects in a Hashmap. The functionalities need to be implemented are as follows:

- Add employee details to Hashmap.
- Accept insurance scheme from user and display employee details based on Insurance scheme.
- Delete an employee details from map.
- Build Expectation

**Note: Complete this exercise on Doselect.                     [DoSelect-Lab11]**

# <a name="_toc511237892"></a><a name="_toc46500717"></a>**Lab 8: Multithreading**

**Exercise 1**: Write a program to do the following operations using Thread:

- Create an user defined Thread class called as “CopyDataThread .java” .
- This class will be designed to copy the content from one file “source.txt ” to another file “target.txt” and after every 10 characters copied,   “10 characters are copied” message  will be shown to user.(Keep delay of 5 seconds after every 10 characters  read.)
- Create another class “FileProgram.java” which will create above thread. Pass required File Stream classes to   CopyDataThread constructor and implement the above functionality.

**Exercise 2:**  Write a thread program to display timer where timer will get refresh after every 10seconds.( Use Runnable implementation )

**Lab 09: Concurrent Patterns in Java** 

**Exercise 1:** Implement the Multithreading Assignments using Executor, ExecutorService interface.

**Exercise 2:** You are asked to create an application for registering the details of jobseeker. The requirement is:

Username should always end with \_job and there should be at least minimum of 8 characters to the left of \_job. Write a function to validate the same. Return true in case the validation is passed. In case of validation failure return false.
# <a name="_toc511237893"></a><a name="_toc46500718"></a>**Lab 9: Lambda Expressions and Stream API                            -Optional**

**Exercise 1:** Write a lambda expression which accepts x and y numbers and return x<sup>y</sup>.

**Exercise 2:** Write a method that uses lambda expression to format a given string, where a space is inserted between each character of string.  For ex., if input is “CG”, then expected output is “C G”.

**Exercise 3:** Write a method that uses lambda expression to accept username and password and return true or false. (**Hint:** Use any custom values for username and password for authentication)

**Exercise 4:** Write a class with main method to demonstrate instance creation using method reference. (**Hint:** Create any simple class with attributes and getters and setters)

**Exercise 5:** Write a method to calculate factorial of a number. Test this method using method reference feature. 

**Case Study for Steam API:**  

Refer the classes given below to represent employees and their departments.


![Aspose Words 59ca0026-7b6b-44a0-b725-240a4cd14fc1 005](https://user-images.githubusercontent.com/79499308/236642696-40af8cf9-c44c-481b-a83f-be5e55296b4f.jpeg)

**Class Diagram used for Stream API** 

Also refer an EmployeeRepository class which is used to create and populate employee’s collection with sample data.


![Aspose Words 59ca0026-7b6b-44a0-b725-240a4cd14fc1 006](https://user-images.githubusercontent.com/79499308/236642802-2302e632-2273-4c4e-834a-379b3a6f46c3.png)
![Aspose Words 59ca0026-7b6b-44a0-b725-240a4cd14fc1 007](https://user-images.githubusercontent.com/79499308/236642803-ff056a09-9e18-4d8c-938b-5af05b5ea520.png)
![Aspose Words 59ca0026-7b6b-44a0-b725-240a4cd14fc1 008](https://user-images.githubusercontent.com/79499308/236642805-86f1057e-97e5-451b-bcca-79d6e3b33e24.png)

Create an EmployeeService class which queries on collections provided by EmployeeRepository class for following requirements. Create separate method for each requirement. (**Note:** Each requirement stated below must be attempted by using lambda expressions/stream API. It’s mandatory to solve at least 5 questions from following set. However, it is recommended to solve all questions to understand stream API thoroughly).


- Find out the sum of salary of all employees. 
- List out department names and count of employees in each department. 
- Find out the senior most employee of an organization. 
- List employee name and duration of their service in months and days. 
- Find out employees without department.
- Find out department without employees.
- Find departments with highest count of employees.
- List employee name, hire date and day of week on which employee has started. 
- List employee name, hire date and day of week for employee started on Friday. (Hint:  Accept the day name for e.g. FRIDAY and list all employees joined on Friday)
- List employee’s names and name of manager to whom he/she reports. Create a report in format “employee name reports to manager name”.
- List employee name, salary and salary increased by 15%. 
- Find employees who didn’t report to anyone (**Hint:** Employees without manager)  
- Create a method to accept first name and last name of manager to print name of all his/her subordinates.  
- Sort employees by their 
- Employee id
- Department id
- First name

# <a name="_toc46500719"></a>**Lab 10: File Handling                             -			Optional**

**--------------------------File Handling----------------------------------------------------------------------**

**Exercise 1:** Write a Java program that reads a file and displays the file on the screen, with a line number before each line?

Exercise 2: Write a Java program that reads on file name from the user, then displays information about whether the file exists, whether the file is readable, whether the file is writable, the type of file and the length of the file in bytes?  



















# <a name="_toc294878576"></a><a name="_toc297218581"></a><a name="_toc511237894"></a><a name="_toc46500720"></a>**Appendices**

## <a name="_toc294878577"></a><a name="_toc297218582"></a><a name="_toc511237895"></a><a name="_toc46500721"></a>**Appendix A: Naming Conventions**
**Package** names are written in all lower case to avoid conflict with the names of classes or interfaces.Companies use their reversed Internet domain name to begin their package names—for example, com.cg.mypackage for a package named mypackage created by a programmer at cg.com.

Packages in the Java language itself begin with **java. Or javax**.

**Classes and interfaces** The first letter should be capitalized, and if several words are linked together to form the name, the first letter of the inner words should be uppercase (a format that's sometimes called "camelCase"). 

For classes, the names should typically be nouns. For example:

***Dog***

***Account***

***PrintWriter***

For interfaces, the names should typically be adjectives like

***Runnable***

***Serializable***

**Methods** The first letter should be lowercase, and then normal camelCase  rules should be used. In addition, the names should typically be verb-noun pairs. For example:

***getBalance***

***doCalculation***

***setCustomerName***

**Variables** Like methods, the camelCase format should be used, starting with a lowercase letter. Sun recommends short, meaningful names, which sounds good to us. Some examples:

***buttonWidth***

***accountBalance***

***myString***

**Constants** Java constants are created by marking variables static and final. They should be named using uppercase letters with underscore characters as separators:

***MIN\_HEIGHT***


