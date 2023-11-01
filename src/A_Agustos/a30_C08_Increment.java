package AlıstırmalarAgustos;

public class a30_C08_Increment {
    public static void main(String[] args) {


        int sayi1=10;

        sayi1++;
        System.out.println(sayi1);

        int sayi2=10;
        sayi2--;
        System.out.println(sayi2);

        System.out.println("=======================================");

        // a'nin degerini yazdirip sonra anin degerini 1 arttirip
        // olusturacaginiz b veriable'e yazdirin

        int a=20;

        System.out.println("a:"+a);

        a+=1;

        int b=a;

        System.out.println("islem sonucunda a : " + a +" b : " + b);

        a=20;

        // a'nin degerini bye atayip sonra
        // a'nin degerini bir arttirin

        b=a;

        a+=1;

        System.out.println("islem sonucunda a : " + a +" b : " + b);

        System.out.println("00000000000000000000000000000000000000");

        a=20;
        b=a++;

        System.out.println("a++ islem sonucunda a : " + a +" b : " + b);

        a=20;
        b=++a;

        System.out.println("++a islem sonucunda a : " + a +" b : " + b);

        System.out.println("==============================================");

        int c=40;

        System.out.println("c++ ile yazdirinca :"+ c ++);
        System.out.println("c++ bir alt satirda c'nin degeri:"+c);

        c=40;

        System.out.println("++c ile yazdirinca :"+ ++c);
        System.out.println("++c bir alt satirda c'nin degeri:"+c);

        System.out.println("_______________________________________");







    }
}
