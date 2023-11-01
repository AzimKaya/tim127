package A_Eylul_H_2;

import java.util.Scanner;

public class e16_DowhileLoop_TamKare {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir pozitif sayi isteyin,
        //        sayının tam kare olup olmadığını bulunuz,
        //        tamkare ise degeri, tam kare degilse uyari yazdirin.
        //        Ornek :  input : 16, output: 4
        //                 input : 23  output: tamkare degil

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz ");
        int girilenSayi =scanner.nextInt();

        int karakok =1;

        do {
            if (karakok*karakok==girilenSayi){

                System.out.println("Girilen bir tamkare ,karakok degeri :"+karakok);
            }

            karakok++;

        }while (karakok*karakok<=girilenSayi);





    }
}
