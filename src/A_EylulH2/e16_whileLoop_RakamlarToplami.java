package A_Eylul_H_2;

import java.util.Scanner;

public class e16_whileLoop_RakamlarToplami {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        //        While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran
        //        bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen us hesaplamak istediginiz pozitif tamsayiyi giriniz");
        int sayi = scanner.nextInt();


        System.out.println("Lutfen hesaplanacak us degerini pozitif tamsayi olarak giriniz");
        int us = scanner.nextInt();

        usHesapla(5,3);


    }

    public static void usHesapla(int sayi, int us){

        int geciciUs=us;
        int sonuc=1;

        while (geciciUs>0){

            sonuc*=sayi;
            geciciUs--;

        }

        System.out.println(sayi + " uzeri " +us+ ":" +sonuc);

    }


}
