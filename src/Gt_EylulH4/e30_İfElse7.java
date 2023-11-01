package Gt_Eylul_H4;

import java.util.Scanner;

public class e30_İfElse7 {
    public static void main(String[] args) {

        // Musteriden satin aldigi urun adedini isteyin

        // adet 100'fazla ise" "%20 indirim kazandiniz""

        //adet 50'den fazla ise" %10 indirim kazandiniz"


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen satin aldiginiz urun adedini giriniz");
        int adet =scanner.nextInt();

        if (adet>100){
            System.out.println("%20 indirim kazandiniz");
        } else if (adet>50){
            System.out.println("%10 indirim kazandiniz");
        }




    }
}
