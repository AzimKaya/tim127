package A_Eylul_H3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class e23Arraylist {
    public static void main(String[] args) {

        int [] arr={3,2,5,6,7,2,8,9,0,1,2,3,4,7,5,4};

        List<Integer>uniqList=new ArrayList<>();

        System.out.println(uniqList);

        for (int i = 0; i < arr.length; i++) {

            if (!uniqList.contains(arr[i])){
                uniqList.add(arr[i]);
            }

        }
        System.out.println("Uniqui list:"+uniqList);

        int[] yeniArr=new int[uniqList.size()];

        System.out.println(Arrays.toString(yeniArr));


        System.out.println("Arrayin son hali:"+Arrays.toString(arr));

        for (int i = 0; i < yeniArr.length; i++) {

            yeniArr[i]=uniqList.get(i);

        }
        arr=yeniArr;

        Arrays.sort(arr);

        System.out.println("Arraysin en son hali :"+ Arrays.toString(arr));




    }
}
