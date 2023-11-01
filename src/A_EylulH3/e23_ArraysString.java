package A_Eylul_H3;

public class e23_ArraysString {
    public static void main(String[] args) {

        // Verilen String bir array'de
        // istenen harfi iceren elementleri yazdirin

        String [] isimler = { "Huseyin","Mehmet","Esra","Ercan","Omer"};
        String istenenHarf="e";



        for (int i = 0; i < isimler.length; i++) {


           if (isimler[i].contains(istenenHarf)){
               System.out.print(isimler[i]+" ");
           }


        }

    }


}
