package A_Eylul_H_1;

import java.util.Scanner;

public class e01_C06_İfElseStatements {
    public static void main(String[] args) {
        // ogrenciden notu alip gectin veya kaldin yazdiralim
        // ogrenci 0'dan kucuk veya 100'den buyuk bir not girerse
        // "gecersiz not" yazdiralim

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double girilenNot = scanner.nextDouble();

        if (girilenNot > 100 || girilenNot < 0) {
            System.out.println("Gecersiz not");
        } else if (girilenNot > 50) {
            System.out.println("Sinifi gectin");

        } else if (girilenNot < 50) {

        }
    }

}





