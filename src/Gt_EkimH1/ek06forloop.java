package Gt_Ekim_H1;

import java.util.Scanner;

public class ek06forloop {
    public static void main(String[] args) {

        /*
         * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
         * döngüden çıkılsın
         *
         * Bugün hava oldukca güzel.-> 2
         *
         *
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir cumle yaziniz");
        String cumle =scanner.nextLine();
        int sayac=0;

        for (int i = 0; i <cumle.length() ; i++) {

            if (cumle.toUpperCase().charAt(i)=='A'){
                sayac++;

            }
            if (cumle.toUpperCase().charAt(i)=='C'){
                break;

            }
        }
        System.out.println("Cumlenizde "+sayac+"adet a harfi vardir");
    }
}
