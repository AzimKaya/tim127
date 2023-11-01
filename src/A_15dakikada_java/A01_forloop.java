package Alıstirmalar_15dakikada_java;

public class A01_forloop {
    public static void main(String[] args) {

        // 1'den 100'e kadar (100) dahil tamsayilari toplayin
        int toplam=0;
        for (int i = 1; i <=100; i++) {
            toplam+=i;
            System.out.print(toplam);
        }
        System.out.println(" ");

        // verilen iki sayinin ilkinden baslayip ikinciye kadar
        // 3'er 3'er yazdirin (ikinci sayi sartlari saglamiyorsa yazdirilamayabilir)

        int bas=20;
        int bitis =100;

        for (int i = bas; i <=bitis; i+=3) {

            System.out.print(i + " ");

        }
        System.out.println(" ");

        //verilen sayidan baslayarakgeriye 1'e dogru
        // 3 ile bolunebilen sayilari yazdirin

        int input=100;
        for (int i = 100; i >=1; i--) {

            if (i%3==0){
                System.out.print(i+ " ");
            }

        }


    }
}
