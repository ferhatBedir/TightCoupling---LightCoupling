package com.company;

public class CalculateOperations {

    /**
     * Burada sürekli code içerinde square ya da cube değişikliği yapmamak için cube ve square dan nesne oluşturmadık.
     * Bunu dinamik hale getirmek için interface nesnesi oluşturduk.
     * Cube ve Square sınıflarıda interface'i implements ediyor.
     */

    private Shape shape;

    public CalculateOperations(Shape shape) {
        this.shape = shape;
    }

    public void calculateArea(int k) {
        int l = shape.calculate(k);
        System.out.println("Alan = " + l + "m2'dir.");
        System.out.println("Alan hesaplandı.");
    }
}
