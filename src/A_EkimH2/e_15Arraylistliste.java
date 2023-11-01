package A_Ekim_H2;

import java.util.ArrayList;
import java.util.Scanner;

public class e_15Arraylistliste {


    public static void main(String[] args) {

        ArrayList<String> alisverisListesi = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Alışveriş Listesi");
            System.out.println("1. Yeni Öğe Ekle");
            System.out.println("2. Öğeleri Görüntüle");
            System.out.println("3. Öğe Sil");
            System.out.println("4. Alışverişi Tamamla");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminizi yapın (1/2/3/4/5): ");
            int secim = scanner.nextInt();

            if (secim == 1) {
                scanner.nextLine(); // Önceki satırı tüket
                System.out.print("Yeni öğeyi girin: ");
                String yeniOge = scanner.nextLine();
                alisverisListesi.add(yeniOge);
                System.out.println(yeniOge + " başarıyla alışveriş listesine eklendi.");


            } else if (secim == 2) {
                ogeleriGoruntule(alisverisListesi);
            } else if (secim == 3) {
                scanner.nextLine(); // Önceki satırı tüket
                System.out.print("Silmek istediğiniz öğeyi girin: ");
                String silinecekOge = scanner.nextLine();
                if (alisverisListesi.remove(silinecekOge)) {
                    System.out.println(silinecekOge + " başarıyla alışveriş listesinden silindi.");
                } else {
                    System.out.println(silinecekOge + " alışveriş listesinde bulunamadı.");
                }
            } else if (secim == 4) {
                alisverisListesi.clear();
                System.out.println("Alışveriş listesi başarıyla temizlendi.");
            } else if (secim == 5) {
                System.out.println("Programdan çıkılıyor.");
                break;
            } else {
                System.out.println("Geçersiz seçenek! Lütfen 1, 2, 3, 4 veya 5 seçin.");
            }
        }
    }

    public static void ogeleriGoruntule(ArrayList<String> liste) {
        if (liste.isEmpty()) {
            System.out.println("Alışveriş listesi boş.");
        } else {
            System.out.println("Alışveriş Listesi:");
            for (String oge : liste) {
                System.out.println(oge);
            }
        }
    }
}




