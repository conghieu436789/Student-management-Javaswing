/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casestudentmanagement.model;
import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author Hieu
 */
public class Student implements Serializable{
    private String ID;
    private String lastName;
    private String surName;
    private Date bithDay;
    private String Email;
    private String Address;
    private double grade;
    
    public Student() {
        
    }
    public Student(String ID, String lastName, String surName, 
            Date bithDay, String Email, String Address, double grade) {
        this.ID = ID;
        this.lastName = lastName;
        this.surName = surName;
        this.bithDay = bithDay;
        this.Email = Email;
        this.Address = Address;
        this.grade = grade;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Date getBithDay() {
        return bithDay;
    }

    public void setBithDay(Date bithDay) {
        this.bithDay = bithDay;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    public String getName() {
        return this.surName  + " "+ this.lastName;
    }
    
}
