package com.ExceptionHandling;

public class Theory12 {

}

//12. Exception Handling



/*

1) Questions :- Types of Exceptions: Checked and Unchecked

1. Checked Exceptions:

Checked exceptions are exceptions that are checked at compile-time by the compiler.
The program will not compile unless these exceptions are either handled using a try-catch block or declared using 
the throws keyword. 


2. Unchecked Exceptions:

Unchecked exceptions are exceptions that occur at runtime and are not checked at compile-time. These are also called runtime exceptions.


*/

//--------------------------------------------------------------------------------------------------------------------------------------------------------------


/*
2) Questions :- try,catch, finally, throw, throws .

1. try Block
Definition: The try block contains code that might throw an exception.

2. catch Block
Definition: The catch block handles exceptions thrown by the try block.

3. finally Block
Definition: The finally block contains code that will always execute after the try block, regardless of whether an exception occurred or not.

4. throw Keyword
Definition: The throw keyword is used to explicitly throw an exception from a method or block of code.

5. throws Keyword
Definition: The throws keyword is used to declare exceptions in the method signature, indicating that the method might throw those exceptions.


*/

//---------------------------------------------------------------------------------------------------------------------------------------------------------------


/*

3) Questions :-Custom Exception Classes.

Custom Exception Classes in Java:

In Java, you can create your own exception classes, called custom exceptions or user-defined exceptions, to represent specific error scenarios in 
your application. These classes extend the Exception class (for checked exceptions) or the RuntimeException class (for unchecked exceptions).


Steps to Create a Custom Exception:

1) Extend the Exception class (for a checked exception) or RuntimeException class (for an unchecked exception).
2) Add a constructor to pass custom error messages to the parent class.
3) Optionally override methods like toString() or getMessage() to provide more details.

*/

//--------------------------------------------------------------------------------------------------------------------------------------------------------------

