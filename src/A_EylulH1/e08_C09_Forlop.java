package A_Eylul_H_1;

import java.util.Scanner;

public class e08_C09_Forlop {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //Bitis degeri baslangic degerinden kucuk olsa da program calissin
        Scanner scanner=new Scanner(System.in);
        System.out.println("Baslangic degeri giriniz");
        int bas=scanner.nextInt();

        System.out.println("Bitis degeri giriniz");
        int bitis=scanner.nextInt();

        int tolam=0;

        if (bas>bitis){
            System.out.println("Bitis degerei baslangıc degerinden kucuk olamaz");
        }else {

            for (int i = bas; i <= bitis; i++) {

                tolam+=i;

            }

            System.out.println("Girilen araliktaki sayilarin toplami:"+tolam);
        }



    }
}
