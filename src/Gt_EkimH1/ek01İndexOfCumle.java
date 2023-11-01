package Gt_Ekim_H1;

public class ek01İndexOfCumle {
    public static void main(String[] args) {

        String str = "Arama sonucunda 1434 kelimeye ulasildi";
        // arama sonuclarinin 100'den fazla oldugunu test edin
        // 100'den fazla ise "Test Passed",
        // 100'den fazla degilse "Test Failed" yazdirin

        str=str.replaceAll("\\D", "");
        System.out.println(str);

        int sonucSayisi=Integer.parseInt(str);

        if (sonucSayisi>100){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }




    }
}
