package com.nasledovanie;
//Ставка
public class EmployeeStake extends Employee {

    private int days;
    private int stake;
    static int salary;
    String child;
    static double taxes = 0.2;
    static double noChild = 0.05;


    public EmployeeStake(int days, int stake, String name){
        this.days = days;
        this.stake = stake;
        this.name = name;
    }

    public EmployeeStake(int days, int stake, String name, String child){
        this.days = days;
        this.stake = stake;
        this.name = name;
        this.child = child;
    }


    @Override
    public void payment(){
        salary = days * stake;
        String jobType = "Stake";
        System.out.println("Name: " + name + " Job Type: " + jobType + " Salary: " + salary + "\n");
    }

    public void paymentWithTaxes(){
        salary = days * stake;
        int paymentMinusTaxes = (int) (salary - (salary * taxes));
        System.out.println("Name: " + name + " Taxes: " + taxes * 100 + "% " + "Salary: " + salary + " Total: " + paymentMinusTaxes);
    }

    public void paymentChildren(){
        salary = days * stake;
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
}
