package A_Eylul_H3;

import java.util.Arrays;
import java.util.Scanner;

public class e23_ArraysK {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i
        //        olusturan ve bize donduren bir method olusturun.

        String[] kullanicidanalinanArray=stringArraysOlustur();
        System.out.println(Arrays.toString(kullanicidanalinanArray));

    }

    public static String[] stringArraysOlustur(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Arraysin uzunlugunu giriniz");
        int arrLeng=scanner.nextInt();

        String[] kullanıcıArrayi=new String[arrLeng];
        scanner=new Scanner(System.in);

        for (int i = 0; i <kullanıcıArrayi.length ; i++) {

            System.out.println("Arraya eklemek icin bir isim soyleyin");
            kullanıcıArrayi[i] = scanner.nextLine();
        }


return kullanıcıArrayi;

    }
}
