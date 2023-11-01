package A_Ekim_H3;

import java.util.Scanner;

public class İfElse {

    //Soru: Bir kullanıcıdan yaş ve cinsiyet bilgisi alın. Ardından, yaşa ve cinsiyete göre belirli bir mesaj gösteren bir Java programı yazın.
    //
    //Eğer kullanıcı 18 yaşın altındaysa ve erkekse "Genç bir erkeksiniz." mesajı gösterilsin.
    //Eğer kullanıcı 18 yaşın altındaysa ve kadınsa "Genç bir kızsınız." mesajı gösterilsin.
    //Eğer kullanıcı 18 yaş veya üstündeyse ve erkekse "Yetişkin bir erkeksiniz." mesajı gösterilsin.
    //Eğer kullanıcı 18 yaş veya üstündeyse ve kadınsa "Yetişkin bir kadınsınız." mesajı gösterilsin.

    public static void main(String[] args) {


            // Kullanıcıdan yaş ve cinsiyet bilgisi alın

            Scanner scanner = new Scanner(System.in);
            System.out.print("Yaşınızı giriniz: ");
            int yas = scanner.nextInt();

            scanner.nextLine(); // Boş satır okuma
            System.out.print("Cinsiyetinizi giriniz (Erkek/Kadın): ");
            String cinsiyet = scanner.nextLine();


            // Yaş ve cinsiyete göre mesajı belirleyin ve ekrana yazdırın
            if (yas < 18) {
                if (cinsiyet.equalsIgnoreCase("Erkek")) {
                    System.out.println("Genç bir erkeksiniz.");
                } else if (cinsiyet.equalsIgnoreCase("Kadın")) {
                    System.out.println("Genç bir kızsınız.");
                } else {
                    System.out.println("Geçerli bir cinsiyet girmediniz.");
                }
            } else {
                if (cinsiyet.equalsIgnoreCase("Erkek")) {
                    System.out.println("Yetişkin bir erkeksiniz.");
                } else if (cinsiyet.equalsIgnoreCase("Kadın")) {
                    System.out.println("Yetişkin bir kadınsınız.");
                } else {
                    System.out.println("Geçerli bir cinsiyet girmediniz.");
                }
            }
        }
    }




