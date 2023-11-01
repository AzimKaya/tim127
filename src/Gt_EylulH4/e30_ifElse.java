package Gt_Eylul_H4;

import java.util.Scanner;

public class e30_ifElse {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        //         50’den kucukse “Maalesef kaldin” yazdirin.


        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not= scanner.nextDouble();

        if (not>=50){
            System.out.println("Sınıfı Gectin");
        }else {
            System.out.println("Maalesef kaldin");
        }


    }
}
