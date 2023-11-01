package Gt_Eylul_H4;

import java.util.Scanner;

public class e30_İfElse4 {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi isteyin
        // sayi 3'e bolunuyorsa 3'e bolunuyor
        // sayi 5'e bolunuyorsa 5'e bolunuyor
        // hem 3, hem 5'e bolunuyorsa "super sayi"
        // ne 3 ne de 5'e bolunmuyorsa "Cope at gitsin" yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi=scanner.nextInt();

        if (girilenSayi%3==0 && girilenSayi%5==0){
            System.out.println("Super sayi");
        } else if (girilenSayi%5==0) {
            System.out.println("Sayi 5e bolunuyor");
        } else if (girilenSayi%3==0) {
            System.out.println("Sayi 3e bolunuyor");
        }else {
            System.out.println("Cope at gitsin");
        }

    }
}
