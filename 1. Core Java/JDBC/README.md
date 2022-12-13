# JDBC | Java Database Connectivity

JDBC is an international standard for programming access to SQL databases

## Working with JDBC

We need to follow these 7 steps, to work efficiently with the JDBC:

1. <b> Loading the Driver</b> :  you first need load the driver or register it before using it in the program.
    
    1.1 ``` Class.forName()``` : Here we load the driver’s class file into memory at the runtime.
    
    1.2 ``` DriverManager.registerDriver()```: DriverManager is a Java inbuilt class with a static member register
    
2. <b> Create the connections </b> : After loading the driver, establish connections using :

    2.1 ``` Connection con = DriverManager.getConnection(url,user,password)``` 
    
       - url = A Uniform Resource Locator (e.g. ``` String url = “ jdbc:oracle:thin:@localhost:1521:xe”``` )
       - user = username from which your sql command prompt can be accessed.
       - password = password from which your sql command prompt can be accessed.
        
3. <b>Create a Statement</b> : Once a connection is established you can interact with the database. 
    3.1 Use of JDBC Statement is as follows: 
    ``` Statement st = con.createStatement();```
4. <b>Execute The Query</b> : Now comes the most important part i.e executing the query. Query here is an SQL Query . Now
we know we can have multiple types of queries. Some of them are as follows:
    - Query for updating / inserting table in a database.
    - Query for retrieving data .
    4.1 The <i> executeQuery() </i> method of Statement interface is used to execute queries of retrieving values from the database. This method returns the object of ResultSet that can be used to get all the records of a table.
    4.2 The <i> executeUpdate(sql query)</i> method ofStatement interface is used to execute queries of updating/inserting .
5. <b> Close the Connection </b>: By closing connection, objects of Statement and ResultSet will be closed automatically. The close() method of Connection interface is used to close the connection.
