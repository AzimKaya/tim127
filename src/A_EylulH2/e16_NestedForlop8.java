package A_Eylul_H_2;

import java.util.Scanner;

public class e16_NestedForlop8 {

    public static void main(String[] args) {
        // Kullanıcıdan satır değeri isteyin ve konsola şu tip yazdırın
        // Kullanıcı 4 girerse alta doğru artarak 4 satır, sonraki 3 satır azalarak olacak
        // Kullanıcı 10 girerse alta doğru artarak 10 satır, sonraki 9 satır azalarak olacak
        // *
        // * *
        // * * *
        // * * * *
        // * * *
        // * *
        // *


        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int satirSayisi = scanner.nextInt();

        for (int i = 1; i <=satirSayisi ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }

        for (int i = satirSayisi-1; i >=1 ; i--) {

            for (int j = 1; j <=i ; j++) {

                System.out.print("*");
            }
            System.out.println("");

        }

    }
}
