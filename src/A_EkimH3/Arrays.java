package A_Ekim_H3;

import java.util.Scanner;

public class Arrays {



        public static void main(String[] args) {
            // Kelime dizisini oluşturun
            String[] kelimeDizisi = {"elma", "armut", "çilek", "kiraz"};

            // Kullanıcıdan kelimeyi girmesini isteyin
            Scanner scanner = new Scanner(System.in);
            System.out.print("Aranan kelimeyi girin: ");
            String arananKelime = scanner.nextLine();


            // Kelimenin dizide olup olmadığını kontrol edin
            boolean kelimeVarMi = false;
            for (String kelime : kelimeDizisi) {
                if (kelime.equals(arananKelime)) {
                    kelimeVarMi = true;
                    break;
                }
            }

            // Sonucu ekrana yazdırın
            if (kelimeVarMi) {
                System.out.println(arananKelime + " dizide bulunuyor.");
            } else {
                System.out.println(arananKelime + " dizide bulunmuyor.");
            }




        }


    }

