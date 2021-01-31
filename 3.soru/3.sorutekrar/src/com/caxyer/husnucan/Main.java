package com.caxyer.husnucan;

import java.util.Random;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        int[] dizi = new int[100];
        Random rnd = new Random(100); // Sayıları rastgele üretiyor.

        for (int i=0;i<dizi.length;i++){
            dizi[i]=rnd.nextInt(100);
        }

        yazdir(dizi);      // Ekrana Yazdırıyor.
        kucuksirala(dizi); // Sayıları Küçükten Büyüğe sıralıyor.
        buyuksirala(dizi); // Sayıları Büyükten Küçüğe Sıralıyor.
        teksayiyaz(dizi);  // Tek Sayıları Yazdırıyor.
        ciftsayiyaz(dizi); // Çift Sayıları Yazdırıyor.
        teksiralak(dizi);  // Tek Sayıları Küçükten Büyüğe Sıralıyor.
        ciftsiralak(dizi); // Çift Sayıları Küçükten Büyüğe Sıralıyor.
        teksiralab(dizi);  // Tek Sayıları Büyükten Küçüğe Sıralıyor.
        ciftsiralab(dizi); // Çift Sayıları Büyükten Küçüğe Sıralıyor.

    }

    public static void yazdir(int dizi[])
    {
        System.out.println("----------------------------------------------");
        for (int i =  0; i < dizi.length; i++)
        {
            System.out.println("Üretilen "+(i+1)+". Sayı = "+dizi[i]);
            System.out.println("______________________________________________");

        }
        System.out.println("**********************************************");
    }

    public static void kucuksirala(int dizi[]) // Küçükten Büyüğe Sıralıyor.
    {
        System.out.println("----------------------------------------------");

        Arrays.sort(dizi);
        for (int i = 0; i < dizi.length; i++)
        {
            System.out.println("Küçükten büyüğe " + (i + 1) + ". Elemanı: " + dizi[i]);
            System.out.println("----------------------------------------------");
        }
        System.out.println("**********************************************");
    }


    public static void buyuksirala(int dizi[]) // Büyükten Küçüğe Sıralıyor.
    {
        System.out.println("----------------------------------------------");

        int y;
        for (int i = 0; i < 99; i++) {
            for (int j = i + 1; j < 100; j++) {
                if (dizi[j] > dizi[i]) {
                    y = dizi[j];
                    dizi[j] = dizi[i];
                    dizi[i] = y;
                }
            }
            System.out.println("Büyükten Küçüğe " + (i + 1) + ". Elemanı: " + dizi[i]);
            System.out.println("----------------------------------------------");
        }
        System.out.println("**********************************************");
    }

    public static void ciftsayiyaz(int dizi[]) // Çift Sayıları Yazdırıyor.
    {
        System.out.println("----------------------------------------------");
        for (int i = 1; i < dizi.length; i++)
        {

            if (dizi[i] % 2 == 0)
            {
                System.out.println("Çift Sayı: " + dizi[i]);
                System.out.println("----------------------------------------------");
            }
        }
        System.out.println("**********************************************");
    }

    public static void teksayiyaz(int dizi[]) // Tek Sayıları Yazdırıyor.
    {
        System.out.println("----------------------------------------------");
        for (int i = 1; i < dizi.length; i++)
        {
            if (dizi[i] % 2 == 1)
            {
                System.out.println("Tek Sayı: " + dizi[i]);
                System.out.println("----------------------------------------------");
            }
        }
        System.out.println("**********************************************");
    }

    public static void teksiralak(int dizi[]) // Tek Sayıları Küçüükten Büyüğe Sıralıyor.
    {
        System.out.println("----------------------------------------------");

        Arrays.sort(dizi);
        for (int i = 0; i < dizi.length; i++)
        {
            if (dizi[i] % 2 == 1)
            {
                System.out.println("Küçükten Büyüğe Tek Sayı: " + dizi[i]);
                System.out.println("----------------------------------------------");
            }
        }
        System.out.println("**********************************************");
    }

    public static void teksiralab(int dizi[]) //Tek Sayıları Büyükten Küçüğe Sıralıyor.
    {
        System.out.println("----------------------------------------------");
        for (int i = 1; i < dizi.length; i++)
        {
            if (dizi[i] % 2 == 1)
            {
                System.out.println("Büyükten Küçüğe Tek Sayı: " + dizi[i]);
                System.out.println("----------------------------------------------");
            }
        }
        System.out.println("**********************************************");
    }

    public static void ciftsiralak(int dizi[]) // Çift Sayıları Küçükten Büyüğe Sıralıyor.
    {
        System.out.println("----------------------------------------------");

        Arrays.sort(dizi);
        for (int i = 0; i < dizi.length; i++)
        {
            if (dizi[i] % 2 == 0)
            {
                System.out.println("Küçükten Büyüğe Çift Sayı: " + dizi[i]);
                System.out.println("----------------------------------------------");
            }
        }
        System.out.println("**********************************************");

    }

    public static void ciftsiralab(int dizi[]) // Çift Sayıları Büyükten Küçüğe Sıralıyor.
    {
        System.out.println("----------------------------------------------");
        for (int i = 0; i < dizi.length; i++)
        {
            if (dizi[i] % 2 == 0)
            {
                System.out.println("Büyükten Küçüğe Çift Sayı: " + dizi[i]);
                System.out.println("----------------------------------------------");
            }
        }
        System.out.println("**********************************************");
    }
}
