package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        if(monthNumber>2&&monthNumber<6){
            System.out.println("Spring");
        } else if (monthNumber>5&&monthNumber<9) {
            System.out.println("Summer");
        } else if(monthNumber>8&&monthNumber<12){
            System.out.println("Autumn");
        } else if (monthNumber==1||monthNumber==2||monthNumber==12) {
            System.out.println("Winter");
        } else {
            System.out.println("Wrong month number");
        }
    }

}
