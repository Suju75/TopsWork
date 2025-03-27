package com.PackagesAndAccessModifiers;

public class Theory11 {

}

//11. Packages and Access Modifiers.



/* 
1) Questions :-JavaPackages: Built-in and User-Defined Packages.

 Packages in Java are used to organize classes, interfaces, and sub-packages.
 They help in avoiding name conflicts, providing access protection, and making it easier to locate and use the classes.

    Types of Java Packages:
   
    Built-in Packages
    These are predefined packages that come with the Java Development Kit (JDK). They provide a vast range of functionalities, 
    such as utilities, networking, I/O operations, and more.

    ex: java.lang (default package): Contains fundamental classes like String, Math, Object, etc.
        java.util: Contains utility classes like ArrayList, HashMap, Collections, Date, etc.
        java.io: Contains classes for input and output operations.
        java.net: Contains classes for networking operations like Socket, URL, etc.
        java.sql: Provides classes for database connectivity and operations.

    User-defined Packages
    These are packages created by developers to organize their own classes and interfaces .
*/


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
 
Q2.Access Modifiers: Private, Default, Protected, Public
Ans:
    Access modifiers in Java determine the visibility and accessibility of classes, methods, constructors, and variables.
    There are four types of access modifiers: private, default, protected, and public.

    Private Access Modifier:
    Scope: The member is accessible only within the same class.
    Use: To ensure encapsulation and restrict access.

    Default (No Modifier):
    Scope: The member is accessible only within the same package.
    Use: Suitable for package-private access where encapsulation is not critical.

    Protected Access Modifier:
    Scope:  The member is accessible Within the same package.
            In subclasses in other packages (via inheritance).
    Use: Useful for providing access to subclasses while maintaining some encapsulation.

    Public Access Modifier
    Scope: The member is accessible from anywhere.
    Use: Suitable for classes, methods, and fields that need to be universally accessible.
  
 */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
3) Questions :-Importing Packages and Class path.

1) Importing Packages in Java:
In Java, packages are used to group related classes, and you can import classes from other packages to use them in your program.

2) Class Path in Java:
It defines the location of user-defined classes, libraries, and packages used by your application.

 
*/

//--------------------------------------------------------------------------------------------------------------------------------------------------------------
