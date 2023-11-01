package A_Eylul_H3;

import java.util.ArrayList;
import java.util.List;

public class e24KısaYoldanArrayList {

    public static void main(String[] args) {

        int [] arr={3,2,5,6,7,2,8,9,0,1,2,3,4,7,5,4};

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);



        }
        System.out.print(sayilar);
    }
}
