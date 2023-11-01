package A_Eylul_H4;

import java.util.ArrayList;
import java.util.List;

public class e05_Araylisİsimler {

    public static void main(String[] args) {

        //Soru 6- Verilen pozitif bir tamsayiyi,
        //        tam bolebilen tum pozitif tamsayilari
        //        bir liste olarak bize donduren bir method olusturun.


        System.out.println(tambolenlerListesi(100));

    }

    public static List<Integer>tambolenlerListesi(int sayi){

        List<Integer>tambolenlerListesi=new ArrayList<>();
        tambolenlerListesi.add(1);

        for (int i = 1; i <sayi ; i++) {

            if (sayi%i==0){
                tambolenlerListesi.add(i);

            }

        }
        return tambolenlerListesi;
    }


}
