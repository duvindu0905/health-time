/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;
/**
 *
 * @author sanug
 */
public class DataBaseModel {

    private static Connection con;

    public static Connection createConnection() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic_db", "root", "");
        return con;
    }
}
