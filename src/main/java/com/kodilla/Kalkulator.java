package com.kodilla;

public class Kalkulator {
    public int addAToB(int a, int b){
        return a + b;
    }

    public int substractAFromB(int a, int b){
        return a - b;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        Kalkulator kalkulator = new Kalkulator();
        int result = kalkulator.addAToB(5, 4);
        System.out.println(result);
    }

}


