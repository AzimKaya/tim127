package A_Eylul_H_2;

import java.util.Scanner;

public class e16_NestedForlop5 {
    public static void main(String[] args) {

        //                Soru-Kullanicidan satir ve sutun sayisini alip
        //            asagidaki gibi *'lardan olusan bir sekil cizdirin
        //            *
        //            * *
        //            * * *
        //            * * * *

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir= scanner.nextInt();

        for (int i = 1; i <=satir; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print( " * ");
            }
            System.out.println(" ");
        }
    }
}
