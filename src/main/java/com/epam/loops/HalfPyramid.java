package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
                for(int i=0; i<cathetusLength; i++){
                    String s="";
                    for(int j=cathetusLength-i; j>1; j--){
                        s= " "+s;
                    }
                    for(int k =0; k<=i; k++){
                        s=s+"*";
                    }
                    System.out.println(s);
                }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
