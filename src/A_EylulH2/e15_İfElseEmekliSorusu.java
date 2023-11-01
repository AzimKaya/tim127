package A_Eylul_H_2;

import java.util.Scanner;

public class e15_İfElseEmekliSorusu {
    public static void main(String[] args) {

       // Soru 2-  Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //         yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak "Emekli
        //         olabilirsin" veya "Emekli olmak icin .. Yil daha calisman gerekir" yazdirin.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi erkek ise 'E' kadin ise 'K'  giriniz" );

        char cinsiyet =scanner.next().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scanner.nextInt();

        if ((cinsiyet == 'K'|| cinsiyet =='k') && yas>=60){
            System.out.println("Kadin emekli olabilir");
        }if ((cinsiyet == 'K'|| cinsiyet=='k') && yas<60){
            System.out.println("Emekli olabilmek icin" +(60-yas)+"yıl daha calısman gerekir");

        }if ((cinsiyet == 'E'|| cinsiyet=='e') && yas>=65){
            System.out.println("Erkek emekli olabilir");

        }if ((cinsiyet == 'E'|| cinsiyet=='e') && yas<65){
            System.out.println("Emekli olabilmek icin "+(65-yas)+"yıl daha calısman gerekir");

        }else {
            System.out.println("Girdiginiz degerlerden en az biri yanlistir");
        }

    }
}
