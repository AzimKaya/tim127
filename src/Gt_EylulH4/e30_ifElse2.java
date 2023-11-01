package Gt_Eylul_H4;

import java.util.Scanner;

public class e30_ifElse2 {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //         girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");
        char krk =scanner.next().charAt(0);

        if (krk>='A' && krk<='Z'){
            System.out.println("Girilen harf buyuk harf");
        }else {
            System.out.println("Girilen harf buyuk harf deggil");
        }


    }
}
