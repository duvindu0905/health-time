/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.LoginModel;

/**
 *
 * @author sanug
 */
public class LoginController {

    public ResultSet checkLogin(String userName, String password, String type) throws SQLException {
        return new LoginModel().checkLogin(userName, password, type);
    }

    public void setLogin(int userId, String fname, String type) {
        LoginModel.setLogin(userId, fname, type);
    }

    public String getFirstName() {
        return LoginModel.getFirstName();
    }

    public void setSchedulleId(int schedulleId) {
        LoginModel.setSchdulleId(schedulleId);
    }

    public int getSchedulleId() {
        return LoginModel.getSchdulleId();
    }
}
