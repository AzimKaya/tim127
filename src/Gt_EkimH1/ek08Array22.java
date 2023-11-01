package Gt_Ekim_H1;

import java.util.ArrayList;

public class ek08Array22 {

//: Bir öğrenci listesi üzerinde çalışıyoruz ve bu öğrencilerin isimlerini
// bir ArrayList içinde saklamak istiyoruz. Ardından, bu öğrenci listesine öğrenci eklemek,
// öğrenci çıkarmak ve listeyi görüntülemek gibi işlemleri yapmak istiyoruz.

    public static void main(String[] args) {

        // Öğrenci isimlerini saklamak için bir ArrayList oluşturun

        ArrayList<String> ogrenciListesi = new ArrayList<>();

        // Öğrenci eklemek

        ogrenciListesi.add("Ali");
        ogrenciListesi.add("Ayşe");
        ogrenciListesi.add("Mehmet");

        // Öğrenci listesini görüntülemek

        System.out.println("Öğrenci Listesi:");
        for (String ogrenci : ogrenciListesi) {
            System.out.println(ogrenci);
        }

        // Öğrenci çıkarmak
        ogrenciListesi.remove("Ayşe");

        // Güncellenmiş öğrenci listesini görüntülemek
        
        System.out.println("Güncellenmiş Öğrenci Listesi:");
        for (String ogrenci : ogrenciListesi) {
            System.out.println(ogrenci);
        }
    }

}







