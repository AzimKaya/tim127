package Gt_Ekim_H1;

public class ek03_ArrayMDA {
    public static void main(String[] args) {

        int[] [] arr2 = { {1,4,7},{3,5},{1,9,0,8},{2},};
        for (int i = 0; i <arr2.length ; i++) {

            for (int j = 0; j < arr2[i].length ; j++) {

                System.out.print(arr2[i][j] + " ");//1 4 7 3 5 1 9 0 8 2

            }

        }
    }
}
