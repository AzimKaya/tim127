package A_Eylul_H_1;

import java.util.Scanner;

public class e08_C06_SitringMnipulations {

    public static void main(String[] args) {

        //Soru 6 : Kullanicidan bir String alin,
        //         String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        //         String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz ");
        String girilenMetin=scanner.nextLine();

        int uzunluk =girilenMetin.length();
        String yeniHal="";

        if (uzunluk %2 ==0){// uzunluk çiftse
            yeniHal=girilenMetin.substring(0,uzunluk/2)+":)"+girilenMetin.substring(uzunluk/2);

        }else {
            yeniHal=girilenMetin.substring(0,uzunluk/2)+":("+girilenMetin.substring((uzunluk+1)/2);

        }

        System.out.println(girilenMetin+"yazdiniz ve ben o metni degistirdim "+yeniHal);

    }
}
