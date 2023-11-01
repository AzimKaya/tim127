package A_Ekim_H2;

import java.util.ArrayList;
import java.util.Scanner;

public class e_15Arraylist {
/*

Soru:Bir eğitim kurumu, kurs katılımcılarının bilgilerini saklamak istiyor.
 Her bir kurs için aşağıdaki bilgileri saklamak gerekiyor:

Kurs adı (String)
Katılımcıların adları (ArrayList)
Bu bilgileri saklamak için çift katmanlı bir ArrayList kullanarak bir Java programı yazın.
Program, kullanıcıdan kurs adını ve katılımcıların adlarını almalı ve bu bilgileri saklamalıdır.
Daha sonra bir kursun katılımcılarını listelemek için bir seçenek sunmalıdır.

    */

        public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            ArrayList<ArrayList>  kurslar = new ArrayList<>();

            while (true) {
                System.out.println("Kurs Yönetimi");
                System.out.println("1. Yeni Kurs Ekle");
                System.out.println("2. Kurs Katılımcılarını Listele");
                System.out.println("3. Çıkış");
                System.out.print("Seçiminizi yapın (1/2/3): ");

                int secim = scanner.nextInt();

                if (secim == 1) {
                    System.out.print("Kurs adını girin: ");
                    String kursAdi = scanner.next();

                    ArrayList<String> katilimcilar = new ArrayList<>();
                    System.out.println("Kurs katılımcılarının adlarını girin (bitirmek için 'q' girin):");
                    while (true) {
                        String katilimciAdi = scanner.next();
                        if (katilimciAdi.equals("q")) {
                            break;
                        }
                        katilimcilar.add(katilimciAdi);
                    }

                    ArrayList<String> kursBilgisi = new ArrayList<>();
                    kursBilgisi.add(kursAdi);
                    kursBilgisi.addAll(katilimcilar);
                    kurslar.add(kursBilgisi);
                    System.out.println("Kurs başarıyla eklendi.");
                } else if (secim == 2) {
                    System.out.println("Kurslar ve katılımcılar:");
                    for (ArrayList<String> kursBilgisi : kurslar) {
                        System.out.println("Kurs Adı: " + kursBilgisi.get(0));
                        System.out.println("Katılımcılar:");
                        for (int i = 1; i < kursBilgisi.size(); i++) {
                            System.out.println(kursBilgisi.get(i));
                        }
                        System.out.println();
                    }
                } else if (secim == 3) {
                    System.out.println("Programdan çıkılıyor.");
                    break;
                } else {
                    System.out.println("Geçersiz seçenek! Lütfen 1, 2 veya 3 seçin.");
                }
            }
        }




}
