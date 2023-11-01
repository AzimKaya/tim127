package A_Ekim_H2;

import java.util.ArrayList;
import java.util.Scanner;

public class e15_ArraylistArkadas {

        public static void main(String[] args) {



            ArrayList<String> arkadaslar = new ArrayList<>();

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Arkadaş Listesi");
                System.out.println("1. Yeni Arkadaş Ekle");
                System.out.println("2. Arkadaşları Görüntüle");
                System.out.println("3. Arkadaş Sil");
                System.out.println("4. Çıkış");
                System.out.print("Seçiminizi yapın (1/2/3/4): ");
                int secim = scanner.nextInt();

                if (secim == 1) {
                    scanner.nextLine(); // Önceki satırı tüket
                    System.out.print("Yeni arkadaşın adını girin: ");
                    String yeniArkadas = scanner.nextLine();
                    arkadaslar.add(yeniArkadas);
                    System.out.println(yeniArkadas + " başarıyla arkadaş listesine eklendi.");
                } else if (secim == 2) {
                    arkadaslariGoruntule(arkadaslar);
                } else if (secim == 3) {
                    scanner.nextLine(); // Önceki satırı tüket
                    System.out.print("Silmek istediğiniz arkadaşın adını girin: ");
                    String silinecekArkadas = scanner.nextLine();
                    if (arkadaslar.remove(silinecekArkadas)) {
                        System.out.println(silinecekArkadas + " başarıyla arkadaş listesinden silindi.");
                    } else {
                        System.out.println(silinecekArkadas + " arkadaş listesinde bulunamadı.");
                    }
                } else if (secim == 4) {
                    System.out.println("Programdan çıkılıyor.");
                    break;
                } else {
                    System.out.println("Geçersiz seçenek! Lütfen 1, 2, 3 veya 4 seçin.");
                }
            }
        }

        public static void arkadaslariGoruntule(ArrayList<String> arkadaslar) {
            if (arkadaslar.isEmpty()) {
                System.out.println("Arkadaş listesi boş.");
            } else {
                System.out.println("Arkadaşlar:");
                for (String arkadas : arkadaslar) {
                    System.out.println(arkadas);
                }
            }
        }
    }

