package A_Eylul_H_1;

public class e08_C07_Forloop {

    public static void main(String[] args) {


        // 200den baslayip 270'e kaadar (sinirlar dahil )3'er 3'er atlayarak yazdirin

        for (int i = 200; i <=270 ; i++) {
            if (i%7==0)
            System.out.print(i+" ");

        }
        // 100den baslayip 200'e kaadar (sinirlar dahil ) cift sayilari yazdirin

        for (int i = 100; i <=200 ; i+=2) {

            System.out.print( i + " ");

        }

        System.out.println("================= ");

        // 100den baslayip 200'e kaadar (sinirlar dahil ) cift sayilari yazdirin

        for (int i = 100; i <= 200; i++) {

            if (i%2==0){

                System.out.print(i+" ");
            }
        }
        System.out.println(" ???????????????????????????? ");
        // 200den baslayip 270'e kaadar (sinirlar dahil )3'er 3'er atlayarak yazdirin

        for (int i = 200; i <=270 ; i++) {
            if (i%7==0){
                System.out.print(i+" ");
            }
        }

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%");
           // 200den baslayip 150'e kaadar (sinirlar dahil )3'er 3'er atlayarak yazdirin
        for (int i = 200; i >=150 ; i-=3) {
            System.out.print(i+" ");
        }
        System.out.println(" ");
        // 200den baslayip 150'e kaadar (sinirlar dahil )3'er 3'er atlayarak yazdirin
        for (int i = 200; i >=150 ; i--) {

           if (i%3==0){
               System.out.print(i+" ");
           }
        }

    }
}
