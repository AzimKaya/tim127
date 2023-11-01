package A_Eylul_H_1;

import java.util.Scanner;

public class e08_C10_Forloop {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Baslangic degeri giriniz");
        int baslangıc=scanner.nextInt();

        System.out.println("Bitis degeri giriniz");
        int bitis=scanner.nextInt();

        int tolam=0;

       if (bitis>baslangıc){// Bitis degeri baslangıctan buyukse
           for (int i = baslangıc; i <= bitis; i++) {
               tolam+=i;


           }

       }else {//Bitis degeri baslangictan kucukse

           for (int i = bitis; i <=baslangıc ; i++) {
               tolam+=i;
           }
       }

        System.out.println("Verilen araliktaki sayilarin toplami:"+tolam);
    }
}
