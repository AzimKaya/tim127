package A_Eylul_H4;

import java.util.Scanner;

public class ek_StringTersi {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Bir cümle girin: ");
        String cumle = scanner.nextLine();

        String tersCumle = terseCevir(cumle);


        // Sonucu ekrana yazdır
        System.out.println("Ters çevrilmiş cümle: " + tersCumle);


    }
    public static String terseCevir(String cumle) {

        String tersCumle = "";

        // Cümleyi tersten tarayarak tersCumle'ye ekleyin
        for (int i = cumle.length()-1 ; i >= 0; i--) {

            char karakter = cumle.charAt(i); // Cümlenin i. karakterini al

            // Karakteri tersCumle'ye ekle
            tersCumle += karakter;
        }

        // Ters çevrilmiş cümleyi döndür
        return tersCumle;
    }


}
