package A_Eylul_H3;

import java.util.Arrays;

public class e23_MultiDimensionalArrays {
    public static void main(String[] args) {

        int [] arr={3,6,8,1};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }

        System.out.println("--------");
        System.out.println(Arrays.toString(arr));
        System.out.println("  -------");

        int[][] sayilar = {{3,5,6},{2,7},{1,5,8},{1}};

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {


                System.out.print(sayilar[i][j]+" ");

            }

        }
        System.out.println("88888888888");
        System.out.println(Arrays.deepToString(sayilar));

        

    }
}
