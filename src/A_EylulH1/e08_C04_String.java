package A_Eylul_H_1;

import java.util.Scanner;

public class e08_C04_String {

    public static void main(String[] args) {

        //Soru 1    : Kullanicidan bir cumle alin
        //          - cumlede ev geciyorsa, "home home sweet home" yazdirin
        //          - cumlede is geciyorsa, "calismak guzeldir"
        //          - ikisini de iceriyorsa "Hem ev lazim hem is"
        //          - hicbirini icermiyorsa "cok calisman lazim" yazdirin


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String girilenCumle=scanner.nextLine();

        String buyukcumle= girilenCumle.toUpperCase();

        if (buyukcumle.contains("EV") && buyukcumle.contains("IS")){
            System.out.println("Hem ev lazim hem is");
        } else if (buyukcumle.contains("EV")) {
            System.out.println("home home sweet home");
        } else if (buyukcumle.contains("IS")) {
            System.out.println("calismak guzeldir");
        }else {
            System.out.println("cok calisman lazim");
        }

    }


}
