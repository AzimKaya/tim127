package A_Eylul_H3;

public class e23_Arrays2 {
    public static void main(String[] args) {

        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //         ve varsa kac kere kullanildigini yazdiran bir method olusturun.



        int[] arr = {3,4,2,6,5,4,5,7,8,2,3,9};
        int arananSayi = 2;

        elemanSyisiYazdir(arr,2);
        elemanSyisiYazdir(arr,7);



    }
    public static void elemanSyisiYazdir(int[] arr,int arananSayi  ){


        int sayac=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==arananSayi){

                sayac++;
            }

        }

        if (sayac==0){
            System.out.println("Aranan eleman Array'da yok");
        }else {
            System.out.println("Aranan eleman arrayda "+ sayac+ "kere kullanılmıs");
        }

    }

}
