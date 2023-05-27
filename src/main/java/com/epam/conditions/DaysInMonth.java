package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if(year<0||month<=0||month>12){
            System.out.println("invalid date");
        } else {
            if (month == 2) {
                if (year % 4 == 0) {
                    if (year % 100 == 0 && year % 400 != 0) {
                        System.out.println(28);
                    } else {
                        System.out.println(29);
                    }
                } else {
                    System.out.println(28);
                }
            } else if (month > 0 && month < 8) {
                if (month % 2 == 0) {
                    System.out.println(30);
                } else {
                    System.out.println(31);
                }
            } else {
                if (month % 2 == 1) {
                    System.out.println(30);
                } else {
                    System.out.println(31);
                }
            }
        }

    }

}
