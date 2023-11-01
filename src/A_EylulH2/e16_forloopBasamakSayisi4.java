package A_Eylul_H_2;

import java.util.Scanner;

public class e16_forloopBasamakSayisi4 {
    public static void main(String[] args) {

        //Soru 7- Kullanicidan pozitif bir tamsayi alip,
        //        rakamlar toplamini yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi=scanner.nextInt();

        int rakamalartoplami=0;
        int rakam=0;

        for (int i = girilenSayi; i >0; i/=10) {

            rakam=i%10;
            rakamalartoplami+=rakam;

        }

        System.out.println(girilenSayi+"Girilen sayinin rakamlar toplami"+rakamalartoplami);


        System.out.println("==============================");


        rakamalartoplami=0;
        rakam=0;
        int basamaksayisi=(girilenSayi+"").length();
        int sayi =girilenSayi;

        for (int i = 1; i <=basamaksayisi ; i++) {

            rakam=sayi % 10;
            rakamalartoplami+=rakam;
            sayi/=10;

        }

        System.out.println(girilenSayi+"Girilen sayinin rakamlar toplami"+rakamalartoplami);
    }
}
