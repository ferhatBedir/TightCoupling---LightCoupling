package com.company;

public class Square implements Shape {

    @Override
    public int calculate(int i) {
        System.out.println("Kare alanı hesaplanıyor..");
        return i * i;
    }
}
