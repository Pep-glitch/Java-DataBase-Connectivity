//package database;
/*
1-- import  package
2--load and register driver
3--create connection
4--create statement
5--execute query
6--process results
7--close connection
*/
//set classpath=mysql-connector.jar;.;
import java.util.*;
import java.sql.*;

public class Data 
{

    public static void main(String args[])
    {
       try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection(url, user, password);
       } catch (Exception e) {
           //TODO: handle exception
       }  
    }
}