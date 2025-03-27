package com.OOPS;

public class Theory6 {

}



// 6. Object-Oriented Programming (OOPs) Concepts.

/*
  1) Questions :- BasicsofOOP:Encapsulation, Inheritance, Polymorphism, Abstraction.
  
  1. Encapsulation
  
  Definition:
  Encapsulation is the process of wrapping data (fields) and methods (functions) together in a single unit (class).
  It also involves restricting direct access to some of the object's components by using access modifiers (private, protected, public).
  
 
 2. Inheritance
 
 Definition:
 Inheritance is a mechanism where one class (child class) can acquire the properties and methods of another class (parent class).
 This promotes code reuse and creates a hierarchical relationship between classes.
 
 
 Key Features:
 1) The extends keyword is used to inherit from a parent class.
 2) Supports single and multilevel inheritance in Java.
 
 
  3. Polymorphism.
  
  Definition:
  Polymorphism means "many forms". It allows a single entity (method, operator, or object) to behave differently in different contexts.
  
  
  1)Types of Polymorphism:
  
  Compile-Time Polymorphism (Method Overloading):
  Achieved by defining multiple methods with the same name but different parameter lists.

  2)Run-Time Polymorphism (Method Overriding):
  Achieved when a subclass provides a specific implementation for a method already defined in its superclass.
  
  
  
  4. Abstraction
  Definition:
  Abstraction is the process of hiding implementation details and showing only the essential features of an object. It can be achieved using:

   1)Abstract Classes
   2)Interfaces
  
  
 */


//------------------------------------------------------------------------------------------------------------------------------------------------

/* 
2) Questions :-  Inheritance: Single, Multilevel, Hierarchical.

Types of Inheritance in Java.

Inheritance is a key concept in Object-Oriented Programming (OOP) that allows a class (child class) to inherit 
the properties and behaviors (fields and methods) of another class (parent class). In Java, inheritance promotes
code reusability and helps in creating hierarchical relationships between classes.


1. Single Inheritance
Definition:
In single inheritance, a class (child class) inherits from one parent class. 
This is the most basic form of inheritance where a class extends another single class.


2. Multilevel Inheritance
Definition:
In multilevel inheritance, a class inherits from a parent class, and another class inherits from that class, forming a chain.
It creates a multi-level hierarchy.



3. Hierarchical Inheritance
Definition:
In hierarchical inheritance, multiple classes inherit from a single parent class. 
The parent class is at the top of the hierarchy, and the child classes inherit from it.
 
*/


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------


/*
 * 
 3) Questions :- Method Overriding and Dynamic Method Dispatch.
 
 1. Method Overriding
Method Overriding occurs when a subclass provides its own specific implementation of a method that is already defined in its superclass. 
The overridden method in the subclass must have the same method signature (name, return type, and parameters) as the method in the superclass.

Rules for Method Overriding:

1)The method in the subclass must have the same name, return type, and parameters as the method in the parent class.
2)The overriding method can have a more specific access modifier, but cannot have a more restrictive access modifier 
than the method in the parent class.
3)The overriding method can throw fewer or the same exceptions, but not more than the parent method.
4)The @Override annotation is optional but recommended to ensure correctness.





 Dynamic Method Dispatch:-
 It is a mechanism in Java that allows the Java Virtual Machine (JVM) to determine which method to invoke at runtime rather than at compile time.



 */


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------


