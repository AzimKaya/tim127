package Gt_Eylul_H4;

import java.util.Scanner;

public class e30_İfElse5 {
    public static void main(String[] args) {

        // ogrenciden notu alip gectin veya kaldin yazdiralim
        // ogrenci 0'dan kucuk veya 100'den buyuk bir not girerse
        // "gecersiz not" yazdiralim


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double not = scanner.nextDouble();

        if (not>100 || not<0){
            System.out.println("gecersiz not");
        } else if (not>=50) {
            System.out.println("Sınıfi gectin");

        }else {

            System.out.println("Maalesef kaldin");
        }

    }
}
