package A_Eylul_H_2;

import java.util.Scanner;

public class e16_NestedForlop_Factryel2 {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
        //        bu sayinin faktoryel degerini hesaplayin.
        //        Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //        Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 20'kucuk bir sayi giriniz");
        int sayi = scanner.nextInt();


        System.out.print(sayi + "!= ");
        long facteryelSonucu = 1;
        for (int i = sayi; i >= 1; i--) {
            facteryelSonucu *= i;

            if (i != 1) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i + " * =");
            }

        }
        System.out.println(facteryelSonucu);


    }
}
