package AlıstırmalarAgustos;

import java.util.Scanner;

public class a30_C05_İfStatements {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //         ucgen eskenar ise “Eskenar ucgen” yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        double kenar3= scanner.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar2>0){
            System.out.println("Eskenar ucgen yazdirir");
        }


    }
}
