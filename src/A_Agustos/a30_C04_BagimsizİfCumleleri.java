package AlıstırmalarAgustos;

public class a30_C04_BagimsizİfCumleleri {
    public static void main(String[] args) {

        int a=500;
        int b=40;

        // a'b'den buyuk mu?

        if (a>b){
            System.out.println("a ,b'den buyuk");
        }

        if ( a%2==0){
            System.out.println("a, cift sayi ");
        }

        //a cift sayi mi?
        if (a%5==0){
            System.out.println("a sayisi 5 ile tam bölunur");
        }
        //b 5 ile bolunur mu?

        if (a>=100 && a<=9999){
            System.out.println("a 3 basamakli bir sayidir");
        }
        // a 3 basamakli bir sayi?

        boolean sart =a+b>100;

        if (sart){
            System.out.println("a+b 'nin toplami  100'den buyuk");
        }


        // a ile b'nin toplami 100'Den buyuk mu?

    }
}
