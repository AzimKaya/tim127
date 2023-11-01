package AlıstırmalarAgustos;

import java.util.Scanner;

public class a30_C06_Scanner_5_ {
    public static void main(String[] args) {
        // Soru 7(İnterview) -Kullanicidan iki sayi alip
        //                   ikisinin degerlerini degistirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ilk tamsayiyi girininiz");
        int sayi1=scanner.nextInt();



        System.out.println("Lutfen ikinci tamsayiyi girininiz");
        int sayi2=scanner.nextInt();

        System.out.println("Girdiginiz sayilar sayi1 = " + sayi1 + "sayi2 =" + sayi2);

        int boskova=0;

           boskova=sayi2;

           sayi2=sayi1;

           sayi1=boskova;




        System.out.println("Degistirilen sayilar sayi1 = " + sayi1 + "sayi2 =" + sayi2);



    }
}
