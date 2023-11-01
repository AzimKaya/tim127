package Gt_Ekim_H1;

public class ek08ArrayS {

    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 2, 8, 2, 4,4,1,5,4};
        int arananSayi = 4; // Aranacak olan sayı

        int tekrarSayisi = tekrarSayisiBul(arr, arananSayi);

        System.out.println(arananSayi + " sayısı dizide " + tekrarSayisi + " kez tekrarlanıyor.");
    }

    public static int tekrarSayisiBul(int[] arr, int arananSayi) {
        int tekrarSayisi = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arananSayi) {
                tekrarSayisi++;
            }
        }

        return tekrarSayisi;


    }

}
