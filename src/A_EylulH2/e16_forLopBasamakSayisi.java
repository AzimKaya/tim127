package A_Eylul_H_2;

import java.util.Scanner;

public class e16_forLopBasamakSayisi {
    public static void main(String[] args) {


        //Soru 7- Kullanicidan pozitif bir tamsayi alip,
        //        rakamlar toplamini yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamssayi giriniz");
        int girilenSayi=scanner.nextInt();

        int rakam=0;
        int rakamlarToplami=0;

        for (int i = girilenSayi; i >0 ; i/=10) {

          rakam=i%10;
          rakamlarToplami+=rakam;

        }

        System.out.println(girilenSayi+"sayinin rakamlar toplami:"+rakamlarToplami);


        //Ayni soruyu basamak sayisi kadar tekrar eederek bulalim .

        rakamlarToplami=0;
        int basamakSayisi=(girilenSayi+"").length();
        int sayi =girilenSayi;

        for (int i = 1; i <=basamakSayisi; i++) {

            rakam=sayi%10;

            rakamlarToplami+=rakam;

            sayi/=10;

        }

        System.out.println(girilenSayi+"sayinin rakamlar toplami:"+rakamlarToplami);



    }
}
