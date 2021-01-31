package com.caxyer.husnucan;

import java.util.Scanner;

public class Main {

    public static double topla(double x,double y)
    {
        return (x + y);
    } //Toplama İşlemi
    public static double cikar(double x,double y)
    {
        return (x - y);
    } // Çıkarma İşlmei
    public static double carp(double x,double y)
    {
        return x * y;
    } // Çarpma İşlemi
    public static double bol(double x,double y)
    {
        return (x / y);
    }  // Bölme İşlemi

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String islemler =  "1. Toplama\n" +"2. Çıkarma\n" + "3. Çarpma\n"
                + "4. Bölme\n" + "----------------------------------\n" + "Çıkmak için q (quit) tuşuna  basın.";

        System.out.println("__________________________________");
        System.out.println(islemler);
        System.out.println("__________________________________");

        while (true)
        {
            System.out.print("İşlem Seçiniz : ");
            String islem = scan.nextLine();

            if (islem.equals("q"))
            {
                System.out.println("Çıkış Yapılıyor...");
                break;
            }

            else if (islem.equals("1")) // Değer 1 girilirse Toplama İşlemi Başlatılıyor.
            {
                System.out.print("Birinci Sayı:");
                double x = scan.nextDouble();
                System.out.print("İkinci Sayı:");
                double y = scan.nextDouble();
                scan.nextLine();

                System.out.println("_+__________________");
                System.out.println("Sonuç : " + (topla(x, y)));
                System.out.println("____________________");


            }

            else if (islem.equals("2")) // Değer 2 girilirse çıkarma İşlemi Başlatılıyor.
            {
                System.out.print("Birinci Sayı:");
                double x = scan.nextDouble();
                System.out.print("İkinci Sayı:");
                double y = scan.nextDouble();
                scan.nextLine();

                System.out.println("_-__________________");
                System.out.println("Sonuç : " + cikar(x, y));
                System.out.println("____________________");

            }

            else if (islem.equals("3")) // Değer 3 girilirse çarpma İşlemi Başlatılıyor.
            {
                System.out.print("Birinci Sayı:");
                double x = scan.nextDouble();
                System.out.print("İkinci Sayı:");
                double y = scan.nextDouble();
                scan.nextLine();

                System.out.println("_x__________________");
                System.out.println("Sonuç : " + (carp(x, y)));
                System.out.println("____________________");


            }

            else if (islem.equals("4")) // Değer 4 girilirse Bölme İşlemi Başlatılıyor.
            {
                System.out.print("Birinci Sayı:");
                double x = scan.nextDouble();
                System.out.print("İkinci Sayı:");
                double y = scan.nextDouble();
                scan.nextLine();
                System.out.println("_/__________________");
                System.out.println("Sonuç : " + bol(x, y));
                System.out.println("____________________");

            }

            else
            {
                System.out.println("Hatalı veya Yanlış bir değer girdiniz!");
            }
        }
    }
}
