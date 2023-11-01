package Gt_Ekim_H1;

import java.util.Scanner;

public class ek01SwithCase {
    public static void main(String[] args) {
        // Kullanicinin girdigi gun numarasina gore
        //  gun isimlerini yazdirin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen gun numarasi giriniz");

        int gunNo=scanner.nextInt();

        switch (gunNo){

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta ici");
                break;
            case 6:
                System.out.println("Hahta sonu");
                break;
            case 7:
                System.out.println("Hahta sonu");
                break;
            default:
                System.out.println("Yanlis gun numarasi");


        }

    }
}
