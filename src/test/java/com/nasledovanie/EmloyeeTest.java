package com.nasledovanie;

import org.junit.Test;

public class EmloyeeTest {


    //Test for first task
    @Test
    public void stakeTest(){
        EmployeeStake Ivanov = new EmployeeStake(12, 30, "Ivanov");
        EmployeePieceRate Smirnov = new EmployeePieceRate(10, 20, "Smirnov");
        EmployeeHours Dmitriev = new EmployeeHours(11, 30, "Dmitriev");
        Employee AllSalary = new Employee();
        Ivanov.payment();
        Smirnov.payment();
        Dmitriev.payment();
        AllSalary.allSalary();

    }

    //Test for second task
    @Test
    public void taxesTest(){
        EmployeeStake Ivanov = new EmployeeStake(12, 30, "Ivanov");
        EmployeeHours Smirnov = new EmployeeHours(11, 30, "Smirnov");
        EmployeePieceRate Dmitriev = new EmployeePieceRate(10, 20, "Dmitriev");
        Ivanov.paymentWithTaxes();
        Smirnov.paymentWithTaxes();
        Dmitriev.paymentWithTaxes();
    }

    // Test for third task
    @Test
    public void childTest(){
        EmployeeStake Ivanov = new EmployeeStake(12, 30, "Ivanov", "no");
        EmployeeStake Smirnov = new EmployeeStake(12, 30, "Smirnov", "yes");  // просто сравнил 2 зпшки
        Ivanov.paymentChildren();
        Smirnov.paymentChildren();
    }

    @Test
    public void tugrikTest(){
        EmployeeHours Ivanov = new EmployeeHours(11, 30, "Ivanov");
        Ivanov.paymentInTugriks();
    }
}
