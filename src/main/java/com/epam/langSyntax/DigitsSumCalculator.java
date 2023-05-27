package com.epam.langSyntax;

public class DigitsSumCalculator {
    public static final int digits =4;
    public void calculateSum(int number) {
        int sum=0;
        for(int i=0; i<digits; i++){
            sum+=number%10;
            number=number/10;
        }
        System.out.println(sum);
    }

}
