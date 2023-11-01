package A_Eylul_H_2;

import java.util.Scanner;

public class e16_forloopBasamakSayisi5 {
    public static void main(String[] args) {


        //Soru 7- Kullanicidan pozitif bir tamsayi alip,
        //        rakamlar toplamini yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi=scanner.nextInt();

        int rakamlartoplami=0;

        int rakam=0;

        for (int i = girilenSayi; i >0 ; i/=10) {

            rakam=i%10;

            rakamlartoplami+=rakam;

        }

        System.out.println(girilenSayi+" Girilen sayisinin rakamlar toplami:"+rakamlartoplami);


        System.out.println("====================================");

        rakamlartoplami=0;
        rakam=0;
        int basamakSayisi=(girilenSayi+"").length();
        int sayi=girilenSayi;

        for (int i = 1; i <=basamakSayisi ; i++) {


            rakam=sayi%10;

            rakamlartoplami+=rakam;

            sayi/=10;

        }

        System.out.println(girilenSayi+" Girilen sayisinin rakamlar toplami:"+rakamlartoplami);

    }


}
