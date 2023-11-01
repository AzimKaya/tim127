package Gt_Eylul_H4;

import java.util.Scanner;

public class ekD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir tam sayı alın
        System.out.print("Bir tam sayı girin: ");
        int n = scanner.nextInt();

        // Faktöriyel hesaplama işlemi
        long faktoriyel = 1; // Faktöriyeli saklamak için long veri tipi kullanıyoruz

        for (int i = 1; i <= n; i++) {
            faktoriyel *= i;
        }

        // Sonucu ekrana yazdır
        System.out.println(n + " faktöriyel = " + faktoriyel);
    }
}
    //Bu kod, kullanıcıdan bir tam sayı alır, bu sayının faktöriyelini hesaplar ve sonucu ekrana yazdırır. Örneğin, kullanıcı 5'i girdiğinde, çıktıda "5 faktöriyel = 120" gibi bir sonuç görürsünüz. Bu, 5'in faktöriyelini doğru bir şekilde hesapladığımızı gösterir.











