package com.mycompany.armstrongsayisibulma;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //1634 = 1^4 + 6^4 + 3^4 + 4^4 (4 basamak sayisi)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayiyi Giriniz : ");
        int sayi = scanner.nextInt();
        System.out.println("Basamak Sayisi : ");
        int basamakSayisi = scanner.nextInt();

        int gecici_sayi = sayi;
        int toplam = 0;

        do {
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi = gecici_sayi / 10;

            toplam += Math.pow(basamak_degeri, basamakSayisi);

        } while (gecici_sayi > 0);
        if (sayi == toplam) {
            System.out.println(sayi + " = " + toplam + " Bu sayi bir armstrong sayisidir");
        } else {
            System.out.println(sayi + " = " + toplam + " Bu sayi bir armstrong sayisi degildir");
        }
    }

}
