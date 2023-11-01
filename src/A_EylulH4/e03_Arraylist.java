package A_Eylul_H4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class e03_Arraylist {
    public static void main(String[] args) {
//Soru 2- Kullanicidan istedigi kadar isim alip,
//        Q’ya bastiginda girdigi isimleri
//        bize liste olarak dondurecek bir method olusturun.


        System.out.println(listeOlustur());

    }

    public static List<String> listeOlustur(){

        List<String>isimler=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        String girilenİsim;

        do {
            System.out.println("Listeye eklemek için bir isimyazin"+
                    "\n veya islemi sonlandirmak icin q ya basin");
            girilenİsim=scanner.nextLine();

            if (!girilenİsim.equalsIgnoreCase("q")){
                isimler.add(girilenİsim);
            }



        }while (!girilenİsim.equalsIgnoreCase("q"));

        return isimler;
    }
}
