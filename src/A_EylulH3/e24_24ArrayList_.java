package A_Eylul_H3;

import java.util.ArrayList;
import java.util.List;

public class e24_24ArrayList_ {
    public static void main(String[] args) {


        List<Integer>sayilar=new ArrayList<>();

        System.out.println(sayilar);//[]

        System.out.println(sayilar.size());//0
        System.out.println("Liste bosmu: "+sayilar.isEmpty());


        sayilar.add(5);
        sayilar.add(0,7);
        System.out.println(sayilar);
        sayilar.size();
        System.out.println(sayilar.size());
        System.out.println("Liste bosmu: "+sayilar.isEmpty());

        System.out.println(sayilar.contains(5));
        System.out.println(sayilar.contains(9));

        sayilar.add(3);
        sayilar.add(3);
        sayilar.add(8);
        System.out.println(sayilar);

        List<Integer>rakamalar=new ArrayList<>();

        rakamalar.add(3);
        rakamalar.add(8);
        rakamalar.add(5);

        System.out.println(sayilar.containsAll(rakamalar));
        rakamalar.add(9);
        System.out.println(rakamalar);

        System.out.println(sayilar.containsAll(rakamalar));






    }
}
