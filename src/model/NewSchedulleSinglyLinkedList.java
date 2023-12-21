/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author sanug
 */
public class NewSchedulleSinglyLinkedList {
    
    private AppointmentNode headNode;
    private  int totalAppointments = 0;
    private int finishedAppointments = 0;
    private int remainAppointments = 0;

    public int getTotalAppointments() {
        return totalAppointments;
    }

    public void setTotalAppointments(int totalAppointments) {
        this.totalAppointments = totalAppointments;
    }

    public int getFinishedAppointments() {
        return finishedAppointments;
    }

    public void setFinishedAppointments(int finishedAppointments) {
        this.finishedAppointments = finishedAppointments;
    }

    public int getRemainAppointments() {
        return remainAppointments;
    }

    public void setRemainAppointments(int remainAppointments) {
        this.remainAppointments = remainAppointments;
    }

    public NewSchedulleSinglyLinkedList() {
        
        this.headNode = null;
    }

    public void insertEnding(int appointmentId, String firstName, String lastName, String nic, String address, int mobile, String email) {
        totalAppointments++;
        remainAppointments++;
        if (headNode == null) {
            headNode = new AppointmentNode( appointmentId, firstName, lastName, nic, address, mobile, email, null);
            new SendEmail().sendEmail(email, "Appointment Alert..", "Dear Sir/Madam,\n\nYour appointment is now. \nYour Details are,\n\n\t\t First Name:  "+ firstName+"\n\t\t Last Name: "+lastName+"\n\t\t Nic: "+nic+"\n\t\t Mobile: "+mobile+"\n\t\t Address: "+address+"\n\nThank You!\nInformation System,\nHealthTime.Io.\n\nThis is a system generated email.\n(Do not reply).");
        } else {
            AppointmentNode currentNode = headNode;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            if (currentNode.getNextNode() == null) {
                AppointmentNode newAppointment = new AppointmentNode(appointmentId, firstName, lastName, nic, address, mobile, email, null);
                currentNode.setNextNode(newAppointment);
            }
        }
    }

    public void removeBegining() {

        if (headNode != null) {
            remainAppointments--;
            finishedAppointments++;
            if (headNode.getNextNode() != null) {
                new SendEmail().sendEmail(headNode.getNextNode().getEmail(), "Appointment Alert..", "Dear Sir/Madam,\n\nYour appointment is now. \nYour Details are,\n\n\t\t First Name:  " + headNode.getNextNode().getFirstName() + "\n\t\t Last Name: " + headNode.getNextNode().getLastName() + "\n\t\t Nic: " + headNode.getNextNode().getNic() + "\n\t\t Mobile: " + headNode.getNextNode().getMobile() + "\n\t\t Address: " + headNode.getNextNode().getAddress() + "\n\nThank You!\nInformation System,\nHealthTime.Io.\n\nThis is a system generated email.\n(Do not reply).");
            }
            headNode = headNode.getNextNode();
        }
    }

    public void removeThis(String nicNumber) {
        if (headNode == null) {

        } else {
            totalAppointments--;
            remainAppointments--;
            AppointmentNode current = headNode;
            if (current.getNextNode() == null) {
                if (current.getNic().equals(nicNumber)) {
                    headNode = null;
                }
            } else {
                if (current.getNextNode().getNextNode() == null) {
                    if (current.getNic().equals(nicNumber)) {
                        headNode = headNode.getNextNode();
                    } else if (current.getNextNode().getNic().equals(nicNumber)) {
                        headNode.setNextNode(null);
                    }
                } else {
                    if (current.getNic().equals(nicNumber)) {
                        headNode = headNode.getNextNode();
                    }
                    while (current.getNextNode().getNextNode() != null) {
                        if (current.getNextNode().getNic().equals(nicNumber)) {
                            current.setNextNode(current.getNextNode().getNextNode());
                        }
                        current = current.getNextNode();
                    }
                    if (current.getNextNode().getNic().equals(nicNumber)) {
                        current.setNextNode(null);
                    }
                }
            }
        }
    }

    public DefaultTableModel viewAllAppointments() {

        AppointmentNode currentNode = headNode;
        DefaultTableModel model = new DefaultTableModel();
        if (headNode != null) {

            model.addColumn("App Id:");
            model.addColumn("Name ");
            model.addColumn("Nic");
            model.addColumn("Email");
            while (currentNode.getNextNode() != null) {
                String[] row = new String[4];
                row[0] = String.valueOf(currentNode.getAppointmentId());
                row[1] = String.valueOf(currentNode.getFirstName());
                row[2] = String.valueOf(currentNode.getNic());
                row[3] = String.valueOf(currentNode.getEmail());
                model.addRow(row);
                currentNode = currentNode.getNextNode();
            }
            String[] row = new String[4];
            row[0] = String.valueOf(currentNode.getAppointmentId());
            row[1] = String.valueOf(currentNode.getFirstName());
            row[2] = String.valueOf(currentNode.getNic());
            row[3] = String.valueOf(currentNode.getEmail());
            model.addRow(row);
        }

        return model;
    }

    public DefaultTableModel viewCurrentPatient() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("App Id:");
        model.addColumn("Name ");
        model.addColumn("Nic");
        model.addColumn("Email");
        if (headNode != null) {
            String[] row = new String[4];
            row[0] = String.valueOf(headNode.getAppointmentId());
            row[1] = String.valueOf(headNode.getFirstName());
            row[2] = String.valueOf(headNode.getNic());
            row[3] = String.valueOf(headNode.getEmail());
            model.addRow(row);
        }
        return model;
    }

    public DefaultTableModel viewNextPatient() {
        DefaultTableModel model = new DefaultTableModel();
        if (headNode != null) {
            model.addColumn("App Id:");
            model.addColumn("Name ");
            model.addColumn("Nic");
            model.addColumn("Email");
            if (headNode != null & headNode.getNextNode() != null) {
                String[] row = new String[4];
                row[0] = String.valueOf(headNode.getNextNode().getAppointmentId());
                row[1] = String.valueOf(headNode.getNextNode().getFirstName());
                row[2] = String.valueOf(headNode.getNextNode().getNic());
                row[3] = String.valueOf(headNode.getNextNode().getEmail());
                model.addRow(row);
            }
        }
        return model;
    }

    public DefaultTableModel viewNicPatientToDelete(String nic) {
        AppointmentNode currentNode = headNode;
        DefaultTableModel model = new DefaultTableModel();
        if (headNode != null) {

            model.addColumn("Name ");
            model.addColumn("Nic");
            model.addColumn("Mobile");
            while (currentNode.getNextNode() != null) {

                if (currentNode.getNic().equals(nic)) {
                    String[] row = new String[4];
                    row[0] = String.valueOf(currentNode.getFirstName());
                    row[1] = String.valueOf(currentNode.getNic());
                    row[2] = String.valueOf(currentNode.getMobile());
                    model.addRow(row);
                }
                currentNode = currentNode.getNextNode();
            }
            if (currentNode.getNic().equals(nic)) {
                String[] row = new String[4];
                row[0] = String.valueOf(currentNode.getFirstName());
                row[1] = String.valueOf(currentNode.getNic());
                row[2] = String.valueOf(currentNode.getMobile());
                model.addRow(row);
            }
        }

        return model;
    }

    public AppointmentNode getHeadNode() {
        return headNode;
    }

    public void setHeadNode(AppointmentNode headNode) {
        this.headNode = headNode;
    }

}
