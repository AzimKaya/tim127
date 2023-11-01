package A_Eylul_H_2;

import java.util.Scanner;

public class e16_MethodOlusturmaUsHesabı_whileLoop {

    public static void main(String[] args) {

        //SORU-4 While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int girilenSayi=scanner.nextInt();

        int rakam=0;
        int rakamlarToplami=0;
        int geciciSayi=girilenSayi;

        while (geciciSayi>0){
            rakam=geciciSayi%10;
            rakamlarToplami+=rakam;
            geciciSayi/=10;
        }

        System.out.println(girilenSayi + " sayisinin rakamlar toplami :"+rakamlarToplami);
    }
}
