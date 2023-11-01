package Gt_Ekim_H1;

public class ek08ArrayS1 {
    public static void main(String[] args) {

        //Bir dizi içinde verilen bir sayının kaç kez tekrarlandığını bulan
        // bir Java programı yazın. Örneğin, verilen bir dizide (5, 2, 7, 2, 8, 2, 4) sayısının
        // kaç kez tekrarlandığını bulan bir program yazmalısınız.

        int[] arr = {5, 2, 7, 2, 8, 2, 4,4,1,5,4,2,2};
        int arananSayi = 2;
       // int tekrarSayisi = arananSayibul(arr, arananSayi);
        //System.out.println("Tekrar sayisi:"+tekrarSayisi);
arananSayibul(arr,2);

    }
    public static void arananSayibul (int arr [],int arananSayi){
        int tekrarsayisi=0;
        for (int i = 0; i < arr.length; i++) {

            if (arananSayi==arr[i]){
                tekrarsayisi++;
            }
        }
        //return tekrarsayisi;

        System.out.println("Tekrar sayisi:"+tekrarsayisi);
    }
}
