package com.bridgelabz;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;

    static final int PART_TIME_HOUR = 4;

    static final int FULL_TIME_EMPLOYEE = 2;
    static final int PART_TIME_EMPLOYEE = 1;

    static final int NUM_DAYS_IN_MONTH = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee + Wage Computation Program");

        int wage = 0;
        int totalwage = 0;

        for(int i=0;i<NUM_DAYS_IN_MONTH;i++){
            int employeeCheck = (int) Math.floor(Math.random()*10) %3;
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
            totalwage = totalwage+wage;
        }

        System.out.println(totalwage);
    }
}



