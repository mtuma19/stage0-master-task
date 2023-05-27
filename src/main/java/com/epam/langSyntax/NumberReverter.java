package com.epam.langSyntax;

public class NumberReverter {
    public static final int digits =3;
    public void revert(int number) {
        int result = 0;
        for(int i=0; i<digits; i++){
            result = result*10 +number%10;
            number = number/10;
        }
        System.out.println(result);
    }

}
