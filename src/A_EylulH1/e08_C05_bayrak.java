package A_Eylul_H_1;

import java.util.Scanner;

public class e08_C05_bayrak {
    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip,
        //         asagidaki sartlari kontrol edin ve
        //         kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //          - ilk harf kucuk harf olmali
        //          - son karakter rakam olmali
        //          - sifre bosluk icermemeli
        //          - uzunlugu en az 10 karakter olmali


        int flag = 10;


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre=scanner.nextLine();

        char ilkHarf=sifre.charAt(0);

        if (!(ilkHarf>='a' && ilkHarf<'z')){
            System.out.println("İlk karakter buyuk harf olmali");
            flag=11;

        }

        char sonKayakter=sifre.charAt(sifre.length()-1);

        if (!(sonKayakter>='0' && sonKayakter<'9')){
            System.out.println("Son karakter rakam olmali");
            flag=11;
        }



        if (sifre.contains("")){
            System.out.println("Sifre bosluk icermemeli");
            flag=11;

        }


        if (!(sifre.length()>=10)){
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            flag=11;


        }


        if (flag==10){
            System.out.println("Sifre basariyla kaydedildi");
        }



    }
}
