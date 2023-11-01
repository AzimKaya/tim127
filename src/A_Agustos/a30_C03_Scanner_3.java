package AlıstırmalarAgustos;

import java.util.Scanner;

public class a30_C03_Scanner_3 {
    public static void main(String[] args) {

        //Soru-5 Kullacidan ismini soyismini ve yasini alip asagidaki formatta yazdirin
        //            girilen bilgiler:J  Doe,44


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        char isimilkharf=scanner.nextLine().charAt(0);

        System.out.println("Lutfen soyisminizi giriniz");
        String soyİsim=scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        int yas=scanner.nextInt();

        System.out.println("Girilen bilgiler:"+isimilkharf +" "+  soyİsim +" ,"+ yas );

    }
}
