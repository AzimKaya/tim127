package Gt_Eylul_H4;

import java.util.Scanner;

public class e30_ifElse6 {
    public static void main(String[] args) {
        //Soru 2-Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        //       (kilo*10000 / (boy *boy)) vucut kitle endeksi
        //        -30’dan buyukse obez,
        //        -25-30 arasi ise kilolu,
        //        -20-25 arasi ise normal,
        //        -20’den kucukse zayif yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen kilogram olarak kilonuzu giriniz");
        double kilo =scanner.nextDouble();

        System.out.println("Lutfen cm olarak boyunuzu giriniz");
        double boy = scanner.nextDouble();

        double vke=(kilo*10000/boy*kilo);

        if (kilo<20 || kilo>200 || boy<30 || boy>200 || vke<10 || vke>50){
            System.out.println("Girilen degerleri kontrol ediniz");

        } else if (vke>30) {
            System.out.println("Obez");

        } else if (vke>25) {
            System.out.println("Kilolu");

        } else if (vke>20) {
            System.out.println("Kilonuz normal sinirlar icinde");

        }else {
            System.out.println("Zayif");
        }

    }
}
