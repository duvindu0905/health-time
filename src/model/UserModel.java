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
public class UserModel {

    public int saveUser(String firstName, String lastName, String userName, String password, String type, String email) throws SQLException {
        Statement st = DataBaseModel.createConnection().createStatement();
        int c = st.executeUpdate("INSERT INTO user_tlb (username,password,fname,lname,type,email) VALUES ('" + userName + "','" + password + "','" + firstName + "','" + lastName + "','" + type + "','" + email + "')");
        if (c > 0) {
            new SendEmail().sendEmail(email, "Registration", "Dear Sir/Madam,\n\nYou registered successfully. \nYour Credentials are,\n\n\t\t UserName:  " + userName + "\n\t\t Password: " + password + "\n\nThank You!\nInformation System,\nHealthTime.Io.\n\nThis is a system generated email.\n(Do not reply).");
        }
        return c;
    }
}
