package A_Eylul_H4;

import java.util.ArrayList;
import java.util.Scanner;

public class e04_Arraylist {

    public static void main(String[] args) {

        //Soru 2- Kullanicidan istedigi kadar isim alip,
//        Q’ya bastiginda girdigi isimleri
//        bize liste olarak dondurecek bir method olusturun.


        System.out.println(listeolustur());
    }

    public static ArrayList<String> listeolustur(){

        ArrayList<String>isimler=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        String girilenisim;

        do {
            System.out.println("Listeye eklemek istediginiz ismi giriniz,islemi sonlandırmak icin qya basiniz");

            girilenisim=scanner.nextLine();
            if (!girilenisim.equalsIgnoreCase("q")){
                isimler.add(girilenisim);

            }


        }while (!girilenisim.equalsIgnoreCase("q"));


        return isimler;
    }
}
