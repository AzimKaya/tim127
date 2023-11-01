package A_Eylul_H_1;

import java.util.Scanner;

public class e05_C01_egnorCase {
    public static void main(String[] args) {


        // Kullanicidan bir harf isteyin
        // kullanici a yazarsa "Aile"
        // i yazarsa "Is" yazdirin
        // bu harflerin disinda bir karakter girerse
        // "Bu harfi bilmiyorum" yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz ");
        char girilenHarf=scanner.next().charAt(0);

        String harf=girilenHarf+"";

        if (harf.equals("a")||harf.equals("A")){

            System.out.println("Aile");
        } else if (harf.equalsIgnoreCase("i")) {
            System.out.println("İs");
        }else {
            System.out.println("Bu harfi bilmiyorum");

        }

    }
}
