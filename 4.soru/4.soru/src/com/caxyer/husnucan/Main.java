package com.caxyer.husnucan;

import java.util.Scanner;

public class Main {
    public static int fib1(int fibo)
    {
        if(fibo==1){return 1;}
        if(fibo==0){return 1;}
        return fib1 (fibo-1)+fib1 (fibo-2);
    }

    public static int fib2(int fibo)
    {
        if(fibo==1){return 1;}
        if(fibo==0){return 1;}
        return fib2 (fibo-1)+fib2 (fibo-2);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("1. Fibonacci değerini giriniz:");  // İlk Fibonnacci değerinin istenmesi.

        int step1 = scan.nextInt();
        int[] dizi1 = new int[step1];

        for (int i = 0; i < step1; i++)
        {
            dizi1[i] = fib1(i);
            System.out.print(fib1(i) + "\t");
        }

        Scanner scan2 = new Scanner(System.in);
        System.out.print("\n2. Fibonacci değerini giriniz:");  // 2. Fibonnacci değerinin istenmesi.

        int step2 = scan2.nextInt();

        int[] dizi2 = new int[step2];

        for (int i = 0; i < step2; i++)
        {
            dizi2[i] = fib2(i);
            System.out.print(fib2(i) + "\t");
        }

        // Değerlerin karşılaştırılıyor Farklı ise farklı Aynı ise aynı yazılıyor.
        if (step1 == step2)
        {
            System.out.println("\n__________________");
            System.out.println("Diziler Aynıdır.");

        }

        else if (step1 != step2)
        {
            System.out.println("\n__________________");
            System.out.println("Diziler Farklıdır.");
        }
    }
}