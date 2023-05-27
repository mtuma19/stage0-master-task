package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
            for(int i=1; i<=cathetusLength; i++){
               String s= "";
               for(int j=i; j>0; j--){
                   s+=j;
               }
               for(int k=2; k<=i; k++){
                   s+=k;
               }
               for(int t=0; t<cathetusLength-i; t++){
                   s=" "+s;
               }
                System.out.println(s);
            }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
