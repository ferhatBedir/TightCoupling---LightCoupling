package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * cO metoduna parametre olrak bir cube ya da square nesnesi veriyoruz ve buna göre kare mi yoksa
         * küpmü olduğunu algılayıp hesaplama işlemi yapılıyor.
         * Eğer CalculateOperations sınıfı içerisinde Square ya da Cube nesnesi oluştursaydık bu durumda surekli
         * CalculateOperations sınıfı içerisnden bunu değiştirecektik.
         * Bu durumda tight coupling olacaktı.(istenmeyen durum)
         * Interface kullanarak bu işlemi main metot ile yaptık ve artık bizim alan hesabımız dinamik durumda.
         * Main metot içerisinde cube ya da square  gelmesi fark etmeden işlem yapılabiliyoruz.
         * Bu şekilde light coupling yapısını kullandık.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birim uzunlugu giriniz..");
        int i = Integer.parseInt(scanner.nextLine());
        CalculateOperations cO = new CalculateOperations(new Cube());
        cO.calculateArea(i);
    }
}
