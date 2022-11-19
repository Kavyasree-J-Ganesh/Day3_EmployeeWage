package com.bridgelabz;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;

    static final int PART_TIME_HOUR = 4;

    static final int FULL_TIME_EMPLOYEE = 2;
    static final int PART_TIME_EMPLOYEE = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee + Wage Computation Program");

        int employeeCheck = (int) Math.floor(Math.random()*10) %2;

        int wage = 0;

        switch(employeeCheck){
            case FULL_TIME_EMPLOYEE:
                wage = FULL_DAY_HOUR * WAGE_PER_HOUR;
                break;
            case PART_TIME_EMPLOYEE:
                wage = PART_TIME_HOUR * WAGE_PER_HOUR;
                break;
            default:
                wage = 0;
        }

        System.out.println(wage);
    }
}



