package com.kodilla;

public class Calculator {
    public void dodawanie(int a, int b){
        System.out.println("suma liczb: "+a+" i "+b+" wynosi: "+(a+b)+"\n");
    }
    public void odejmowanie(int a, int b){
        System.out.println("różnica liczb: "+a+" i "+b+" wynosi: "+(a-b));
    }
    public static void main(String args[]){
        Calculator kalkulator = new Calculator();
        kalkulator.dodawanie(34,54);
        kalkulator.odejmowanie(667, 432);
    }
}
