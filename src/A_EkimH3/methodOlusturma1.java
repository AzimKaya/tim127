package A_Ekim_H3;

public class methodOlusturma1 {
    public static void main(String[] args) {

        String isim="azim";
        String soyİsim="kaya";



       String isimSoyisim=isimDuzenle(isim,soyİsim);
        System.out.println("ilk girilen :"+isim +" "+soyİsim);
        System.out.println("Degistirilmiş hali:"+isimSoyisim);

    }

    private static String isimDuzenle(String isim,String soyİsim){

        String isimDuzenlenmis=isim.substring(0,1).toUpperCase()+
                isim.substring(1).toLowerCase();

        String soyİsimDuzenlenmis=soyİsim.substring(0,1).toUpperCase()+
                soyİsim.substring(1).toLowerCase();



        return isimDuzenlenmis+" "+soyİsimDuzenlenmis;

    }

}
