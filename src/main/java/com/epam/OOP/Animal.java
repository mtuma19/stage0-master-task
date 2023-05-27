package com.epam.OOP;

public class Animal {
//Provide it with 3 private fields - color(String), numberOfPaws(int), hasFur(boolean).Provide it with 3 private fields - color(String), numberOfPaws(int), hasFur(boolean).Provide it with 3 private fields - color(String), numberOfPaws(int), hasFur(boolean).v
private String color;
private int numberOfPaws;
private boolean hasFur;

public Animal (String color, int numberOfPaws, boolean hasFur){
    this.color=color;
    this.numberOfPaws= numberOfPaws;
    this.hasFur=hasFur;
}

//Add a methods getDescription(), witch would use class fields and return a string with such pattern "This animal is mostly (color). It has (numberOfPaws) paws and ('a'/'no' -> depends on value of hasFur) fur."
public String getDescription(){
    String fur;
    if(hasFur){
        fur = "a";
    } else {
        fur = "no";
    }
    String paw;
    if(this.numberOfPaws==1){
        paw = "paw";
    } else {
        paw = "paws";
    }
    String str= "This animal is mostly " +this.color +". It has " + this.numberOfPaws +" "+ paw +" and "+ fur +" fur.";

    return str;
}
}
