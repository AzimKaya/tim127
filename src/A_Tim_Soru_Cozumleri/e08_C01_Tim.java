package A_Tim_Soru_Cozumleri;

import java.util.Scanner;

public class e08_C01_Tim {
    public static void main(String[] args) {
         //Bir kullanıcıdan alınan metni parantez içerisine alın..
         // Eğer metin "Java" kelimesini içeriyorsa,
         // bu kelimenin hemen öncesine ve sonrasına yıldız (*) ekleyin.
         //İçermiyorsa "Bu metin java kelimesi içermiyor" yazdırın.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");

        String girilenMetin=scanner.nextLine();

        String yeniHal="("+girilenMetin+")";




        if (yeniHal.contains("Java")){

            System.out.println(yeniHal+"*"+"Java"+"*");
        }else {
            System.out.println("Bu metin java kelimesi içermiyor");
        }



    }
}
