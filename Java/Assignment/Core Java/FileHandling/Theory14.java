package com.FileHandling;

public class Theory14 {

}

/*
 

Q1.Introduction to File I/O in Java (java.io package)
Ans:
    The java.io package in Java provides a wide range of classes for input and output (I/O) operations. 
    It allows you to read from and write to files, handle streams, and manage serialization.
    
    File I/O operations are crucial for handling data storage and retrieval in Java applications.

    1. Streams - Streams represent a flow of data. 
    -Input Stream: Used to read data (e.g., FileInputStream).
    -Output Stream: Used to write data (e.g., FileOutputStream).

    2.File Class - The File class represents file and directory pathnames. 
    Common Methods in the File Class:
    -exists(): Checks if the file or directory exists.
    -createNewFile(): Creates a new, empty file.
    -mkdir(): Creates a new directory.
    -delete(): Deletes a file or directory.
    -length(): Returns the file size in bytes.

    3.FileInputStream and FileOutputStream - These classes are used for reading and writing binary data.
    -FileInputStream: Reads data from a file byte by byte.
    -FileOutputStream: Writes data to a file byte by byte.

    4.BufferedReader and BufferedWriter - These classes are used for efficient reading and writing of character data.
     They buffer data to reduce the number of I/O operations.
    -BufferedReader: Reads text from an input stream.
    -BufferedWriter: Writes text to an output stream.

    5.FileReader and FileWriter - These classes are used for reading and writing character streams.
    -FileReader: Reads characters from a file.
    -FileWriter: Writes characters to a file.

    6. Serialization - Serialization involves saving an object's state to a file for later use.
     The ObjectOutputStream and ObjectInputStream classes are used for this purpose.
     A class must implement the Serializable interface to be serialized.

//---------------------------------------------------------------------------------------------------------------------------------------------------
 
 
 
Q2.FileReader and FileWriter Classes
Ans:
    FileReader and FileWriter are part of the java.io package in Java. 
    They are used for reading and writing character streams to and from files.
     These classes are commonly used when working with text files.

    FileReader
     -Used to read data from a file.
     -Works with text files, where data is read as a stream of characters.
     -Automatically handles character encoding.

    Key Methods of FileReader
    -int read() : Reads a single character and returns it as an integer.Returns -1 if the end of the file is reached.
    -int read(char[] cbuf) : Reads characters into an array and returns the number of characters read.
    -void close() : Closes the file stream and releases any associated system resources.

    FileWriter
    -Used to write data to a file.
    -Handles text files and writes data as a stream of characters.
    -Can append to a file or overwrite its contents.

    Key Methods of FileWriter
    -void write(int c) :Writes a single character to the file.
    -void write(char[] cbuf) : Writes an array of characters to the file.
    -void write(String str) : Writes a string to the file.
    -void flush() : Flushes the output stream and forces any buffered output to be written.
    -void close() : Closes the file writer and releases associated resources.


//----------------------------------------------------------------------------------------------------------------------------------------------
  
  
 
Q3.BufferedReader and BufferedWriter
Ans:
    BufferedReader and BufferedWriter are classes in the java.io package that provide efficient reading and writing of character
    streams by using buffering. These classes are often used in scenarios where performance is crucial, especially when working with large files.

    BufferedReader:
    The BufferedReader class is used for reading text from a character-based input stream. It buffers characters for efficient reading.

    Key Features
    Provides efficient reading of characters, arrays, and lines.
    Reduces the number of I/O operations by using an internal buffer.

    Key Methods
    -String readLine() : Reads a line of text and returns it as a String. Returns null if the end of the stream is reached.
    -int read(char[] cbuf, int off, int len) : Reads characters into an array, starting at the specified offset.
    -void close() : Closes the stream.

    BufferedWriter
    The BufferedWriter class is used for writing text to a character-based output stream. It buffers characters to improve writing efficiency.

    Key Features
    -Provides efficient writing of characters, arrays, and strings.
    -Reduces the number of I/O operations by using an internal buffer.

    Key Methods
    -void write(String s) : Writes a string to the buffer.
    -void newLine() : Writes a newline character.
    -void flush() : Forces any buffered output to be written to the file.
    -void close() : Closes the stream.


//---------------------------------------------------------------------------------------------------------------------------------------------------
 
 
Q4.Serialization and Deserialization
Ans:   
    Serialization : Serialization is the process of converting an object into a byte stream for storage or transmission.
    
    Deserialization : Deserialization is the reverse process(process of converting a byte stream into an object).

 
 
 */
