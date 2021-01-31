package com.caxyer.husnucan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // String ifadede kullanıcı adı ve şifre parametrelerinin tanımlanması.
        String username = "Caxyer";
        String password = "1478";

        while (true)
        {
            // Kullanıcı adı şifre girişi isteniyor.
            System.out.print("Kullanıcı Adı Giriniz: ");
            String usr = scanner.nextLine();
            System.out.print("Pin Giriniz: ");
            String pass = scanner.nextLine();

            //Giriş Başarılı İse Ekrana Başarılı Değilse Başarısız yazdırıp sürekli tekrar soruyor.

            if (usr.equals(username) && pass.equals(password)) {
                System.out.println("______________________");
                System.out.println("Giriş Başarılı!");
                break;

            }
            else
                {

                System.out.println("Kullanıcı Adı veya Pin Hatalı!, Lütfen Tekrar Kontrol Ediniz");

                }
        }
    }
}
