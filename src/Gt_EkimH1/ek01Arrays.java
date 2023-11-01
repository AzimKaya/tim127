package Gt_Ekim_H1;

public class ek01Arrays {

    public static void main(String[] args) {

//Verilen int array’deki her elementin karelerini alip,
// karelerinin toplamini  yazdiran bir method olusturun.


        int[] arr = {1, 2, 3, 4, 2};


karelrinToplami(arr);

    }

    public static void  karelrinToplami(int[] arr){

   int toplam=0;


        for (int i = 0; i < arr.length; i++) {

            int Toplami= arr[i]*arr[i];

            toplam *= Toplami ;
        }

        System.out.println("Elementlerinin karelerinin toplami:"+toplam);
    }

}
