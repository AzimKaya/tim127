package alıştırmalar;

public class A02_alistirma_day_05_pre_postİncremen {
    public static void main(String[] args) {

        int a=10;

        System.out.println("a'nin degeri:"+ ++a);

        int b=a++;

        System.out.println("b'nin degeri:"+b);

        int c=b++ +a;

        System.out.println("c'nin degeri:"+c);

        System.out.println("Son toplam:"+(a+b+c));


    }
}
