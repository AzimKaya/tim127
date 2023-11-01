package Gt_Ekim_H1;

import java.util.Scanner;

public class ek01SwitCaseMevsimler {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan ay numarasini alip mevsimi yazdirin.


        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen ay numarasini giriniz");

        int ayNo=scanner.nextInt();

        switch (ayNo){
            case 1 :
            case 2 :
                System.out.println("Kış");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("İlk Bahar");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("yaz");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("Sonbahar");
                break;
            case 12 :
                System.out.println("Kıs");
                break;
            default:
                System.out.println("Yanlis mevsim numarasi");



        }

    }
}
