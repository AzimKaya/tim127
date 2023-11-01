package Gt_Ekim_H1;

import java.util.Scanner;

public class ek01ElsifEmekli {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //         Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //         Cinsiyet ve yasini dikkate alarak
        //         “Emekli olabilirsin” veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz E:Erkek K:Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas =scanner.nextDouble();

        if (yas<20 || yas>80 || !(cinsiyet=='E'|| cinsiyet=='K')){

            System.out.println("Girilen bilgilerde hata var");
        } else if (cinsiyet=='E' && yas>=65){
            System.out.println("Erkek emekli olabilir");
        } else if (cinsiyet=='E' && yas<65) {
            System.out.println("Erkek emekli olmak icin "+(65-yas)+"yl calısmali");
        } else if (cinsiyet == 'K' && yas>60) {
            System.out.println("Kadin emekli olabilir");
        } else {
            System.out.println("Kadin emekli olmak icin "+(60-yas)+"yl calısmali");
        }

    }
}
