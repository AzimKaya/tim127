package A_Eylul_H4;

import java.util.Scanner;

public class e02_ÇalışmaGunleri {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen gun ismini giriniz");

        String gunİsmi= scanner.nextLine().toUpperCase();

        switch (gunİsmi){
            case "pazartesi":
                System.out.println("Bu gun calişma gunu tatile 5 gun kaldi");
                break;
            case "sali":
                System.out.println("Bu gun calişma gunu tatile 4 gun kaldi");
                break;
            case "carsamba":
                System.out.println("Bu gun calişma gunu tatile 3 gun kaldi");
                break;
            case "persembe":
                System.out.println("Bu gun calişma gunu tatile 2 gun kaldi");
                break;
            case "cuma":
                System.out.println("Bu gun calişma gunu tatile 1 gun kaldi");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Bu gun dinlenme gunu");
                break;
            default:
                System.out.println("Gecerli bir gun ismi giriniz");


        }


    }
}
