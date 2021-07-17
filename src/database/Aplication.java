package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Aplication {
    public static  void main(String[] args){
        System.out.println("----------------Mysql JDBC Connection  Demo");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Mysql JDBC  Drive not found!!");
            return;
        }
        System.out.println("Mysql JDBC Driver Registered");
        Connection con=null;
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_hoang","root","0945533162");
            System.out.println("Sql Connection  to database established");
        } catch (SQLException e) {
            System.out.println("Connection failed! check output console"+e);
        }
    }
}
