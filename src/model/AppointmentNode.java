/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sanug
 */
public class AppointmentNode {

    private int appointmentId;
    private String firstName;
    private String lastName;
    private String nic;
    private String address;
    private int mobile;
    private String email;
    private AppointmentNode nextNode;

    public AppointmentNode(int appointmentId, String firstName, String lastName, String nic, String address, int mobile, String email, AppointmentNode nextNode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nic = nic;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
        this.nextNode = nextNode;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AppointmentNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(AppointmentNode nextNode) {
        this.nextNode = nextNode;
    }

}
