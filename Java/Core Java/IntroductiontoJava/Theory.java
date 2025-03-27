package com.IntroductiontoJava;

public class Theory {

}

//1. Introduction to Java.

/*
Question-1) History of Java:

1) Origin and Creator:

Java was developed by James Gosling and his team at Sun Microsystems in the early 1990s.
The project was initially called "Oak", named after an oak tree outside Gosling’s office.
It was later renamed to Java, inspired by Java coffee.


2) Development Timeline:

1991: The "Green Team" started the Oak project, aimed at creating a platform-independent language 
for consumer electronics.
1995: Java was officially launched by Sun Microsystems, with its slogan: "Write Once, Run Anywhere" (WORA).


3)Major Versions:

Java 1.0 (1996): Introduced as a secure, portable, and robust language primarily for web development.
Java 2 (1998): Marked the evolution into three editions:
J2SE (Java Standard Edition): For desktop applications.
J2EE (Java Enterprise Edition): For enterprise-level applications.
J2ME (Java Micro Edition): For mobile and embedded systems.
Java SE 5 (2004): Introduced significant features like generics, enhanced for-loop, and annotations.
Java SE 8 (2014): Added modern features like lambda expressions, the Stream API, and a new date-time API.
Java SE 17 (2021): A Long-Term Support (LTS) release with enhanced performance and modern features.


4) Acquisition by Oracle:

In 2010, Oracle Corporation acquired Sun Microsystems and took over Java's development.


5) Significance and Growth:

Java has become one of the most widely-used programming languages, powering web applications, Android apps,
server-side systems, and large-scale enterprise software.

*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
2)Question:- Features of Java Platform Independent, Object-Oriented, etc.


1)Platform Independent:

Java programs can run on any platform without modification, thanks to the Java Virtual Machine (JVM).
The code is compiled into bytecode, which the JVM interprets, ensuring "Write Once, Run Anywhere" (WORA).


2)Object-Oriented:

Java is based on object-oriented principles like inheritance, polymorphism, encapsulation, and abstraction.
Almost everything in Java is treated as an object, making it modular, reusable, and easier to maintain.

3)Simple:

Java eliminates complexities like pointers (used in C/C++) and includes built-in garbage collection for memory management.
Its syntax is easy to learn, especially for programmers familiar with C or C++.


4)Secure:

Java provides a secure execution environment with features like bytecode verification, sandboxing, and no explicit pointer usage.
It includes APIs for cryptography, secure communication, and user authentication.


5)Robust:

Java emphasizes reliability with features like strong memory management, exception handling, and automatic garbage collection.
It checks code during compile-time and runtime, reducing errors.


6)Multi-threaded:

Java supports concurrent programming, allowing multiple threads to execute simultaneously.
It includes a rich API for thread management and synchronization.


7)Architecture Neutral:

Java's compiled bytecode is not specific to any machine architecture, ensuring portability across devices.


8)Portable:

Java programs can be easily transferred across systems without requiring any changes, thanks to platform independence.


9)High Performance:

While not as fast as languages like C/C++, Java's Just-In-Time (JIT) compiler significantly improves execution speed.


10)Dynamic and Extensible:

Java supports dynamic linking and loading of classes at runtime.
It can integrate native methods written in other languages like C or C++ using the Java Native Interface (JNI).


11)Distributed:

Java facilitates the development of distributed applications through APIs like RMI (Remote Method Invocation) and CORBA.
It supports internet-based applications with built-in networking libraries.


12)Interpreted:

Java bytecode is interpreted by the JVM, allowing it to execute on any machine with a JVM installed.

*/


//------------------------------------------------------------------------------------------------------------------------------------------------------------


/*

Question-3) Understanding JVM,JRE, and JDK.


Java is a platform-independent language, and these three components are crucial to understand its ecosystem.

1. JDK (Java Development Kit).
The JDK is a software development kit required to develop Java applications.
It includes tools for writing, compiling, and debugging Java programs.

Components:
JRE (Java Runtime Environment): For running Java programs.

Compiler (javac): Converts Java code into bytecode.

Debugger: For debugging applications.

Other Tools: Like javadoc, jar, etc.

Use Case:
Used by developers to write and compile Java programs.



2. JRE (Java Runtime Environment).
The JRE provides the runtime environment needed to run Java applications.
It does not include development tools like the compiler.

Components:
JVM (Java Virtual Machine): For executing bytecode.
Libraries: Predefined classes and APIs.

Use Case:
Required by end-users to run Java programs.

3. JVM (Java Virtual Machine).
The JVM is an abstract machine that executes Java bytecode.
It acts as a bridge between Java programs and the underlying operating system.

Key Features:
Class Loader: Loads .class files into memory.
Bytecode Verifier: Ensures bytecode is valid and secure.
Execution Engine: Interprets or compiles bytecode into machine code for execution.

Use Case:
Executes Java programs on any platform with a compatible JVM.

Relationship Between Them
JDK includes JRE and tools for development.
JRE includes JVM and libraries for running applications.
JVM is the core part that actually executes the Java program.



*/



//---------------------------------------------------------------------------------------------------------------------------------------------------



/*

4)-Question  Setting up the Java environment and IDE (e.g., Eclipse).


Step 1: Install Java Development Kit (JDK)
Download the JDK:

Visit the Oracle Java Downloads or OpenJDK.
Choose the latest version compatible with your operating system (Windows, macOS, or Linux).

1)Install the JDK:
Run the downloaded installer and follow the installation wizard.
Note the installation path (e.g., C:\Program Files\Java\jdk-<version>).

2)Set Environment Variables (Windows):
Open System Properties > Advanced > Environment Variables.
Add a new variable:
Variable Name: JAVA_HOME
Variable Value: Path to the JDK installation (e.g., C:\Program Files\Java\jdk-<version>).
Add %JAVA_HOME%\bin to the Path variable.

3)Verify Installation:
Open Command Prompt or Terminal.
Run java -version and javac -version to confirm successful installation.


Step 2: Install Eclipse IDE

1)Download Eclipse:
Visit the Eclipse Downloads page.
Choose the Eclipse IDE for Java Developers package.

2)Install Eclipse:
Download the installer, run it, and follow the setup instructions.
Select a directory to install Eclipse (e.g., C:\Eclipse).

3)Launch Eclipse:
After installation, launch Eclipse.
Set a workspace directory where your Java projects will be stored (default is fine).
Step 3: Configure Eclipse IDE

4)Link the JDK:
In Eclipse, go to Window > Preferences > Java > Installed JREs.
Click Add, choose Standard VM, and provide the JDK installation path.
Set it as the default JRE.

5)Create a New Java Project:
Go to File > New > Java Project.
Provide a project name and click Finish.

6)Write Java Code:
Right-click the project > New > Class.
Provide a class name (e.g., HelloWorld) and check the box for a public static void main(String[] args) method.
Write your Java code in the editor.

7)Run the Program:
Click the green Run button or press Ctrl + F11 to execute your program.
View the output in the Console panel.



*/



//-----------------------------------------------------------------------------------------------------------------------------------------------------


/*


5) Question- Java Program Structure (Packages, Classes, Methods).

1. Packages
What is a Package?

A package is a name space that organizes classes and interfaces to avoid naming conflicts.
It helps group related classes and provides access control.

Types of Packages:
Built-in Packages: Provided by Java (e.g., java.util, java.io).
User-defined Packages: Created by the programmer.


2. Classes
What is a Class?

A class is a blueprint for creating objects. It defines properties (fields) and behaviors (methods).


3. Methods



Function : Function Does Something 
* types
* function without parameter and without return type
* function with parameter and without return type
* function without parameter and with return type
* function with parameter and with return type



*/


//--------------------------------------------------------------------------------------------------------------------------------------------------
