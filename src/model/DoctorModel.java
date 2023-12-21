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
public class DoctorModel {

    private ResultSet doctorResultSet;

    public ResultSet getAllDoctors() throws SQLException {
        Statement st = DataBaseModel.createConnection().createStatement();
        doctorResultSet = st.executeQuery("SELECT * FROM doctor_tlb");
        return doctorResultSet;
    }
}
