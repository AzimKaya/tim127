package A_Eylul_H_2;

import java.util.Scanner;

public class e16_MethodOlusturmaSifre_whileLoop {
    public static void main(String[] args) {

//Soru 4 : Kullanicidan bir sifre isteyip,
//         asagidaki sartlari kontrol edin ve
//         kullaniciya duzeltmesi gereken tum eksikleri soyleyin,ve yeni deger isteyin
//         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
//             - ilk harf kucuk harf olmali
//             - son karakter rakam olmali
//             - sifre bosluk icermemeli
//             - uzunlugu en az 10 karakter olmali



        Scanner scanner=new Scanner(System.in);
        String sifre=" ";
       while (!sifreKonrolEt(sifre)){

           System.out.println("Lutfen sifrenizi giriniz");
           sifre=scanner.nextLine();




       }

    }

    public static boolean sifreKonrolEt(String sifre){

        // flag kullanalim
        int flag = 10;


        char ilkHarf=sifre.charAt(0);

        if (!(ilkHarf>='a' && ilkHarf<='z')){
            System.out.println("İlk karakter kucuk harf olmali");

            flag=11;
        }
        //Son karakter rakam olmali

        char sonKarakter=sifre.charAt(sifre.length()-1);

        if (!(sonKarakter>='0' && sonKarakter<='9')){
            System.out.println("Son karakter rakam olmali");
        }

        flag=11;

        //sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");

            flag=11;


        }
        //uzunlugu en az 10 karakter olmali

        if (!(sifre.length()>=10)){
            System.out.println("uzunlugu en az 10 karakter olmali");
            flag=11;
        }

        if (flag==10){

            return true;

        }else {

            return false;

        }


    }
}
