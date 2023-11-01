package A_Eylul_H_1;

import java.util.Scanner;

public class e04_C01_İfElseEmekli {
    public static void main(String[] args) {


        // Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //         Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //         Cinsiyet ve yasini dikkate alarak
        //         “Emekli olabilirsin” veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.


        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz E:Erkek,K:Kadin");
        char cinsiyet=scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas=scanner.nextDouble();

        if (yas<20 || yas>100 || !(cinsiyet =='E' || cinsiyet=='K')){
            System.out.println("Girilen bilgilerde hata var");

        } else if (cinsiyet =='E' && yas>65) {
            System.out.println("Erkek emekli olabilir");

        } else if (cinsiyet == 'E' && yas<60) {
            System.out.println("Erkek emekli olamak icin daha" +(65-yas)+"yil daha calismalidir.");

        } else if (cinsiyet=='K' && yas>60) {
            System.out.println("Kadin emekli olabilir");

        } else {
            System.out.println("Erkek emekli olamak icin daha" +(60-yas)+"yil daha calismalidir.");

        }


    }

}
