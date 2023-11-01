package A_Eylul_H_2;

public class e16_DowhileLoop1 {
    public static void main(String[] args) {

        // do-while loop ile verilen sayidan baslayip, birer azaltarak
        // 3'e kadar olan sayilari yazdirin
        int sayi=10;


        do {

            System.out.print(sayi+" " );
            sayi--;
        }while (sayi>3);

        System.out.println("");

        sayi=2;

        do {
            System.out.println(sayi+" ");
            sayi--;
        }while (sayi>3);

        sayi=2;
        while (sayi>3){

            System.out.println("while loop ile");
            System.out.println(sayi+" ");
            sayi--;

        }



    }


}
