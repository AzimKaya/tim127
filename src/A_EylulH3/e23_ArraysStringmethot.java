package A_Eylul_H3;

public class e23_ArraysStringmethot {
    public static void main(String[] args) {

        //Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran
        // bir method olusturun.

        String [] isimler = { "Zehra,Huseyin","Mehmet","Esra","Ercan","Omer,Ali" ,"Ali"};


            enUzunEnKisaYazdir(isimler);

    }

    public static void enUzunEnKisaYazdir(String[] arr){

        String enKisaİsim= arr[0];
        String enUzunİsim= arr[0];

        for (int i = 0; i <arr.length; i++) {

            if (arr[i].length()>enUzunİsim.length()){
                enUzunİsim=arr[i];
            }

            if (arr[i].length()<enKisaİsim.length()){
                enKisaİsim=arr[i];

            }
        }

        System.out.println("en uzun isim:"+enUzunİsim);
        System.out.println("en kısı isim:"+enKisaİsim);

    }
}
