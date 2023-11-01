package Gt_Ekim_H1;

import java.util.Scanner;

public class ek06_Forloop {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen  baslangıc degeri pozitif bir tamsayi giriniz");
        int basDegeri= scanner.nextInt();
        System.out.println("Lutfen  bitis degeri pozitif bir tamsayi giriniz");
        int bitDegeri= scanner.nextInt();
        int toplam=0;

         if (bitDegeri<bitDegeri){
             System.out.println("Baslangic degeri bitis degerinden kucuk olamaz");
         }else {

             for (int i = basDegeri; i <=bitDegeri ; i++) {
                 toplam+=i;

             }
             System.out.println("Girdiginiz araliktaki sayilarin toplami:"+toplam);
         }


    }
}
