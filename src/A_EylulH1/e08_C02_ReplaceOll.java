package A_Eylul_H_1;

public class e08_C02_ReplaceOll {
    public static void main(String[] args) {


        // arama sonuclarinin 100'den fazla oldugunu test edin
        // 100'den fazla ise "Test Passed",
        // 100'den fazla degilse "Test Failed" yazdirin


        String str = "Arama sonucunda 1434 kelimeye ulasildi";

        str=str.replaceAll("\\D","");

        System.out.println(str);

        int sonucSayisi=Integer.parseInt(str);

        if (sonucSayisi>100){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test faid");
        }


    }



}
