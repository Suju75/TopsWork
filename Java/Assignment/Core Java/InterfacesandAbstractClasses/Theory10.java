package com.InterfacesandAbstractClasses;

public class Theory10 {

}


//10. Interfaces and Abstract Classes.

/*

1) Questions :-  Abstract Classes and Methods.

Abstraction:Hiding details Show only essential info abstraction is use with class and method.

use with class :

1.abstract class cannot have object
2.must inherit into some other class


	use with method: 
	1.Abstract methods do not specify a body
	2.must override into child class
	3.The abstract method can only be defined by an 
	  abstract class


*/


//--------------------------------------------------------------------------------------------------------------------------------------------------------------


/*
 
 2) Interfaces: Multiple Inheritance in Java.
 
 1.same as class but we cannot create object of interface.
 
 2.interface contains only data member and member function.
 
 3.all data are final by default.
 
 4.all functions are abstract by default.
 
 5.main purpose is to resolve problem of multiple inheritance.
 
 6.use "implements" keyword to inherit interface.
 
 7.pure data hiding .
 
 */


//--------------------------------------------------------------------------------------------------------------------------------------------------------------


/*
 3) Implementing Multiple Interfaces.
 
Java allows a class to implement multiple interfaces to achieve multiple inheritance.
Interfaces define methods that must be implemented by the class, ensuring consistent behavior across different classes.


Use the implements Keyword:

A class implements interfaces by using the implements keyword followed by a comma-separated list of interfaces.
Implement All Methods:

The implementing class must provide concrete implementations for all abstract methods declared in the interfaces.

Interfaces cannot have instance variables, only constants (static final fields).

Multiple Interfaces Allowed:
A single class can implement any number of interfaces.

Method Signature Conflict:
If two interfaces have methods with the same signature, the implementing class provides a single implementation.

 */


//--------------------------------------------------------------------------------------------------------------------------------------------------------------

