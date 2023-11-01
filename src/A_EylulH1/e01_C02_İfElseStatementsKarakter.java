package A_Eylul_H_1;

import java.util.Scanner;

public class e01_C02_İfElseStatementsKarakter {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //         girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        char krk =scanner.next().charAt(0);

        if (krk>= 'A' && krk<='Z' ){
            System.out.println("Buyuk harf yazdirir");
        }else {
            System.out.println("Kucuk harf yazdirir");
        }

    }
}
