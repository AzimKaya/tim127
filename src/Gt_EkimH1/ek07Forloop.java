package Gt_Ekim_H1;

import java.util.Scanner;

public class ek07Forloop {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        for (int i = 0; i <5 ; i++) {
            System.out.print(i+1 +".sayi:");
            sayi=scanner.nextInt();
            if (sayi>=5 && sayi<=10){
                continue;
            }
            toplam+=sayi;
        }
        System.out.println("toplam = " + toplam);


    }
}
