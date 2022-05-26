package com.jap.course3.sprint3.implementation;

import com.jap.course3.sprint3.Address;
import com.jap.course3.sprint3.Employee;
import com.jap.course3.sprint3.StartUpOrganisation;

public class StartUpImplementation {
    public static void main(String[] args) {
        /*Address address1 = new Address(12,"MG road","Bhopal", "MP", 462041);
        Address address2 = new Address();
        address2.setHouseNo(15);
        address2.setStreetName("abc");
        address2.setCity("Pune");
        address2.setState("MH");
        address2.setPinCode(123456);
        Address address3 = new Address(10,"street3","state3","city3",123456 );
        Employee employee1 = new Employee("Vaibhav", 100, 20000, address1);
        Employee employee2 = new Employee("Ramesh", 101, 50000, address2);
        Employee employee3 = new Employee("Ankit", 103, 10000,address3);
        Employee[] employees = new Employee[3];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
*/
        /*StartUpOrganisation startUpOrganisation = new StartUpOrganisation("ABC crops",employees);
        startUpOrganisation.displayNamesWithHikedSalary();
        startUpOrganisation.hikeSalary(20);
        startUpOrganisation.displayNamesWithHikedSalary();*/
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        System.out.println(e1.getEmpName() + ", " + e1.getSalary()  +  ", " + e1.getAddress());
        System.out.println(e2.getEmpName() + ", " + e2.getSalary() +  ", " + e1.getAddress());
    }
}
