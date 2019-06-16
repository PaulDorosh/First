package com.nasledovanie;
//Сдельная
public class EmployeePieceRate extends Employee {

    private int amountOfJobs;
    private int salaryForOneJob;
    static int salary;
    String child;
    static double taxes = 0.15;
    static double noChild = 0.05;


    public EmployeePieceRate(int amountOfJobs, int salaryForOneJob, String name){
        this.amountOfJobs = amountOfJobs;
        this.salaryForOneJob = salaryForOneJob;
        this.name = name;
    }

    public EmployeePieceRate(int amountOfJobs, int salaryForOneJob, String name, String child){
        this.amountOfJobs = amountOfJobs;
        this.salaryForOneJob = salaryForOneJob;
        this.name = name;
        this.child = child;
    }

    @Override
    public void payment() {
        salary = amountOfJobs * salaryForOneJob;
        String jobType = "Piecerate";
        System.out.println("Name: " + name + " Job Type: " + jobType + " Salary: " + salary + "\n");
    }

    public void paymentWithTaxes() {
        salary = amountOfJobs * salaryForOneJob;
        int paymentMinusTaxes = (int) (salary - (salary * taxes));
        System.out.println("Name: " + name + " Taxes: " + taxes * 100 + "% " + "Salary: " + salary + " Total: " + paymentMinusTaxes);
    }

    public void paymentChildren(){
        salary = amountOfJobs * salaryForOneJob;
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
