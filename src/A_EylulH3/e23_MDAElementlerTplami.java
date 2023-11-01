package A_Eylul_H3;

public class e23_MDAElementlerTplami {
    public static void main(String[] args) {

        // verilen bir MDA'de
        // her inner array'in ilk elementlerinin toplamini
        // bize donduren bir method olusturun

        int[][] arr = {{1,4,7},{3,5},{1,-9,0,8},{5,2}};

        System.out.println(ilkElementlerTopolami(arr));


    }
    public  static int ilkElementlerTopolami(int[][] arr){
        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            toplam+=arr[i][0];
        }

        return toplam;

    }


}
