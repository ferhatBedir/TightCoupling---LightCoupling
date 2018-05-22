package com.company;

public class Cube implements Shape {

    @Override
    public int calculate(int i) {
        System.out.println("Küp alanı hesaplanıyor..");
        return i * i * i;
    }
}
