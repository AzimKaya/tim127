package A_Eylul_H_2;

import java.util.Scanner;

public class e16_NestedForlop2 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satir=scanner.nextInt();

        System.out.println("Lutfen sutun sayisini giriniz");
        int sutun=scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <=sutun ; j++) {
                System.out.print("*   ");
            }
            System.out.println(" ");
        }

    }


}
