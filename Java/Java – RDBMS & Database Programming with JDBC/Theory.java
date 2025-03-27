package com.InttoductionToJdbc;

public class Theory {

}

/*
   1) What is JDBC?
   
   Ans:- JDBC is a Java API used to connect and execute queries with databases.
   It provides a standard interface for Java applications to interact with relational databases like MySQL, Oracle, etc.
*/



/*
 2) Importance of JDBC.
 
* Enables Java applications to communicate with databases.
* Provides a standard way to execute SQL queries.
* Ensures platform independence and security.
*/


/*
3) JDBC Architecture.

* Driver Manager – Manages database drivers.
* Driver – Connects Java to a specific database.
* Connection – Establishes a session between Java and the database.
* Statement – Executes SQL queries (Statement, PreparedStatement, CallableStatement).
* ResultSet – Stores query results for data retrieval.

*/



//----------------------------------------------------------------------------------------------------------------------------------------------//


/*
 1) Overview of JDBC Driver Types.
  JDBC drivers act as a bridge between Java applications and databases. There are four types of JDBC drivers:

Type 1: JDBC-ODBC Bridge Driver.

Uses ODBC (Open Database Connectivity) to communicate with the database.
Requires ODBC driver installed on the system.
Slower due to extra conversion layers.
Deprecated in Java 8.
Usage: Used for legacy systems with ODBC support.


Type 2: Native-API Driver.

Uses database-specific client libraries (e.g., Oracle OCI, MySQL Connector).
Faster than Type 1 but requires native installation.
Platform-dependent (works only on specific OS).
Usage: Used in applications that require high performance but run on controlled environments.

Type 3: Network Protocol Driver.

Uses a middleware server to translate JDBC calls into database-specific protocol.
No need for native libraries on the client side.
Better security & flexibility but adds network overhead.
Usage: Used in distributed applications with multiple databases.

Type 4: Thin Driver (Pure Java Driver).

Directly converts JDBC calls into database protocol (no intermediate layers).
Fastest & most commonly used driver in modern applications.
Platform-independent and requires no additional software.
Usage: Recommended for web applications & enterprise systems (e.g., MySQL, PostgreSQL, Oracle JDBC).

 */



/*
 2) Comparison & Usage of Each JDBC Driver Type.
 
Driver   Type	                 Performance	      Platform Dependency                              	          Usage
Type 1(JDBC-ODBC Bridge)	        Slow        (Extra conversion)	Yes (ODBC required)	                   Deprecated,legacy systems
Type 2(Native-API Driver)	        Fast	     Yes (DB-specific libraries needed)	                       High-performance local applications
Type 3(Network Protocol Driver)	  Moderate	     No (Middleware required)	                               Distributed applications
Type 4(Thin Driver)	               Fastest	     No (Pure Java)	                                           Recommended for all modern Java applications


*/


//----------------------------------------------------------------------------------------------------------------------------------------------//

/*
1)Step-by-Step Process to Establish a JDBC Connection.

1:-Import the JDBC Packages.
Import required classes from java.sql package.
import java.sql.*;


2:- Register the JDBC Driver.
Load the database driver class.
Class.forName("com.mysql.cj.jdbc.Driver");


3:- Open a Connection to the Database.
Establish a connection using DriverManager.
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname", "username", "password");


4:- Create a Statement.
Use Statement or PreparedStatement to execute queries.
Statement stmt = con.createStatement();


5:- Execute SQL Queries.
Perform SQL operations (SELECT, INSERT, UPDATE, DELETE).
ResultSet rs = stmt.executeQuery("SELECT * FROM students");


6:- Process the Result Set.
Retrieve data from ResultSet.
while (rs.next()) {
    System.out.println(rs.getString("name"));
}


7:- Close the Connection.
Free up database resources.
con.close();


*/

//--------------------------------------------------------------------------------------------------------------------------------------------//

/*
 1) Overview of JDBC Statements:
1:-Statement.
     
      Used for executing simple SQL queries (without parameters).
     Queries are compiled every time, leading to slower performance.
     
     Statement stmt = con.createStatement();
     ResultSet rs = stmt.executeQuery("SELECT * FROM students");
     
     
2:- PreparedStatement.

    Precompiled SQL statements for queries with parameters.
    Prevents SQL injection and improves performance.

    PreparedStatement pstmt = con.prepareStatement("SELECT * FROM students WHERE id = ?");
    pstmt.setInt(1, 101);
    ResultSet rs = pstmt.executeQuery();
    
    
3:- CallableStatement.
    Used to call stored procedures in the database.
    Supports IN, OUT, and INOUT parameters.

    CallableStatement cstmt = con.prepareCall("{call getStudentName(?)}");
    cstmt.setInt(1, 101);
    ResultSet rs = cstmt.executeQuery();
    
    
    
    
 4:- Differences between Statement, PreparedStatement, and CallableStatement.
 
 
Feature	             Statement	           PreparedStatement	                      CallableStatement
Query Compilation	  Every                execution	Compiled once, reused	      recompiled in DB
Performance		  	  Slower               Faster                                     Fastest (Stored procedures)
SQL Injection Risk	  High	               Low (Uses parameters)	                  Low
Usage	              Simple SQL queries   Queries with parameters	                  Stored procedures
Best For	          Basic queries	       Dynamic queries	                          Complex operations   
 
 */




//--------------------------------------------------------------------------------------------------------------------------------------------//

/*
 1:- What is ResultSet in JDBC?
 
     ResultSet is an interface in JDBC that stores the result of an executed SQL query.
     It allows Java applications to retrieve and navigate through data fetched from a database.

ResultSet rs = stmt.executeQuery("SELECT * FROM students");



2:- Navigating Through ResultSet.

    ResultSet provides methods to move the cursor through retrieved data:

Method	Description
rs.next()	Moves to the next row (default direction).
rs.previous()	Moves to the previous row.
rs.first()	Moves to the first row.
rs.last()	Moves to the last row.
rs.absolute(n)	Moves to the nth row directly.

if (rs.first()) {
    System.out.println("First Student: " + rs.getString("name"));
}



3:- Working with ResultSet to Retrieve Data

    To fetch and process data from a query result:


while (rs.next()) {
    int id = rs.getInt("id");
    String name = rs.getString("name");
    System.out.println("ID: " + id + ", Name: " + name);
}

rs.close();

*/

//--------------------------------------------------------------------------------------------------------------------------------------------//


/*
1:- What is DatabaseMetaData in JDBC?
    DatabaseMetaData is an interface in JDBC that provides information about the database, such as its structure,
    tables, version, and supported features.
    
    
2:- Importance of DatabaseMetaData in JDBC
    Helps in understanding database capabilities (e.g., supported SQL features).
    Allows retrieval of table structures and column details.
    Useful for dynamic applications that need to work with multiple databases.
    
    
3:-Methodsprovidedby DatabaseMetaData(getDatabaseProductName, getTables,etc.

 Common Methods of DatabaseMetaData
Method	Description
getDatabaseProductName()	                  Returns the name of the database (e.g., MySQL, Oracle).
getDatabaseProductVersion()	                  Returns the database version.
getTables(null, null, "%", null)	          Retrieves all tables in the database.
getColumns(null, null, "table_name", "%")	  Retrieves columns of a specified table.
getDriverName()	                              Returns the name of the JDBC driver.

 */


//---------------------------------------------------------------------------------------------------------------------------------------------//


/*
1:- What is ResultSetMetaData in JDBC?
    ResultSetMetaData is an interface in JDBC that provides information about the structure of a query result.
     It helps in analyzing details like column names, data types, and column count in a ResultSet.
     
     
2:-  Importance of ResultSet Metadata in analyzing the structure of query results.
    
     Importance of ResultSetMetaData.
     
     Helps in dynamically processing query results without hardcoding column details.
     Useful for generic reporting tools and database exploration.
     Enables applications to work with unknown or changing database schemas.


3:- Common Methods of ResultSetMetaData.
Method	Description

getColumnCount()	        Returns the number of columns in the result set.
getColumnName(int i)	    Returns the name of the specified column.
getColumnType(int i)	    Returns the data type of the specified column.
getColumnLabel(int i)	    Returns the label (alias) of the column.
isNullable(int i)	        Checks if a column allows NULL values.

 */


//-----------------------------------------------------------------------------------------------------------------------------------------------//

/*
1 :-Introduction to Java Swing for GUI Development.

    Swing is a part of Java's JFC (Java Foundation Classes) and provides a set of lightweight GUI components for building desktop applications.
    It extends the AWT (Abstract Window Toolkit) but offers more flexible and customizable components.

Key Features of Java Swing:
Lightweight: Runs on top of Java rather than relying on OS-specific components.
Rich UI Components: Includes buttons, text fields, tables, trees, etc.
Event-Driven Programming: Uses event listeners for user interactions.
Pluggable Look-and-Feel: Can be customized using different themes.
MVC Architecture: Separates model, view, and controller for flexibility. 

*/


//-----------------------------------------------------------------------------------------------------------------------------------------------------

/*
1:- What is a CallableStatement in JDBC?

A CallableStatement is used in JDBC to call stored procedures from a database. 
It extends the PreparedStatement interface and allows executing SQL stored procedures that are defined in the database.


2:- Why Use CallableStatement?

Improves Performance: Stored procedures execute on the database server, reducing network traffic.
Encapsulation of Logic: Business logic can be written inside stored procedures, making Java code cleaner.
Supports IN, OUT, and INOUT Parameters: Unlike simple queries, stored procedures can return multiple results.

3:-Working with IN and OUT parameters in stored procedures.

Steps to Use CallableStatement:
Establish a Connection to the database.
Prepare the CallableStatement with the stored procedure.
Set Parameters (IN, OUT, or INOUT).
Execute the CallableStatement and process results.

 */

//----------------------------------------------------------------------------------------------------------------------------------------------------------

