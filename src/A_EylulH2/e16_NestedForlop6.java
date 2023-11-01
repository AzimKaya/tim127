package A_Eylul_H_2;

import java.util.Scanner;

public class e16_NestedForlop6 {
    public static void main(String[] args) {

        //                Soru-Kullanicidan satir ve sutun sayisini alip
        //            asagidaki gibi *'lardan olusan bir sekil cizdirin
        //            1
        //            2 4
        //            3 6 9
        //            4 8 12 16

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir= scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print(j*i+" ");
            }
            System.out.println(" ");
        }


    }
}
