package A_Eylul_H_1;

import java.util.Scanner;

public class e01_C01_İfStatemennts {
    public static void main(String[] args) {


        // Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        //         50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner=new Scanner(System.in);
        double not=scanner.nextDouble();



        if (not>=50){
            System.out.println("Tebrikler,Sinifi gectin.");
        }else {
            System.out.println("Malesef kaldin ayvayi yedin.");
        }

    }
}
