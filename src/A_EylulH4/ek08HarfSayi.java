package A_Eylul_H4;

import java.util.Scanner;

public class ek08HarfSayi {

    //Sorun: Verilen bir cümledeki harflerin ve rakamların sayısını ayrı ayrı hesaplayan
    // bir Java programı yazın.
    // Örneğin, "Merhaba123" cümlesi için harf sayısı 7 ve rakam sayısı 3 olmalıdır.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir cümle alın
        System.out.print("Bir cümle girin: ");
        String cumle = scanner.nextLine();

        // Harf ve rakam sayısını hesapla
        int harfSayisi = 0;
        int rakamSayisi = 0;



        for (int i = 0; i < cumle.length(); i++) {
            char karakter = cumle.charAt(i); // Cümlenin i. karakterini al

           // Karakter harf mi diye kontrol et
           if (Character.isLetter(karakter)) {
               harfSayisi++;
           }

           // Karakter rakam mı diye kontrol et
           if (Character.isDigit(karakter)) {
               rakamSayisi++;
           }
        }

        // Sonucu ekrana yazdır
        System.out.println("Harf sayısı: " + harfSayisi);
        System.out.println("Rakam sayısı: " + rakamSayisi);
    }



}


