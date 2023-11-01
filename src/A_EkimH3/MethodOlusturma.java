package A_Ekim_H3;

public class MethodOlusturma {
    public static void main(String[] args) {
        //Soru 2- Imput olarak verilen satis fiyatı,musteri karti var mı?
        //        ve uyeliği kac yıllık ?bilgilerini degerlendirip
        //        -uye degilse %5 indirim
        //        -uyeliğ var ama 5 yıldan az ise %10 indirim
        //        -uyeliği var ve 5 yıldan cok ise %15 indirim uygulayip
        //        asıl fiyatı ,indirim miktarını ve indirimli fiyati yazdiran bir method olusturun

        boolean uyeMi=false;
        int uyelikYıklı=13;
        double satısFiyatı=250;

        indirimliSatısFiyatıHesapla(uyeMi,uyelikYıklı,satısFiyatı);

    }

    private static void indirimliSatısFiyatıHesapla(  boolean uyeMi,int uyelikYıklı,double satısFiyatı) {

        if (uyeMi){
            if (uyelikYıklı<5){
                System.out.println("urun fiyatı:"+satısFiyatı);
                System.out.println("İndirim miktari:"+satısFiyatı*0.01);
                System.out.println("İndirimli fiyat:"+(satısFiyatı-satısFiyatı*0.01));
            }else {
                System.out.println("urun fiyatı:"+satısFiyatı);
                System.out.println("İndirim miktari:"+satısFiyatı*0.05);
                System.out.println("İndirimli fiyat:"+(satısFiyatı-satısFiyatı*0.15));

            }


        }else {
            System.out.println("urun fiyatı:"+satısFiyatı);
            System.out.println("İndirim miktari:"+satısFiyatı*0.05);
            System.out.println("İndirimli fiyat:"+(satısFiyatı-satısFiyatı*0.15));
        }
    }
}
