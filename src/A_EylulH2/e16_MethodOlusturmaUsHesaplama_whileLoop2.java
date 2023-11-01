package A_Eylul_H_2;

import java.util.Scanner;

public class e16_MethodOlusturmaUsHesaplama_whileLoop2 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        //        While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran
        //        bir method olusturun.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ussunun  hesaplanmasını istediğiniz sayiyi giriniz.");
        int sayi=scanner.nextInt();

        System.out.println("Lutfen hesaplanmasını istediginiz sayinin ussunu giriniz.");
        int us=scanner.nextInt();

        ussunudeHesaplaa(5,3);


    }

    public static void ussunudeHesaplaa (int sayi,int us){

        int geciciUs=us;
        int sonuc=1;

        while (geciciUs>0){

            sonuc*=sayi;
            geciciUs--;

        }

        System.out.println(sayi + " uzeri " +us+ " : " +sonuc);

    }
}
