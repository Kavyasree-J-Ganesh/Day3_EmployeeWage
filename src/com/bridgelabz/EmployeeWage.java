package com.bridgelabz;

public class EmployeeWage {
    static int WAGE_PER_HOUR = 20;
    static int FULL_DAY_HOUR = 8;

    static int PART_TIME_HOUR = 4;

    static int FULL_TIME_EMPLOYEE = 2;
    static int PART_TIME_EMPLOYEE = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee + Wage Computation Program");

        int employeeCheck = (int) Math.floor(Math.random()*10) %2;

        if(employeeCheck == 1){
            System.out.println("Employee is Present");
        }else{
            System.out.println("Employee is absent");
        }
    }
}



