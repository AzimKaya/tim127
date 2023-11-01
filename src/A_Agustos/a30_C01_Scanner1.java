package AlıstırmalarAgustos;

import java.util.Scanner;

public class a30_C01_Scanner1 {
    public static void main(String[] args) {

          //  Soru-1 kullacidan uc faarkli data turunde deger alip
          //          girilen degerleri aciklamalariyla yazdirin

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String girilenİsim=scanner.nextLine();

        System.out.println("Girdginiz isim: " + girilenİsim);


        System.out.println("Lutfen yasinizi giriniz");
        int yasınız =scanner.nextInt();
        System.out.println("Girilen yas:" + yasınız );

        System.out.println("Emekli misiniz?True veya folse olarak giriniz");
        boolean emekliMi= scanner.nextBoolean();

        System.out.println("Emekli misiniz " + emekliMi);


    }



}
