package Gt_Ekim_H1;

import java.util.Scanner;

public class ek06_Fprloop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");

        int girilenSayi =scanner.nextInt();

        for (int i = 0; i <=girilenSayi ; i++) {

            if (i%7==0){
                System.out.print(i+" - ");
            }
        }
        System.out.println("===============islam tamamlandi");

    }
}
