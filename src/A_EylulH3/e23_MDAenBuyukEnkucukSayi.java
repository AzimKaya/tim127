package A_Eylul_H3;

public class e23_MDAenBuyukEnkucukSayi {
    public static void main(String[] args) {

        // Verilen bir MDA'de en buyuk ve en kucuk sayilari bulup, yazdiran
        // bir method olusturun

        int[][] arr = {{1,4,7},{3,5},{1,-9,0,8},{2}};

        enbyukEnkucukElementBulma(arr);

    }

    public static void enbyukEnkucukElementBulma(int[][] arr){

        int maximumElement=arr [0][0];
        int minumumElement=arr [0][0];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j]>maximumElement){
                    maximumElement=arr[i][j];
                }

                if (arr[i][j]<minumumElement){
                    minumumElement=arr[i][j];

                }

            }

        }

        System.out.println("Arraydaki  en buyuk element :"+maximumElement);
        System.out.println("Arraydaki  en kucuk element :"+minumumElement);
    }
}
