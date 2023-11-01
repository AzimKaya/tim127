package AlıstırmalarAgustos;

import java.util.Scanner;

public class a30_C02_Scanner_2 {
    public static void main(String[] args) {

        // Soru

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen dikdörtgenin kenar uzunluklarini giriniz");

        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();

        System.out.println("dikdörtgenin alani:" + kenar1*kenar2);

    }
}
