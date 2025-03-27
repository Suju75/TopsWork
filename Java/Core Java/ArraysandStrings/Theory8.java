package com.ArraysandStrings;

public class Theory8 {

}

//8. Arrays and Strings.


/*
1) Questions :- One-Dimensional and Multidimensional Arrays .

1) One-Dimensional Arrays.
 A one-dimensional array is a linear data structure that stores a collection of elements of the same data type.
 

2)Multidimensional Arrays.
A multidimensional array is an array of arrays. The most common type is a two-dimensional array, often used to represent a table or matrix.

*/


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/* 
2) Questions :-StringHandling in Java: String Class, StringBuffer, StringBuilder.

  In Java, strings are objects that represent sequences of characters.
  Java provides several classes for handling strings, such as String, StringBuffer, and StringBuilder. 
  Each class has its own characteristics and use cases.
    
    The String Class:
        The String class in Java represents an immutable sequence of characters. 
        This means that once a string is created, it cannot be changed. 
        Any operation that seems to modify a string actually creates a new string object.

        String Declaration and Initialization:
            String str1 = "Hello";
            String str2 = new String("World");

    The StringBuffer Class:
        StringBuffer is used for creating mutable strings, meaning you can modify the contents of a StringBuffer object without creating new objects each time. 
        It is synchronized, making it thread-safe, but a bit slower than StringBuilder.

        syntax:
            StringBuffer sb = new StringBuffer("Hello");

    The StringBuilder Class:
        StringBuilder is similar to StringBuffer in that it is mutable, but it is not synchronized. 
        This means it is not thread-safe but provides better performance in single-threaded environments or where thread-safety is not a concern.

        syntax:
            StringBuilder sb = new StringBuilder("Hello");


   
 */


//-------------------------------------------------------------------------------------------------------------------------------------------------------------

/*

3) Questions :- Array of Objects.

 An array of objects in Java refers to an array where each element is an object of a class.

 This allows you to store multiple instances of a class in a single array.
 Just like an array of primitive types (e.g., int[], char[]), an array of objects can be used to store multiple objects,
  but the elements are references to the objects in memory, not the objects themselves.

 Creating an Array of Objects
 
 To create an array of objects, you first define the class type of the objects that the array will store,
  then create the array with the specific size or directly initialize the objects.
  
  
 syntax:
     ClassName[] arrayName = new ClassName[arraySize];
     
*/


//--------------------------------------------------------------------------------------------------------------------------------------------------------

/*

4) Questions :- String Methods (length, charAt, substring, etc.).

-------------------------------------------------------------------------------
|  Method	                   |         Description                            |
-------------------------------------------------------------------------------
length()	                        Returns the length of the string.

charAt(int index)	                Returns the character at the specified index.

substring(int start, int end)	    Returns a substring from the start index to end index - 1.

indexOf(String str)	                Returns the index of the first occurrence of the specified substring.

equals(String anotherString)	    Compares two strings for equality.

toUpperCase()	                    Converts all characters to uppercase.

toLowerCase()	                    Converts all characters to lowercase.

trim()	                            Removes leading and trailing whitespace from the string.

replace()	                        Replaces characters or substrings with new values.

startsWith()	                    Checks if the string starts with the specified prefix.

endsWith()	                        Checks if the string ends with the specified suffix.

contains()	                        Checks if the string contains the specified sequence of characters.

split()	                            Splits the string into an array of substrings based on the regex.

valueOf()	                        Converts other data types (e.g., int, char, Object) to a string.


*/

//---------------------------------------------------------------------------------------------------------------------------------------------------------
