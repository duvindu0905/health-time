/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.SQLException;
import model.UserModel;
/**
 *
 * @author sanug
 */
public class UserController {

    public int saveUser(String firstName, String lastName, String userName, String password, String type, String email) throws SQLException {
        return new UserModel().saveUser(firstName, lastName, userName, password, type, email);
    }
}
