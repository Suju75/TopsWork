package com.DataTypesVariablesandOperators;

public class Theory2 {

}
/*
 1)Question- Primitive Data Types in Java (int, float, char, etc.).
  
 1)Java has 8 primitive data types, which are predefined by the language and represent simple values like numbers,
 characters, or logical values.These are the building blocks for data manipulation.


Data Type	Size (in bytes)		Range

byte		1			        -128 to127
short		2			        -32,768 to32,767
int		    4			        -2,147,483,648 to2,147,483,647
long		8		        	-9,223,372,036,854,775,808 to9,223,372,036,854,775,807
float		4		          	Approximately ±3.40282347E+38 (7 decimal places)
double		8					Approximately ±1.79769313486231570E+308 (15 decimal places)
char		2					0 to 65,535 (represents a single16-bit Unicode character)
boolean		1					true or false

 */


//---------------------------------------------------------------------------------------------------------------------------------------------------------



/*

2) Question- Variable Declaration and Initialization.

1. Variable Declaration
Declaring a variable means specifying its type and name.

int number;   // Declares an integer variable
float price;  // Declares a float variable
char grade;   // Declares a character variable

2. Variable Initialization
Initialization assigns a value to the declared variable. This can be done:

During Declaration:

int number = 10;
float price = 99.99f;
char grade = 'A';


After Declaration:

int number;
number = 10;  // Initialize later

3. Types of Variables
In Java, variables are classified based on their scope and usage:

a) Local Variables
Declared inside a method, constructor, or block.
Accessible only within the block where they are defined.
Must be initialized before use.

b) Instance Variables
Declared inside a class but outside any method.
Belong to an object, and each object has its own copy.
Initialized to default values if not explicitly initialized.

c) Static Variables
Declared with the static keyword inside a class.
Shared among all instances of the class.
Initialized once at the start of the program.

4. Rules for Variable Naming
Must start with a letter, $, or _.
Cannot use reserved keywords (e.g., class, int).
Names should be meaningful and follow camelCase convention (e.g., studentAge).

*/


//-----------------------------------------------------------------------------------------------------------------------------------------------------------


/*

3) Question:- Operators:Arithmetic, Relational, Logical, Assignment, Unary, and Bitwise.


| **Operator Type**        | **Operator**        | **Description**                                         | **Example**                | **Result**               |
|---------------------------|---------------------|--------------------------------------------------------|----------------------------|--------------------------|
| **Arithmetic Operators**  | `+`                 | Addition                                               | `5 + 3`                    | `8`                      |
|                           | `-`                 | Subtraction                                            | `5 - 3`                    | `2`                      |
|                           | `*`                 | Multiplication                                         | `5 * 3`                    | `15`                     |
|                           | `/`                 | Division                                               | `6 / 3`                    | `2`                      |
|                           | `%`                 | Modulus (Remainder)                                    | `5 % 3`                    | `2`                      |

---

| **Relational Operators**  | `==`                | Equal to                                               | `5 == 3`                   | `false`                  |
|                           | `!=`                | Not equal to                                           | `5 != 3`                   | `true`                   |
|                           | `>`                 | Greater than                                           | `5 > 3`                    | `true`                   |
|                           | `<`                 | Less than                                              | `5 < 3`                    | `false`                  |
|                           | `>=`                | Greater than or equal to                               | `5 >= 3`                   | `true`                   |
|                           | `<=`                | Less than or equal to                                  | `5 <= 3`                   | `false`                  |

---

| **Logical Operators**     | `&&`                | Logical AND                                            | `(5 > 3) && (8 > 5)`       | `true`                   |
|                           | `||`                | Logical OR                                             | `(5 > 3) || (8 < 5)`       | `true`                   |
|                           | `!`                 | Logical NOT                                            | `!(5 > 3)`                 | `false`                  |

---

| **Assignment Operators**  | `=`                 | Assign value                                           | `a = 10`                   | `a = 10`                 |
|                           | `+=`                | Add and assign                                         | `a += 5`                   | `a = a + 5`              |
|                           | `-=`                | Subtract and assign                                    | `a -= 5`                   | `a = a - 5`              |
|                           | `*=`                | Multiply and assign                                    | `a *= 5`                   | `a = a * 5`              |
|                           | `/=`                | Divide and assign                                      | `a /= 5`                   | `a = a / 5`              |
|                           | `%=`                | Modulus and assign                                     | `a %= 5`                   | `a = a % 5`              |

---

| **Unary Operators**       | `+`                 | Unary plus (positive value)                            | `+a`                       | `Positive a`             |
|                           | `-`                 | Unary minus (negative value)                           | `-a`                       | `Negative a`             |
|                           | `++`                | Increment (pre/post)                                   | `++a` or `a++`             | `Increase by 1`          |
|                           | `--`                | Decrement (pre/post)                                   | `--a` or `a--`             | `Decrease by 1`          |
|                           | `!`                 | Logical complement (NOT)                               | `!true`                    | `false`                  |

---

| **Bitwise Operators**     | `&`                 | Bitwise AND                                            | `5 & 3`                    | `1`                      |
|                           | `|`                 | Bitwise OR                                             | `5 | 3`                    | `7`                      |
|                           | `^`                 | Bitwise XOR                                            | `5 ^ 3`                    | `6`                      |
|                           | `~`                 | Bitwise Complement                                     | `~5`                       | `-6`                     |
|                           | `<<`                | Left shift                                             | `5 << 1`                   | `10`                     |
|                           | `>>`                | Right shift                                            | `5 >> 1`                   | `2`                      |
--------------------------------------------------------------------------------------------------------------------------------------------------------------------

 
 
 
 */    




//------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*
4) Question:- Type Conversion and TypeCasting.
Java provides mechanisms to convert one data type into another.
This process is categorized into type conversion and type casting 
based on whether the conversion is implicit or explicit.
    
1. Type Conversion
Type conversion is an automatic, implicit process where a smaller data type
is converted into a larger data type to avoid data loss.

Also called widening conversion.
It happens automatically (no code required).
Safe, as no data is lost.
Rules of Type Conversion:
Smaller types can be converted into larger types in the following order:
byte → short → int → long → float → double


Example of Type Conversion:

public class TypeConversionExample {
    public static void main(String[] args) {
        int num = 100;
        double convertedNum = num;  // Implicit conversion
        System.out.println("Converted value: " + convertedNum);  // Output: 100.0
    }
}


2. Type Casting
Type casting is an explicit process where a larger data type is converted into a smaller data type.

Also called narrowing conversion.
Requires explicit syntax using the cast operator (type).
May result in data loss or precision issues.


Syntax of Type Casting:

type smallerType = (smallerType) largerTypeValue;

Example of Type Casting:

public class TypeCastingExample {
    public static void main(String[] args) {
        double num = 100.5;
        int castedNum = (int) num;  // Explicit casting
        System.out.println("Casted value: " + castedNum);  // Output: 100
    }
}


3. Special Case: String Conversion

Converting a String to a Number:

public class StringToNumber {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str);  // Convert String to int
        System.out.println("Converted Number: " + num);  // Output: 123
    }
}


Converting a Number to a String:

public class NumberToString {
    public static void main(String[] args) {
        int num = 123;
        String str = Integer.toString(num);  // Convert int to String
        System.out.println("Converted String: " + str);  // Output: "123"
    }
}
 */
