package A_Eylul_H_1;

import java.util.Scanner;

public class e01_C03_İfElseStatementsUcgen {
    public static void main(String[] args) {


        //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin,
        //        degilse “Eskenar degil” yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("Ucgenin uc kenar uzunlugunu giriniz");

        double kenar1=scanner.nextDouble();
        double kenar2=scanner.nextDouble();
        double kenar3=scanner.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar1 > 0){
            System.out.println("Eskenar ucgen");

        }else {
            System.out.println("Eskenar ucgen degil");

        }


    }
}
