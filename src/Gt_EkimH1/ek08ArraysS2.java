package Gt_Ekim_H1;

public class ek08ArraysS2 {




    public static void main(String[] args) {

        //Sorun: Verilen bir tam sayı dizisinde (array) en büyük ve en küçük sayıları bulan
        // bir Java programı yazın. Örneğin,
        // verilen dizide (1,5, 2, 7, 2, 8, 2, 4,9) en büyük sayı 8, en küçük sayı ise 2'dir


        int[] arr = {1,5, 2, 7, 2, 8, 2, 4,9};

        int enBuyuk = enBuyukBul(arr);
        int enKucuk = enKucukBul(arr);

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }

    public static int enBuyukBul(int[] arr) {
        int enBuyuk = arr[0]; // Dizinin ilk elemanını en büyük olarak kabul ediyoruz

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > enBuyuk) {
                enBuyuk = arr[i];
            }
        }

        return enBuyuk;
    }

    public static int enKucukBul(int[] arr) {
        int enKucuk = arr[0]; // Dizinin ilk elemanını en küçük olarak kabul ediyoruz

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < enKucuk) {
                enKucuk = arr[i];
            }
        }

        return enKucuk;
    }
}
