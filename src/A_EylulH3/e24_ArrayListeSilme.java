package A_Eylul_H3;

import java.util.ArrayList;
import java.util.List;

public class e24_ArrayListeSilme {
    public static void main(String[] args) {

        // Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip,
        //         kalan kismini list olarak bize donduren bir method olusturun.




        List<String> isimler = new ArrayList<>();
        isimler.add("Deniz");
        isimler.add("Omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");
        isimler.add("Ayca");
        isimler.add("Ahmet");


        String silinecekHarf="a";

        System.out.println(istenmeyenleriSil(isimler, silinecekHarf));

    }

    public static List<String>istenmeyenleriSil(List<String>isimler,String silinecekHarf){

        List<String>silinmeyeceklerListesi=new ArrayList<>();

        for (int i = 0; i <isimler.size() ; i++) {


            if (!isimler.get(i).toUpperCase().contains(silinecekHarf.toUpperCase())){

                silinmeyeceklerListesi.add(isimler.get(i));
            }
        }

        return silinmeyeceklerListesi;

    }

}
