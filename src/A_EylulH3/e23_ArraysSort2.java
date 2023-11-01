package A_Eylul_H3;

import java.util.Arrays;

public class e23_ArraysSort2 {

    public static void main(String[] args) {

        int[] arr ={3,6,1,8,2,9,12,-1,4,3};

        // arr'de 5'in olup olmadigini ve varsa kac tane oldugunu yazdirin
        //C06_Arrays.elemanSayisiYazdir(arr,5); // Aranan eleman array'de yok
        // arr'de 3'in olup olmadigini ve varsa kac tane oldugunu yazdirin
        //C06_Arrays.elemanSayisiYazdir(arr,3); // Aranan eleman array'de 2 kere kullanilmis


        String[] isimler = {"Esra","Ibrahim","Huseyin","Omer","Azim"};
        // isimler'de Esra'nin olup olmadigini donduren bir method olusturun

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));
        System.out.println(Arrays.binarySearch(isimler, "Esra"));
        System.out.println(Arrays.binarySearch(isimler,"Azim"));


    }
}
