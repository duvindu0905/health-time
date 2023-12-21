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
public class LoginModel {

    private static int userNo;
    private static String firstName;
    private static String loginType;
    private static int schdulleId;

    public ResultSet checkLogin(String userName, String password, String type) throws SQLException {
        Statement st = DataBaseModel.createConnection().createStatement();
        ResultSet rst = st.executeQuery("SELECT username,password,type,uid,fname FROM user_tlb WHERE username='" + userName + "' AND password='" + password + "' AND type='" + type + "'");
        return rst;
    }

    public static void setLogin(int userId, String fname, String type) {
        userNo = userId;
        firstName = fname;
        loginType = type;
    }

    public static void setSchdulleId(int schdulleId) {
        LoginModel.schdulleId = schdulleId;
    }

    public static int getSchdulleId() {
        return schdulleId;
    }

    public static int getUserNo() {
        return userNo;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getLoginType() {
        return loginType;
    }

}
