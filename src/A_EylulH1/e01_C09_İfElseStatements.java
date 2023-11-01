package A_Eylul_H_1;

import java.util.Scanner;

public class e01_C09_İfElseStatements {
    public static void main(String[] args) {
        // Musteriden satin aldigi urun adedini isteyin

        // adet 100'fazla ise" %20 indirim kazandiniz"

        //adet 50'den fazla ise" %10 indirim kazandiniz"

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen satin aldiginiz urun adedini giriniz");
        int adet=scanner.nextInt();

        if (adet>100){
            System.out.println("%20 indirim kazandiniz");
            System.out.println("Bizi sectiginiz icin tesekkur ederiz");
            System.out.println("kampanyalarimiz hakkinda detay icin wep sitemize bakiniz");

        } else if (adet>50) {

            System.out.println("%10 indirim kazandiniz");
            System.out.println("Bizi sectiginiz icin tesekkur ederiz");
            System.out.println("kampanyalarimiz hakkinda detay icin wep sitemize bakiniz");
        }

    }
}
