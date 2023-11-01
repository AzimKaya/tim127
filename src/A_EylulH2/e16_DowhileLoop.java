package A_Eylul_H_2;

import java.util.Scanner;

public class e16_DowhileLoop {
    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere sayilar isteyin
        // Kullanici 0'a basincaya kadar islemi tekrar ettirin
        // Kullanici 0'a bastiginda girilen sayilarin toplamini yazdirin

        Scanner scanner =new Scanner(System.in);

        int toplam=0;
        int sayi=0;

        do {
            System.out.println("Lutfen toplanmak uzere bir sayi giriniz");
            sayi =scanner.nextInt();

            toplam+=sayi;

        }while ( sayi!=0);

        System.out.println("Girilen sayilarin toplami:"+toplam);


    }
}
