package A_Eylul_H_1;

import java.util.Scanner;

public class e01_C04_İfElseStatementsHarf {
    public static void main(String[] args) {

//     Soru     5-  Kullanicidan bir harf isteyin,
        //          girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //          yoksa girilen karakteri yazdirin
        // Clincod pdf


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
         char krk=scanner.next().charAt(0);

         if (krk>='a' && krk<='z'){
             System.out.println(Character.toUpperCase(krk));
         }else{
             System.out.println(krk);
         }


    }


}
