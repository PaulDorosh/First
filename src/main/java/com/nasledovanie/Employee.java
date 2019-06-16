package com.nasledovanie;

public  class Employee {

    String name;


    public void payment(){}
    public void allSalary(){
        int allSalary = EmployeeStake.salary + EmployeeHours.salary + EmployeePieceRate.salary;
        System.out.println("All Payments: " + allSalary);
    }
}
