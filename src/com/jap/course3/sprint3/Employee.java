package com.jap.course3.sprint3;

public class Employee {
    //attributes
    private String empName = "vaibhav" ;
    private int empId = 100;
    private double salary = 50000;
    private Address address = new Address(10,"street3","state3","city3",123456 );;


    /*public Employee() {
    }

    public Employee(String empName, int empId, double salary, Address address) {
        this.empName = empName;
        this.empId = empId;
        this.salary = salary;
        this.address = address;
    }
*/
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
