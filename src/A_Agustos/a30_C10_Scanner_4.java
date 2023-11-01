package AlıstırmalarAgustos;

import java.util.Scanner;

public class a30_C10_Scanner_4 {
    public static void main(String[] args) {


       // Soru 7(İnterview) -Kullanicidan iki sayi alip
        //                   ikisinin degerlerini degistirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen ilk tamsayiyi giriniz");
        int sayi1=scanner.nextInt();


        System.out.println("Lütfen ikinci tamsayiyi giriniz");
        int sayi2=scanner.nextInt();

        System.out.println("Girdiginiz sayilar=sayi1= " + sayi1 + "sayi2 = " + sayi2);

         int boskova=0;

         boskova=sayi2;

         sayi2=sayi1;

         sayi1=boskova;
;


        System.out.println("Degistirilen degerler=sayi1= " + sayi1 + "sayi2 = " + sayi2);



    }
}
