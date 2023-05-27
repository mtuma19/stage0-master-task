package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
            if(firstSide+secondSide>thirdSide && firstSide+thirdSide>secondSide && secondSide+thirdSide>firstSide){
                System.out.print("this is a valid triangle\n");
            } else {
                System.out.println("it's not a triangle");
            }
    }

}
