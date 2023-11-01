package A_Eylul_H_1;

import java.util.Scanner;

public class e01_C08_İfElseStatements {
    public static void main(String[] args) {

        //Soru 2-Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        //       (kilo*10000 / (boy *boy)) vucut kitle endeksi
        //        -30’dan buyukse obez,
        //        -25-30 arasi ise kilolu,
        //        -20-25 arasi ise normal,
        //        -20’den kucukse zayif yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen  kg olarak kilonuzu giriniz");
        double kilo=scanner.nextDouble();

        System.out.println("Lutfen cm olarak boyunuzu giriniz");
        double boy=scanner.nextDouble();

         double vke=(kilo*10000/(boy*boy) );
        System.out.println("Vucut kitle indeksiniz vke:" +vke);

        if (kilo< 20 || kilo>200 || boy<30||boy>200||vke<10 ||vke>50){
            System.out.println("Girilen degerleri kontrol ediniz");
        } else if (vke>30) {
            System.out.println("obez");
        } else if (vke>25) {
            System.out.println("kilolu");
        } else if (vke>20) {
            System.out.println("normal");
        }else {
            System.out.println("zayif");
        }


    }
}
