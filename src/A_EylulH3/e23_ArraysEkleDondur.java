package A_Eylul_H3;

import java.util.Arrays;

public class e23_ArraysEkleDondur {

    public static void main(String[] args) {

        //Soru 7- Verilen bir array’e
        //        istenen bir elemani ekleyip bize donduren bir method yazin,
        //        eski array’e yeni degeri atayin.

        int[]arr1={4,5,6,7};
        int[] yeniArr={4,5,6,7,8};
        System.out.println(Arrays.toString(arr1));
        arr1=yeniArr;
        System.out.println(Arrays.toString(arr1));


      arr1= arrayeElemanEkle(arr1,10) ;
        System.out.println(Arrays.toString(arr1));

    }
    public  static int[] arrayeElemanEkle(int[]arr ,int eklenecekEleman){
        int[]yeniArr=new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];

            yeniArr[yeniArr.length-1]=eklenecekEleman;

        }


return yeniArr;

    }
}
