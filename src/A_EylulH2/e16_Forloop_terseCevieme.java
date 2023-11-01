package A_Eylul_H_2;

import java.util.Scanner;

public class e16_Forloop_terseCevieme {
    public static void main(String[] args) {

        //Soru 10 (interview)- Kullanicidan bir String isteyin
        //                     ve String’i tersine cevirip kaydedin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String girilenMetin=scanner.nextLine();

        String tersMetin="";

        for (int i = girilenMetin.length()-1; i>=0 ; i--) {

            tersMetin+=girilenMetin.charAt(i);

        }
        System.out.println("Girilen metnin ters hali : "+ tersMetin);

    }
}
