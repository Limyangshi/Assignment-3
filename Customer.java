/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment.pkg3;

import java.io.*;

/**
 *
 * @author ASUS
 */
public class Customer implements Serializable
{
  private String name;
  private String ic;
  private String phoneNo;
  private String email;
  private House house; 
  private int customerNo;

    public Customer(String name, String ic, String phoneNo, String email, House house, int customerNo) {
        this.name = name;
        this.ic = ic;
        this.phoneNo = phoneNo;
        this.email = email;
        this.house = house;
        this.customerNo = customerNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public int getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }
  
}
