package AlıstırmalarAgustos;

import java.util.Scanner;

public class a30_C07_SoruRakamlartoplami {
    public static void main(String[] args) {

        // Kullacıdan  3 basamakli pozitif bir tam sayi alip
        // sayinin rakamlar toplamini yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen uc basamaklı pozitif bir tamsayi giriniz");
        int girilenSayi=scanner.nextInt();

        int rakamlarToplami=0;
        int rakam=0;

        rakam=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+rakam;
        girilenSayi=girilenSayi/10;


        rakam=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+rakam;
        girilenSayi=girilenSayi/10;

        rakam=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+rakam;
        girilenSayi=girilenSayi/10;


        System.out.println("Girilen sayinin rakamlar toplami: "+ rakamlarToplami);



    }
}
