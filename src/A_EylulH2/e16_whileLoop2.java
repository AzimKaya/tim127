package A_Eylul_H_2;

import java.util.Scanner;

public class e16_whileLoop2 {

    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere sayilar isteyin
        // Kullanici 0'a basincaya kadar islemi tekrar ettirin
        // Kullanici 0'a bastiginda girilen sayilarin toplamini yazdirin
        // Dongunun kac kere calisacagi belli olmayan islemlerde while loop tercih edilir

        Scanner scanner=new Scanner(System.in);
        double sayi=11;
        double toplam=0;




        while (sayi!=0){

            System.out.println("Lutfen toplanmak uzere bir sayi giriniz\nişlemi bitirmek icin 0'a basiniz");

           sayi=scanner.nextDouble();
           toplam+=sayi;

        }

        System.out.println("Girilen sayilarin toplami: "+toplam);

    }
}
