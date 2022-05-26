package com.jap.course3.sprint3;

public class Address {
    private int houseNo;
    private String streetName;
    private String city;
    private String state;
    private int pinCode;
    //no argument constructor
    public Address(){
    }
    //parameterized constructor
    public Address(int houseNo, String streetName, String city, String state, int pinCode){
        this.houseNo = houseNo;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }
    //getters and setters
    public int getHouseNo(){
        return houseNo;
    }
    public void setHouseNo(int houseNo){
        this.houseNo = houseNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}

