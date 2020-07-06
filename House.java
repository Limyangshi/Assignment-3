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
public class House implements Serializable
{
    private String name;
    private String price;
    private String squareFeet;

    public House(String name, String price, String squareFeet) {
        this.name = name;
        this.price = price;
        this.squareFeet = squareFeet;
    }

    public String getName() {
        return name;
    }
    
    public boolean equals (House house) 
    {
        return (this.name == house.name && 
                this.price.equals(house.price));
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(String squareFeet) {
        this.squareFeet = squareFeet;
    }
    
}
