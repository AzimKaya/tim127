package A_Eylul_H3;

import java.util.ArrayList;
import java.util.List;

public class e24_tamBolrnlerListesi {
    public static void main(String[] args) {


        //Soru 6- Verilen pozitif bir tamsayiyi,
        //        tam bolebilen tum pozitif tamsayilari
        //        bir liste olarak bize donduren bir method olusturun.

        System.out.println(tambollenlerListesi(50));
    }

    public static List<Integer>tambollenlerListesi(int sayi){

        List<Integer>tambolenlerListasi=new ArrayList<>();

        for (int i = 2; i <=sayi ; i++) {

            if (sayi%i==0){

                tambolenlerListasi.add(i);
            }

        }
        return tambolenlerListasi;
    }
}
