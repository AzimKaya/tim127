package A_Eylul_H_2;

import java.util.Scanner;

public class e16_whileLoop1 {
    public static void main(String[] args) {


        // Kullanicidan toplanmak uzere sayilar isteyin
        // Kullanici 0'a basincaya kadar islemi tekrar ettirin
        // Kullanici 0'a bastiginda girilen sayilarin toplamini yazdirin
        // Dongunun kac kere calisacagi belli olmayan islemlerde while loop tercih edilir

        Scanner scanner=new Scanner(System.in);
        double sayi =44;
        double toplam=0;

        while (sayi != 0){

            System.out.println(" Toplanmak uzere sayilar giriniz\n Bitirmek için 0'a basınız");

            sayi=scanner.nextDouble();

            toplam+=sayi;


        }

        System.out.println("Girilen sayilarin toplam :"+toplam);
    }
}
