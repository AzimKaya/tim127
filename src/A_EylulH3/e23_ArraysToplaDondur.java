package A_Eylul_H3;

public class e23_ArraysToplaDondur {
    public static void main(String[] args) {

        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz.

        int[]arr ={3,-5,4,2,-6,-7,8,3,-1,8};

        System.out.println(pozitifSayilariToplaDondur(arr));
    }

    public  static  int pozitifSayilariToplaDondur(int[] arr){

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

        if (arr[i]>0){

            toplam+=arr[i];
        }


        }
        return toplam;

    }
}
