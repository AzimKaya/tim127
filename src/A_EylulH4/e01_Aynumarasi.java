package A_Eylul_H4;

import java.util.Scanner;

public class e01_Aynumarasi {

    public static void main(String[] args) {

        // kullanıcıdan ay numarasını alıp ay ismini giriniz


        Scanner scanner =new Scanner(System.in);

        System.out.println("Lutfen ay numarasi giriniz");

        int ayNo= scanner.nextInt();

        switch (ayNo){
            case 1:
                System.out.println("Ocak ayi");
                break;
            case 2:
                System.out.println("Subat ayi");
                break;
            case 3:
                System.out.println("Mart ayi");
                break;
            case 4:
                System.out.println("Nisan ayi");
                break;
            case 5:
                System.out.println("Mayis ayi");
                break;
            case 6:
                System.out.println("Haziran ayi");
                break;
            case 7:
                System.out.println("Temmuz ayi");
                break;
            case 8:
                System.out.println("Agustos ayi");
                break;
            case 9:
                System.out.println("Eylul ayi");
                break;
            case 10:
                System.out.println("Ekim ayi");
                break;
            case 11:
                System.out.println("Kasim ayi");
                break;
            case 12:
                System.out.println("Aralik ayi");
                break;
            default:
                System.out.println("Gecersiz ay numarasi girdiniz");







        }


    }


}
