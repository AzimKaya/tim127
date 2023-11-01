package A_Eylul_H_2;

import java.util.Scanner;

public class e {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int toplam = 0; // Girilen sayıların toplamını tutmak için bir değişken
        int adet = 0;   // Girilen sayıların adedini tutmak için bir değişken

        while (true) {
            System.out.print("Bir tam sayı girin (0'ı girmek için çıkış yapın): ");
            int sayi = scanner.nextInt();

            if (sayi == 0) {
                if (adet == 0) {
                    System.out.println("Hiç sayı girilmedi.");
                } else {
                    double ortalama = (double) toplam / adet;
                    System.out.println("Girilen sayıların ortalaması: " + ortalama);
                }
                break; // Programı sonlandır
            }

            toplam += sayi; // Girilen sayıyı toplama ekleyin
            adet++; // Sayı adedini bir artırın
        }
    }
}
