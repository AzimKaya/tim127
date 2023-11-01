package A_Eylul_H3;

public class e23_MDA_TumElementlerTop {
    public static void main(String[] args) {


        // Verilen bir MDA'deki tum sayilari toplayip, toplami yazdiran bir method olusturun

        int[][] arr = {{1,4,7},{3,5},{1,9,0,8},{2}};

        tumsyilariToplayazdir(arr);

        tumsyilariToplayazdir(new int[][]{{4,6,7}});

    }

    public static void tumsyilariToplayazdir(int[][] arr){
        int toplam=0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                toplam +=arr[i][j];

            }

        }
        System.out.println("MDA'daki sayilarin toplami: "+toplam);
    }
}
