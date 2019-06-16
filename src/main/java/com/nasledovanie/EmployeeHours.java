package com.nasledovanie;
//Почасовая
public class EmployeeHours extends Employee {

    private int hours;
    private int salaryInHour;
    static int salary;
    String child;
    static double taxes = 0.2;
    static double noChild = 0.05;

    public EmployeeHours(int hours, int SalaryInHour, String name){
        this.hours = hours;
        this.salaryInHour = SalaryInHour;
        this.name = name;
    }

    public EmployeeHours(int hours, int SalaryInHour, String name, String child){
        this.hours = hours;
        this.salaryInHour = SalaryInHour;
        this.name = name;
        this.child = child;
    }

    @Override
    public void payment() {
        salary = hours * salaryInHour;
        String jobType = "Hours";
        System.out.println("Name: " + name + " Job Type: " + jobType + " Salary: " + salary + "\n");
    }

    public void paymentWithTaxes(){
        salary = hours * salaryInHour;
        int paymentMinusTaxes = (int) (salary - (salary * taxes));
        System.out.println("Name: " + name + " Taxes: " + taxes * 100 + "% " + "Salary: " + salary + " Total: " + paymentMinusTaxes);
    }

    public void paymentChildren(){
        salary = hours * salaryInHour;
        int paymentWithoutChildren;
        int paymentWithChildren;
        if(child.equals("no")) {
            paymentWithoutChildren = (int) (salary - (salary * (taxes + noChild)));
            System.out.println("Name: " + name + " Taxes: " + (taxes + noChild) * 100 + "% " + "Salary: " + salary + " Total: " + paymentWithoutChildren);
        }
        else {
            paymentWithChildren = (int) (salary - (salary * taxes));
            System.out.println("Name: " + name + " Taxes: " + taxes * 100 + "% " + "Salary: " + salary + " Total: " + paymentWithChildren);
        }
    }

    public void paymentInTugriks(){
        salary = hours * salaryInHour;
        int pay = (int) (salary - (salary * taxes));
        // Пусть курс сегодня 1 к 2
        System.out.println("Name: " + name + " Taxes: " + taxes * 100 + "% " + "Salary: " + pay + " Total(rub/tugriki): " + pay / 2 + " / " + (pay / 2) * 0.5);
    }
}
