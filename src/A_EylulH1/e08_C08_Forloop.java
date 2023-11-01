package A_Eylul_H_1;

import java.util.Scanner;

public class e08_C08_Forloop {

    public static void main(String[] args) {

        //Kullacidan pozitif bir tamsayi degeri isteyin
        //o sayiya kadar olan tum pozitif tamsayilarin toplamini yazdiriniz

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi=scanner.nextInt();

        int toplam=0;

        for (int i = 1; i <=sayi; i++) {

            toplam+=i;

        }
        System.out.println(sayi+"ye kadar olan pozitif tamsayilarin toplami:"+toplam);
    }
}
