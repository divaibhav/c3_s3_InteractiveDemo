package com.jap.course3.sprint3;

public class StartUpOrganisation {
    private String companyName;
    private Employee[] employees;

    public StartUpOrganisation(String companyName, Employee[] employees){
        this.companyName = companyName;
        this.employees = employees;
    }
    //accessor and mutator
    //getter and setter
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
    //display names with salary hike
    public void displayNamesWithHikedSalary(){
        System.out.println("Name\t salary");
        for (Employee employee : employees) {
            System.out.println(employee.getEmpName() + ", " + employee.getSalary());
        }
    }

    // hike the salary by 20 %
    public void hikeSalary(int percentageHike){
        for (int i = 0; i < employees.length; i++) {
            //double hikedSalary = employees[i].getSalary() * ;
            //employees[i].setSalary(hikedSalary);
            Employee employee = employees[i];
            //employees[i].setSalary(employees[i].getSalary() * (percentageHike/100.0) + employees[i].getSalary() );
            employee.setSalary(employee.getSalary() * (percentageHike /100.0) + employee.getSalary());
        }
    }


}
