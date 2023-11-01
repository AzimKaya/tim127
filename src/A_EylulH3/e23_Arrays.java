package A_Eylul_H3;

import java.util.Arrays;

public class e23_Arrays {
    public static void main(String[] args) {

        // verilen int bir array'deki
        // tum elementlerin degerlerini 2 artirin

        int [] arr={3,5,7,10,12};

        System.out.println("Array'in ilk hali:"+ Arrays.toString(arr));


        for (int i = 0; i < arr.length ; i++) {

            arr[i] += 2;

        }

        System.out.println("Array'in son hali:"+ Arrays.toString(arr));

    }
}
