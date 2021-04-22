package com.SpringWebmvc2.MedicalDto;
import javax.persistence.*;
@Entity
@Table(name = "Customerdetail")
public class Customer {
    @Id
    @GeneratedValue
    @Column(name = "CustomerName")
   public String customerName;
    @Column(name = "CustomerLocation")
    public String customerLocation;
    @Column(name = "MedicineNAME")
    public String MedicineName;
    @Column(name = "Email")
    public String Email;
    @Column(name = "password")
    public String password;
    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerLocation='" + customerLocation + '\'' +
                ", MedicineName='" + MedicineName + '\'' +
                ", Email='" + Email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerLocation() {
        return customerLocation;
    }
    public void setCustomerLocation(String customerLocation) {
        this.customerLocation = customerLocation;
    }
    public String getMedicineName() {
        return MedicineName;
    }
    public void setMedicineName(String medicineName) {
        MedicineName = medicineName;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
