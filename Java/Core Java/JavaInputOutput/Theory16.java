package com.JavaInputOutput;

public class Theory16 {

}

/*
 
  
Q1.Streams in Java (InputStream, OutputStream)
Ans:
    InputStream
    An abstract class used for reading data byte by byte from a source.

    Common Methods
    -int read(): Reads the next byte of data (returns -1 if the end of the stream is reached).
    -int read(byte[] b): Reads up to b.length bytes into the byte array.
    -void close(): Closes the stream and releases system resources.

    Common Subclasses
    FileInputStream: Reads bytes from a file.
    Use case: Reading data from a file.

    BufferedInputStream: Adds buffering to reduce the number of I/O operations.
    Use case: Improving performance for larger files.
    
    ObjectInputStream: Reads objects serialized into a stream.
    Use case: Deserializing objects.

    An abstract class used for writing data byte by byte to a destination.

    Common Methods
    -void write(int b): Writes a single byte to the output stream.
    -void write(byte[] b): Writes all bytes from the array to the stream.
    -void flush(): Flushes the stream, ensuring all buffered output is written.
    -void close(): Closes the stream.

    Common Subclasses
    FileOutputStream: Writes bytes to a file.
    Use case: Writing data to a file.
    
    BufferedOutputStream: Adds buffering to reduce the number of I/O operations.
    Use case: Improving performance when writing large files.
    
    ObjectOutputStream: Writes objects serialized into a stream.
    Use case: Serializing objects.
    


//---------------------------------------------------------------------------------------------------------------------------------------------------

Q2.Reading and Writing Data Using Streams
Ans:
    streams provide a powerful way to handle input and output operations. The concept of streams is central to Java's I/O API, and streams allow you to read data from and write data to various sources like files, network connections, and memory. 

    Byte Streams (FileInputStream, FileOutputStream): Use for raw binary data (e.g., images, audio).
    Character Streams (FileReader, FileWriter): Use for text data (e.g., reading and writing text files).
    Buffered Streams (BufferedReader, BufferedWriter): Use for efficient reading and writing of text with buffering.
    Data Streams (DataInputStream, DataOutputStream): Use for reading and writing primitive types.
    Object Streams (ObjectInputStream, ObjectOutputStream): Use for serialization and deserialization of Java objects.
    Random Access (RandomAccessFile): Use for random read/write access to a file at any position.


//---------------------------------------------------------------------------------------------------------------------------------------------------

Q3.Handling File I/O Operations    
Ans:
    Common File I/O Operations:
    Reading Files:There are several ways to read files in Java, including using FileReader, BufferedReader, FileInputStream, and more.
    
    Writing Files:You can write to files using classes such as FileWriter, BufferedWriter, and FileOutputStream.
    
    Appending to Files:If you want to add data to the end of an existing file (without overwriting the existing content), you can use FileWriter or FileOutputStream with the append flag.
    
    Checking File Properties:You can use the File class to check properties such as whether the file exists, its size, last modified date, etc.
    
    File Deletion and Renaming :You can delete or rename files using the File class.
    
    Handling Exceptions during I/O : File I/O operations can throw several exceptions, particularly IOException and FileNotFoundException. It's important to catch and handle these exceptions.
    IOException: A general exception thrown when an I/O operation fails.
    FileNotFoundException: A subclass of IOException, thrown when a file is not found during read/write operations.


//---------------------------------------------------------------------------------------------------------------------------------------------------
 
 
*/