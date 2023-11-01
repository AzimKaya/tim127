package A_Eylul_H_1;

import java.util.Scanner;

public class e08_C01_ForLoop {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //      sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //      Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir baslangic tamsayisi giriniz");
        int basSayisi = scanner.nextInt();

        System.out.println("Lutfen pozitif bir bitis tamsayisi giriniz");
        int bitisSayisi = scanner.nextInt();

        int toplam = 0;

        if (bitisSayisi<basSayisi) {
            System.out.println("Baslangic sayisi bitis sayiyindan kucuk olamaz");
        } else {
            for (int i = basSayisi; i <= bitisSayisi;i++) {
                toplam += i;
            }

            System.out.println("Girilen sayilarin toplami:" + toplam);
        }

    }
}
